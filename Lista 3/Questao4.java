//Avalie o código abaixo e determine se suas saídas estão corretas. Primeiro,
//tente identificar a falha sem executar o programa; Em seguida, implemente e
//veja se acertou. Se houver erros, aponte-os e proponha e implemente as
//correções. Obs.: Somente um aumento pode ser aplicado por vez

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario = 0.0;
        double taxaAumento = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.println();
        System.out.println("Por favor, informe o valor do salário atual: ");
        salario = scanner.nextDouble();

        if (salario <= 1000) {
            salario *= taxaAumento3;
        }

        else if (salario <= 2000) {
            salario *= taxaAumento2;
        }

        else if (salario <= 3000) {
            salario *= taxaAumento;
        }

        else if (salario <= 4000) {
            salario = (salario * taxaAumento) + 200;
        }

        System.out.println();
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);

        scanner.close();
    }
}
