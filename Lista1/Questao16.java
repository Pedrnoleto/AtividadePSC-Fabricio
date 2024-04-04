//Faça um programa que receba de entrada a distância total (em km) percorrida por um automóvel e a quantidade de combustível (em litros) consumida para percorrê-la, calcule e imprima o consumo médio de combustível. Fórmula: distância/litro.

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);


    System.out.println("Informe a distância percorrida em Km: ");
      double Distancia = input.nextDouble();
    
    System.out.println("Informe a quantidade de combustível consumida em litros: ");
     double litros = input.nextDouble();
      
     double consumo = Distancia/litros;

    System.out.println("O consumo médio de combustível é " + consumo + " km/l");
    
  }
  
}
