// Faça um programa que leia um número indeterminado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada.
// Finalize a entrada com valor negativo ou zero.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        double quad, raiz, cub;

        while (num > 0) {

            System.out.println("Para sair aperte digite algum numero negativo ou aperte 0");
            System.out.println("Digite seu numero desejado: ");

            num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Você saiu do programa.");
                break;
            }

            quad = num * num;
            raiz = Math.sqrt(num);
            cub = Math.pow(num, 3);

            System.out.println("Seu número escolhido é: " + num);
            System.out.println("A raiz quadrada do seu número é: " + raiz);
            System.out.println("Seu número escolhido ao quadrado é: " + quad);
            System.out.println("Seu número elevado ao cubo: " + cub);

        }

        scanner.close();
    }
}
