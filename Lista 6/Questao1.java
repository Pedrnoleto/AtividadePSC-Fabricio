// Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int[] vetor = new int[9];
    int cont = 0;
    
    for(int i = 1; i < 9; i++){
      System.out.print("Digite um número: ");
      vetor[i] = leitor.nextInt();
    }
    for(int i = 0; i < vetor.length; i++){
      if(vetor[i] % 2 != 0 && vetor[i] % 3 != 0 && vetor[i] % 5 != 0 && vetor[i] % 7 != 0){
        System.out.println("O número " + vetor[i] + " é primo e está na posição " + i);
        cont++;
      }
    }
    if(cont == 0){
      System.out.println("Não há números primos no vetor.");
    }
  }
}
