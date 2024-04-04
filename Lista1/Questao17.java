// Faça um programa para o seguinte problema: Compraram-se N canetas iguais, que foram pagas com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta?

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

    System.out.println("Quantas canetas voce deseja comprar ?");
    int canetas = input.nextInt();

        System.out.println("Digite o valor total pago em reais:");
        double totalPago = input.nextDouble();
        System.out.println("Digite o valor do troco em reais:");
        double troco = input.nextDouble();

        double custoPorCaneta = (totalPago - troco) / canetas;

        System.out.println("O custo de cada caneta é: R$ " + custoPorCaneta);
      }
    }

    
        

    
  
   
