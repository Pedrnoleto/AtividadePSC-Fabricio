// Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Informe a largura da área a ser revestida:");
        double largura = input.nextDouble();
        System.out.println("Informe o comprimento da área a ser revestida:");
        double comprimento = input.nextDouble();
        System.out.println("Informe o tipo de cerâmica a ser utilizada:");
        String ceramica = input.nextLine();
        double area = largura * comprimento;
        double ceramicaNecessaria = area * 1.1;
        System.out.println("A quantidade de cerâmica necessária é de " + ceramicaNecessaria); 
        System.out.println("Informe o valor do m²: ");
        double valor = input.nextDouble();
        double valorTotal = valor * ceramicaNecessaria;
        System.out.println("O valor total a ser pago é de " + valorTotal);
    
       input.close();
      }
    }
    
