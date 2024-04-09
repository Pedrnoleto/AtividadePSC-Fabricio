//
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorproduto, valor1;

        System.out.println("Lojinha do Sr. Aboo");

        System.out.println("Digite o valor do produto: ");
        valorproduto = scanner.nextDouble();

        if (valorproduto <= 10) {
            valor1 = valorproduto * 0.7;
            valorproduto = valor1 + valorproduto;
            System.out.println("Produto será vendido com 70% de lucro");
            System.out.println("Valor do Produto para ser vendido = R$ " + valorproduto + "0");
        }

        else if (valorproduto >= 10 && valorproduto < 30) {
            valor1 = valorproduto * 0.5;
            valorproduto = valor1 + valorproduto;
            System.out.println("Produto será vendido com 50% de lucro");
            System.out.println("Valor do produto para ser vendido = R$" + valorproduto + "0");

        }

        else if (valorproduto >= 30 && valorproduto < 50) {
            valor1 = valorproduto * 0.4;
            valorproduto = valor1 + valorproduto;
            System.out.println("Produto será vendido com 40% de lucro");
            System.out.println("Valor do produto para ser vendido = R$" + valorproduto + "0");

        }

        else if (valorproduto >= 50) {
            valor1 = valorproduto * 0.3;
            valorproduto = valor1 + valorproduto;
            System.out.println("Produto será vendido com 30% de lucro");
            System.out.println("Valor do prorduto para ser vendido = R$" + valorproduto + "0");
        }
        scanner.close();

    }
}
