// Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: raiz (𝑐 = 𝑎^2 + 𝑏^2)

import java.util.Scanner;
public class Main {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Digite o valor de a: ");
    double a = input.nextDouble();
    System.out.println("Digite o valor de b: ");
    double b = input.nextDouble();
    double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

    System.out.println("O valor da hipotenusa é: " + c);
    
                         

    
  }
}
