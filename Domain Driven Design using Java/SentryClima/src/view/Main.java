package view;

import model.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        SistemaMonitor sistema = new SistemaMonitor("Sistema de Previsão Climática", "1.0");
        Regiao regiao = null;
        int opcao = -1;

        System.out.println("===================================");
        System.out.println("  SISTEMA DE PREVISÃO CLIMÁTICA");
        System.out.println("  E PREVENÇÃO DE DESASTRES");
        System.out.println("===================================");

        // ==================== CADASTRO DA REGIÃO ====================
        System.out.println("\n======= CADASTRO DA REGIÃO =======");

        System.out.print("Nome da Região: ");
        String nomeRegiao = entrada.nextLine();

        System.out.print("Estado: ");
        String estado = entrada.nextLine();

        System.out.print("População (apenas números): ");
        int populacao = entrada.nextInt();
        entrada.nextLine();

        regiao = new Regiao(nomeRegiao, estado, populacao);
        System.out.println("\nRegião cadastrada com sucesso!");
        System.out.println(regiao);

        // ==================== MENU PRINCIPAL ====================
        while (opcao != 0) {
            System.out.println("\n===================================");
            System.out.println("         MENU PRINCIPAL");
            System.out.println("===================================");
            System.out.println("1 - Cadastrar Tempestade");
            System.out.println("2 - Cadastrar Seca");
            System.out.println("3 - Cadastrar Previsão");
            System.out.println("4 - Gerar Relatório Geral");
            System.out.println("5 - Calcular Estatísticas");
            System.out.println("6 - Buscar Previsões por Região");
            System.out.println("7 - Exibir Dados do Sistema");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    // ==================== CADASTRAR TEMPESTADE ====================
                    System.out.println("\n======= CADASTRO DE TEMPESTADE =======");

                    System.out.print("Id: ");
                    int idTempestade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Descrição: ");
                    String descTempestade = entrada.nextLine();

                    System.out.print("Data (dd/mm/aaaa): ");
                    String dataTempestade = entrada.nextLine();

                    System.out.print("Nível de Risco (1-5): ");
                    int nivelRiscoTempestade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Velocidade do Vento (km/h): ");
                    double vento = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.print("Precipitação (mm): ");
                    double precipitacaoTempestade = entrada.nextDouble();
                    entrada.nextLine();

                    Tempestade tempestade = new Tempestade(idTempestade, descTempestade, dataTempestade, nivelRiscoTempestade, vento, precipitacaoTempestade);
                    regiao.adicionarEvento(tempestade);

                    System.out.println("\nTempestade cadastrada com sucesso!");
                    System.out.println(tempestade);
                    System.out.println("Intensidade: " + String.format("%.2f", tempestade.calcularIntensidade()));
                    System.out.println("Nível de Alerta: " + tempestade.avaliarRisco() + " - " + tempestade.avaliarRisco().getDescricao());
                    break;

                case 2:
                    // ==================== CADASTRAR SECA ====================
                    System.out.println("\n======= CADASTRO DE SECA =======");

                    System.out.print("Id: ");
                    int idSeca = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Descrição: ");
                    String descSeca = entrada.nextLine();

                    System.out.print("Data (dd/mm/aaaa): ");
                    String dataSeca = entrada.nextLine();

                    System.out.print("Nível de Risco (1-5): ");
                    int nivelRiscoSeca = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Dias sem chuva: ");
                    int diasSemChuva = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nível do Reservatório (%): ");
                    double nivelReservatorio = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.print("Evapotranspiração (mm): ");
                    double evapotranspiracao = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.print("Precipitação (mm): ");
                    double precipitacaoSeca = entrada.nextDouble();
                    entrada.nextLine();

                    Seca seca = new Seca(idSeca, descSeca, dataSeca, nivelRiscoSeca, diasSemChuva, nivelReservatorio, evapotranspiracao, precipitacaoSeca);
                    regiao.adicionarEvento(seca);

                    System.out.println("\nSeca cadastrada com sucesso!");
                    System.out.println(seca);
                    System.out.println("Déficit Hídrico: " + String.format("%.2f", seca.calcularDeficit()) + " mm");
                    System.out.println("Nível de Alerta: " + seca.avaliarRisco() + " - " + seca.avaliarRisco().getDescricao());
                    break;

                case 3:
                    // ==================== CADASTRAR PREVISÃO ====================
                    System.out.println("\n======= CADASTRO DE PREVISÃO =======");

                    System.out.print("Data da Previsão (dd/mm/aaaa): ");
                    String dataPrevisao = entrada.nextLine();

                    System.out.print("Temperatura (°C): ");
                    double temperatura = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.print("Umidade (%): ");
                    double umidade = entrada.nextDouble();
                    entrada.nextLine();

                    Previsao previsao = new Previsao(dataPrevisao, temperatura, umidade, regiao);
                    sistema.adicionarPrevisao(previsao);

                    System.out.println("\nPrevisão cadastrada com sucesso!");
                    System.out.println(previsao.gerarAlerta());
                    break;

                case 4:
                    // ==================== RELATÓRIO GERAL ====================
                    System.out.println(sistema.gerarRelatorioGeral());
                    break;

                case 5:
                    // ==================== ESTATÍSTICAS ====================
                    System.out.println(sistema.calcularEstatisticas());
                    break;

                case 6:
                    // ==================== BUSCAR POR REGIÃO ====================
                    System.out.print("Digite o nome da região: ");
                    String busca = entrada.nextLine();

                    List<Previsao> resultado = sistema.buscarPorRegiao(busca);

                    if (resultado.isEmpty()) {
                        System.out.println("Nenhuma previsão encontrada para a região: " + busca);
                    } else {
                        System.out.println("\n======= PREVISÕES ENCONTRADAS =======");
                        for (Previsao p : resultado) {
                            System.out.println(p.gerarAlerta());
                        }
                    }
                    break;

                case 7:
                    // ==================== DADOS DO SISTEMA ====================
                    System.out.println(sistema);
                    System.out.println(regiao.gerarRelatorio());
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema...");
                    System.out.println("Obrigado por usar o Sistema de Previsão Climática!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        entrada.close();
    }
}
