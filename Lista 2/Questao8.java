//  Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double tamanho;
    double tempo;
    double velocidade;

    System.out.println("Informe o tamanho do arquivo em MB: ");
    tamanho = input.nextDouble();

    tamanho = tamanho * 8.0;  // 1 byte são 8 bits
        
    System.out.println("Informe a velocidade do link em Mbps: ");
    velocidade = input.nextDouble();

    tempo = tamanho / velocidade;
    tempo = tempo / 60.0;

    System.out.println("O tempo total de download é de " + tempo + " minutos");

    input.close();
    
  
    
      
  }
}
