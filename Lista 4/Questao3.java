// Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:

// a) a quantidade de pessoas com idade superior a 50 anos;
// b) a média das alturas das pessoas com idade entre 10 e 20 anos;
// c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantsup50 = 0;
        double somaalt = 0;
        int pesoinf40 = 0;
        int pessoaentre10e20 = 0;
        int contapessoas = 0;
        int contagem;

        for (contagem = 1; contagem <= 10; contagem++) {

            System.out.println("Pessoa: " + contagem);

            System.out.println("Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Altura em (metros): ");
            double altura = scanner.nextDouble();

            System.out.println("Peso em kg: ");
            int peso = scanner.nextInt();

            if (idade > 50) {
                quantsup50++;

            }

            if (idade >= 10 && idade <= 20) {

                somaalt += altura;
                pessoaentre10e20++;

            }

            if (peso < 40) {

                pesoinf40++;

            }

            contapessoas++;
        }
        System.out.println("a) A quantidade de pessoas com idade superior a 50 anos;" + quantsup50);

        double medaltu = pessoaentre10e20 > 0 ? somaalt / pessoaentre10e20 : 0;
        System.out.println("b) A média das alturas das pessoas com idade entre 10 e 20 anos;" + medaltu);

        double porcentagemPessoasComPesoMenorQue40 = (pesoinf40 / (double) contapessoas) * 100;
        System.out.println("c) Porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas: "
                + porcentagemPessoasComPesoMenorQue40 + "%");

        scanner.close();
    }
}
