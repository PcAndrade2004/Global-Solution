package view;

import model.Seca;

import java.util.Scanner;

public class TesteSeca {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        System.out.println("Digite o Id: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite a Descrição da ocorrencia: ");
        String desc = entrada.nextLine();

        System.out.println("Informe da Data da ocorrencia: ");
        String data = entrada.nextLine();

        System.out.println("Informe o Nivel de Risco: ");
        int nivelRisco = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Quantos dias sem chuva: ");
        int diasSemChuva = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Nivel do reservatorio: ");
        double nivelReservatorio = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Quantos dias evapotranspiracao: ");
        double diasEvapotranspiracao = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Quantos dias precipitacao: ");
        double precipitacao = entrada.nextDouble();
        entrada.nextLine();

        Seca  seca = new Seca(id, desc, data, nivelRisco, diasSemChuva, nivelReservatorio, diasEvapotranspiracao, precipitacao);

        System.out.println(seca);
        System.out.println("Calculo deficit: " + seca.calcularDeficit());
        System.out.println("Nível de Alerta: " + seca.avaliarRisco());


    }
}
