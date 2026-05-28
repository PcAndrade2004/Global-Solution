package model;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitor {

    private String nomeSistema;
    private String versao;
    private List<Previsao> previsoes;

    public SistemaMonitor(String nomeSistema, String versao) {
        this.nomeSistema = nomeSistema;
        this.versao = versao;
        this.previsoes = new ArrayList<>();
    }

    public void adicionarPrevisao(Previsao previsao) {
        previsoes.add(previsao);
    }

    public List<Previsao> buscarPorRegiao(String nomeRegiao) {
        List<Previsao> resultado = new ArrayList<>();
        for (Previsao p : previsoes) {
            if (p.getRegiao().getNome().equalsIgnoreCase(nomeRegiao)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public String gerarRelatorioGeral() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("\n===================================\n");
        relatorio.append("  RELATÓRIO GERAL - ").append(nomeSistema).append("\n");
        relatorio.append("  Versão: ").append(versao).append("\n");
        relatorio.append("===================================\n");

        if (previsoes.isEmpty()) {
            relatorio.append("Nenhuma previsão cadastrada.\n");
        } else {
            for (Previsao p : previsoes) {
                relatorio.append(p.gerarAlerta());
                relatorio.append("-----------------------------------\n");
            }
        }
        return relatorio.toString();
    }

    public String calcularEstatisticas() {
        if (previsoes.isEmpty()) {
            return "Nenhuma previsão cadastrada para calcular estatísticas.";
        }

        double somaTemperatura = 0;
        double somaUmidade = 0;
        double somaIndiceCalor = 0;

        for (Previsao p : previsoes) {
            somaTemperatura += p.getTemperatura();
            somaUmidade += p.getUmidade();
            somaIndiceCalor += p.calcularIndiceCalor();
        }

        int total = previsoes.size();
        double mediaTemperatura = somaTemperatura / total;
        double mediaUmidade = somaUmidade / total;
        double mediaIndiceCalor = somaIndiceCalor / total;

        return "\n===================================\n" +
                "  ESTATÍSTICAS DO SISTEMA\n" +
                "===================================\n" +
                "| Total de Previsões  : " + total + "\n" +
                "| Média Temperatura   : " + String.format("%.1f", mediaTemperatura) + "°C\n" +
                "| Média Umidade       : " + String.format("%.1f", mediaUmidade) + "%\n" +
                "| Média Índice Calor  : " + String.format("%.2f", mediaIndiceCalor) + "\n" +
                "===================================\n";
    }

    @Override
    public String toString() {
        return "\n[ SISTEMA DE MONITORAMENTO ]" + "\n" +
                "| Nome    : " + nomeSistema + "\n" +
                "| Versão  : " + versao + "\n" +
                "| Total de Previsões: " + previsoes.size() + "\n";
    }

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public List<Previsao> getPrevisoes() {
        return previsoes;
    }
}