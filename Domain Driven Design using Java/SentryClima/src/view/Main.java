package view;

import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // ==================== TEMPESTADE ====================
        System.out.println("======= CADASTRO DE TEMPESTADE =======");

        System.out.println("Digite o Id: ");
        int idTempestade = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite a Descrição: ");
        String descTempestade = entrada.nextLine();

        System.out.println("Informe a Data: ");
        String dataTempestade = entrada.nextLine();

        System.out.println("Informe o Nivel de Risco: ");
        int nivelRiscoTempestade = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Velocidade do vento (km/h): ");
        double vento = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Precipitação (mm): ");
        double precipitacaoTempestade = entrada.nextDouble();
        entrada.nextLine();

        Tempestade tempestade = new Tempestade(idTempestade, descTempestade, dataTempestade, nivelRiscoTempestade, vento, precipitacaoTempestade);

        // ==================== SECA ====================
        System.out.println("\n======= CADASTRO DE SECA =======");

        System.out.println("Digite o Id: ");
        int idSeca = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite a Descrição: ");
        String descSeca = entrada.nextLine();

        System.out.println("Informe a Data: ");
        String dataSeca = entrada.nextLine();

        System.out.println("Informe o Nivel de Risco: ");
        int nivelRiscoSeca = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Informe quantos dias sem chuva: ");
        int diasSemChuva = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Informe o nivel do reservatorio (%): ");
        double nivelReservatorio = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Informe a evapotranspiracao (mm): ");
        double evapotranspiracao = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Informe a precipitacao (mm): ");
        double precipitacaoSeca = entrada.nextDouble();
        entrada.nextLine();

        Seca seca = new Seca(idSeca, descSeca, dataSeca, nivelRiscoSeca, diasSemChuva, nivelReservatorio, evapotranspiracao, precipitacaoSeca);

        // ==================== REGIAO ====================
        System.out.println("\n======= CADASTRO DE REGIÃO =======");

        System.out.println("Nome da Região: ");
        String nomeRegiao = entrada.nextLine();

        System.out.println("Estado: ");
        String estado = entrada.nextLine();

        System.out.println("População: ");
        int populacao = entrada.nextInt();
        entrada.nextLine();

        Regiao regiao = new Regiao(nomeRegiao, estado, populacao);

        // ==================== CONECTANDO ====================
        regiao.adicionarEvento(tempestade);
        regiao.adicionarEvento(seca);

        // ==================== SAÍDA ====================
        System.out.println("\n======= DADOS DA REGIÃO =======");
        System.out.println(regiao);

        System.out.println("\n======= RELATÓRIO DE EVENTOS =======");
        System.out.println(regiao.gerarRelatorio());

        System.out.println("\n======= ANÁLISE DOS EVENTOS =======");
        System.out.println("Intensidade da Tempestade: " + tempestade.calcularIntensidade());
        System.out.println("Nível de Alerta Tempestade: " + tempestade.avaliarRisco() + " - " + tempestade.avaliarRisco().getDescricao());
        System.out.println("Déficit Hídrico da Seca: " + String.format("%.2f", seca.calcularDeficit()) + " mm");
        System.out.println("Nível de Alerta Seca: " + seca.avaliarRisco() + " - " + seca.avaliarRisco().getDescricao());

        entrada.close();
    }
}