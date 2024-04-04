// Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu.

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

    int idade;

    System.out.println("Digite sua idade: ");
    idade = input.nextInt();

    System.out.println("Você já viveu " + idade * 365 + " dias");
  
  
    
  }
}
