// A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.


import java.util.Scanner;
public class Main {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    
  double peso;

    System.out.println("Digite seu peso: ");
    peso = input.nextDouble();
    System.out.println("Você deve beber " + (peso * 35/1000) + " litros de água por dia");


    
  

    input.close();
      
  }
}
