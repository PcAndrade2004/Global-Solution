package view;

import model.Seca;

import java.util.Scanner;

public class TesteSeca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Id: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite a Descrição da ocorrencia: ");
        String desc = entrada.nextLine();

        System.out.println("Informe a Data da ocorrencia: ");
        String data = entrada.nextLine();

        System.out.println("Informe o Nivel de Risco: ");
        int nivelRisco = entrada.nextInt();
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
        double precipitacao = entrada.nextDouble();
        entrada.nextLine();

        Seca seca = new Seca(id, desc, data, nivelRisco, diasSemChuva, nivelReservatorio, evapotranspiracao, precipitacao);

        System.out.println(seca);
        System.out.println("Calculo deficit: " + String.format("%.2f", seca.calcularDeficit()) + " mm");
        System.out.println("Nível de Alerta: " + seca.avaliarRisco() + " - " + seca.avaliarRisco().getDescricao());

        entrada.close();
    }
}