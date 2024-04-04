// Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor.

import java.util.Scanner;
  public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    int num;
    int antecessor;
    int sucessor;

    System.out.println("Digite um número:");
    num = input.nextInt();
    antecessor = num - 1;
    sucessor = num + 1;

    System.out.println("O antecessor do número digitado é: " + antecessor);
    System.out.println("O sucessor do número digitado é: " + sucessor);  

    
    
  }


  }
