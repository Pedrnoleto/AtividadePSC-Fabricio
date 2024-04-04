// Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.



import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.println ("Digite a primeira nota: ");
    double A = input.nextDouble();

  System.out.println ("Digite a segunda nota: ");
    double B = input.nextDouble();

  System.out.println ("Digite a terceira nota: ");
    double C = input.nextDouble();
    double Media = (A + B + C) / 3;

  System.out.println ("Sua Media é: " + Media );
    

  

    
  }

  
}
