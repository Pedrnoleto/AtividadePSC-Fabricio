//  Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;
        double result;

        System.out.println("Olá, digite o primeiro numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Agora, digite o segundo numero: ");
        numero2 = scanner.nextDouble();

        result = numero1 / numero2;

        if (result > 0) {
            System.out.println("Seu resulta é igual: " + result);

        } else {
            System.out.println("Erro, impossivel realizar essa calculo.");
        }

        scanner.close();

    }
}
