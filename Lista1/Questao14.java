//Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe a ter o valor de B e vice-versa. Exiba os valores após a troca


import java.util.Scanner;

public class Main {
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);

 System.out.println("Digite o valor de A: ");
   int a = input.nextInt();

 System.out.println("Digite o valor de B: ");
   int b = input.nextInt();

 System.out.println("O valor de A é: " + b);
 System.out.println("O valor de B é: " + a); 
   
   
 } 
}
