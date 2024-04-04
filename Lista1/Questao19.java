// Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:


import java.util.Scanner;
  public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
         System.out.println("Número\t\tQuadrado\tCubo");
              for (int i = 0; i <= 10; i++) {
                  int quadrado = i * i;
                  int cubo = i * i * i;
                  System.out.printf("%-10d%-10d%-10d%n", i, quadrado, cubo);
              }
          }
      }
      
  
