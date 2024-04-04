// Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio;
        System.out.println("Digite o raio do círculo: ");
        raio = input.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
    }
}  
  
