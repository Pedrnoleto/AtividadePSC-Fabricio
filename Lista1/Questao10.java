// Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.  Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9


import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite a temperatura em Fahrenheit: ");

    double fahrenheit = input.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;  
    System.out.println("A temperatura em Celsius é: " + celsius);

       
    
  }
  
}
  
