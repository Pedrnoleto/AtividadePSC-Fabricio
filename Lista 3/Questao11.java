// Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir saldo, Exibir extrato, Realizar depósito, Realizar
// saque, e Sair. Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura de seleção
// Switch/Case para implementar seu produto. Utilize números inteiros para indicar cada opção

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caixaeletronico;

        System.out.println("Caixa eletronico 24hrs");
        System.out.println("Qual serviço você deseja utilizar ?");
        System.out.println("1- Realizar Saque\n2- Realizar depósito\n3- Exibir extrato\n4- Exibir saldo\n5- Sair");

        caixaeletronico = scanner.nextInt();

        switch (caixaeletronico) {
            case 1:
                System.out.println("Voce solicitou realizar um saque.\n Aguarde...");

                break;
            case 2:
                System.out.println("Você solicitou realizar um depósito.\n Aguarde...");

                break;

            case 3:
                System.out.println("Você solicitou exibir extrato. \n Aguarde...");

                break;
            case 4:
                System.out.println("Você solicitou exibir saldo. \n Aguarde...");

                break;
            case 5:
                System.out.println("Você terminou seu acesso.");
                break;

            default:
                System.out.println("Opção invalida, finalizando acesso...");
                break;
        }

        scanner.close();
    }
}
