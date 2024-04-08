// Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.


import java.util.Scanner;
public class Main {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Digite a altura do retângulo: ");
    double altura = input.nextDouble();
    System.out.println("Digite a base do retângulo: ");
    double base = input.nextDouble();
    double area = altura * base;
    System.out.println("A área do retângulo é: " + area);
    double perimetro = 2 * (altura + base);
    System.out.println("O perímetro do retângulo é: " + perimetro);
    double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    System.out.println("A diagonal do retângulo é: " + diagonal);
    
  }
}
