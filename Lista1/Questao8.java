// Escreva um programa que converte uma quantidade de metros para centímetros.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de metros: ");
    double metros = input.nextDouble();
    double centimetros = metros * 100;
    System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");

    
  }
}
