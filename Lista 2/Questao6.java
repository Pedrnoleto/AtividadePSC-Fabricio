// Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.

import java.util.Scanner;
public class Main {
  public static void main(String[] args){

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

   input.close();
  }
}
