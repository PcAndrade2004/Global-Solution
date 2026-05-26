package view;

import model.Tempestade;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

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

        System.out.println("Velocidade do vento: ");
        double velocidade = entrada.nextDouble();

        System.out.println("Informe a preciptação: ");
        double precipta = entrada.nextDouble();
        entrada.nextLine();

        Tempestade temp = new Tempestade(id, desc, data, nivelRisco, velocidade, precipta);

        System.out.println(temp);
        System.out.println("Intensidade da Tempestade: " + temp.calcularIntensidade());
        System.out.println("Nível de Alerta " + temp.avaliarRisco());

    }
}
