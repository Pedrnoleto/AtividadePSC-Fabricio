// Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95.

import java.util.Scanner;
public class Main {
  public static void main (String [] args) {

    Scanner input = new Scanner(System.in);
    
    
       
    System.out.println("Digite o valor em dólar: ");
    float dolar = input.nextFloat();
    float real = dolar * 4.95f;
    
    
    System.out.println("O valor em reais é: R$" + real);


    
    
       
  
  
  

    
  }

  
}


