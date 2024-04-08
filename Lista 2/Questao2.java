// Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.

import java.util.Scanner;
public class Main {
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  double gasolina;
  double etanol;
  double resultado;

    System.out.println("Digite o preço da gasolina");
    gasolina = input.nextDouble();
    System.out.println("Digite o preço do etanol");
    etanol = input.nextDouble();
    resultado = etanol / gasolina;
    if (resultado < 0.7) {
      System.out.println("Abasteça com etanol");
    } else {
      System.out.println("Abasteça com gasolina");
    }


    input.close();
  }
    }
    
   

  
