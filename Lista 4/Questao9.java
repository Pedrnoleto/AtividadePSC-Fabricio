/* Dados dois países, A com população igual a cinco milhões de pessoas, e taxa de natalidade de três por cento ao ano, e, B, 
com população igual a sete milhões de pessoas e taxa de natalidade de dois por cento ao ano, 
escreva um programa em Java que calcule iterativamente e exiba em quantos anos a população de A ultrapassará a população de B. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int populaçãoA = 5000000;
        int populaçãoB = 7000000;
        int ano = 0;

        double taxaA = 0.03;
        double taxaB = 0.02;

        while (populaçãoA < populaçãoB) {
            populaçãoA += populaçãoA * taxaA;
            populaçãoB += populaçãoB * taxaB;
            ano++;

        }
        System.out.println("A população do país A passara o país B em " + ano + " anos. ");

        scanner.close();
    }
}
