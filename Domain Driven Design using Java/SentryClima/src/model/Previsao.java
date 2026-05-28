package model;

public class Previsao {

    private String dataPrevisao;
    private double temperatura;
    private double umidade;
    private Regiao regiao;

    public Previsao(String dataPrevisao, double temperatura, double umidade, Regiao regiao) {
        this.dataPrevisao = dataPrevisao;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.regiao = regiao;
    }

    public double calcularIndiceCalor() {
        double indiceCalor = temperatura + (0.33 * umidade) - 4.00;
        return indiceCalor;
    }

    public AlertaIndiceCalor classificarClima() {
        double indice = calcularIndiceCalor();

        if(indice >= 125) {
            return AlertaIndiceCalor.PERIGO_EXTREMO;
        } else if(indice >= 103) {
            return AlertaIndiceCalor.PERIGO;
        } else if(indice >= 90) {
            return AlertaIndiceCalor.EXTREMO_CAUTELA;
        } else if(indice >= 80) {
            return AlertaIndiceCalor.CUIDADO;
        } else {
            return AlertaIndiceCalor.NORMAL;
        }
    }

    public String gerarAlerta() {
        AlertaIndiceCalor alerta = classificarClima();

        return "\n[ ALERTA METEOROLÓGICO ]" + "\n" +
                "| Data            : " + dataPrevisao + "\n" +
                "| Temperatura     : " + String.format("%.1f", temperatura) + "°C" + "\n" +
                "| Umidade         : " + String.format("%.1f", umidade) + "%" + "\n" +
                "| Índice de Calor : " + String.format("%.2f", calcularIndiceCalor()) + "\n" +
                "| Situação        : " + alerta + " - " + alerta.getDescricao() + "\n" +
                "| Região          : " + regiao.toString();
    }

    public String getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(String dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }



}
