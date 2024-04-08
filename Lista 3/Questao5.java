//Escreva um programa em Java para determinar se o indivíduo está com um
// peso favorável. Essa situação é determinada através do IMC (Índice de
//Massa Corpórea), que é definida pela equação:
//𝐼𝑀𝐶 = 𝑝𝑒𝑠𝑜 * 𝑎𝑙𝑡𝑢𝑟𝑎² do peso é determinada pela tabela abaixo:

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();

        System.out.println("Digite sua altura em cm: ");
        altura = scanner.nextDouble();

        imc = peso * (altura * altura) / 100000;

        if (imc < 20) {
            System.out.println("Você está abaixo do peso");
            System.out.println("Seu IMC: " + imc);

        }

        if (imc >= 20 && imc <= 25) {
            System.out.println("Você está com o peso normal");
            System.out.println("Seu IMC: " + imc);

        }

        if (imc >= 25 && imc <= 30) {
            System.out.println("Você está acima do peso");
            System.out.println("Seu IMC: " + imc);

        }

        if (imc >= 30 && imc <= 40) {
            System.out.println("Você está obeso");
            System.out.println("Seu IMC: " + imc);

        }

        if (imc >= 40) {
            System.out.println("Você está em situação de obesidade mórbida");
            System.out.println("Seu IMC: " + imc);

        }

        scanner.close();
    }
}
