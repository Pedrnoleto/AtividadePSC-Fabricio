// Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total =
// quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total- desconto), 
// sabendo-se que:- Se quantidade <= 5, o desconto será de 2%- Se quantidade > 5 e quantidade <=10, o desconto será de 3%- Se quantidade > 10 e quantidade <30,
// o desconto será de 5%- Se quantidade >= 30 o desconto será de 10%

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pro;
        Double a, b, c, d;
        System.out.println("Digite o nome do produto que deseja: ");
        pro = scanner.next();
        System.out.println("Quantas unidades deseja ? ");
        a = scanner.nextDouble();
        System.out.println("Qual o valor do produto ? ");
        b = scanner.nextDouble();
        c = a * b;
        System.out.println("O valor total do produto sem desconto: R$" + c);
        if (a <= 5) {
            d = c - (c * 0.02);
        } else if (a > 5 && a <= 10) {
            d = c - (c * 0.03);
        } else if (a > 10 && a < 30) {
            d = c - (c * 0.05);
        } else {
            d = c - (c * 0.10);
        }
        System.out.printf("O preço do produto %s é R$%.2f\n", pro, b);
        System.out.printf("O preço com desconto é: R$%.2f\n", d);
        scanner.close();
    }
}
