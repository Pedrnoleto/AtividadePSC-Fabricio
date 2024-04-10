// Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números ímpares e a soma dos números pares.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int soma = 0;

        System.out.println("Os números ímpares são:");

        for (num = 0; num <= 75; num++) {

            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }

            if (num % 2 == 0) {
                soma = soma + num;
            }

        }

        System.out.println("\nA soma dos números pares foi: " + soma);
        scanner.close();
    }
}
