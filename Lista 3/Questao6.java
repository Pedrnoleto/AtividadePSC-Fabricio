// Escreva um programa que peça ao usuário que insira um número de 1 a 4, correspondendo a cada estação do ano (1 para Primavera, 2 para Verão, 3
// para Outono, e 4 para Inverno) para identificar a estação escolhida e imprimir uma mensagem característica daquela estação.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Pri, Ver, Out, Inv, res;

        System.out.println("Insira um número de 1 a 4: ");
        res = scanner.nextInt();

        if (res == 1) {
            System.out.println("Você escolheu a Primavera.");

        }
        if (res == 2) {
            System.out.println("Você escolheu o Verão.");

        }
        if (res == 3) {
            System.out.println("Você escolheu o Outono.");

        }

        if (res == 4) {
            System.out.println("Você escolheu o Inverno.");

        }

        scanner.close();
    }
}
