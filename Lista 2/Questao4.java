//Crie um programa para calcular a regra de três 

import java.util.Scanner;
public class Main {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("A está para B, assim como C está para D");
    
    System.out.println("Digite o valor de A: ");
    double A = input.nextDouble();
    System.out.println("Digite o valor de B: ");
    double B = input.nextDouble();
    System.out.println("Digite o valor de C: ");
    double C = input.nextDouble();
    double resultado = (C * B) / A;

    System.out.println("O resultado é: " + resultado);

    
  }
}
