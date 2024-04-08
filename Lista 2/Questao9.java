// . Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Digite seu peso atual em kg: ");
    double peso = input.nextDouble();

    System.out.println("Digite sua altura em cm: ");
    double altura = input.nextDouble();

    double imc = peso / (altura * altura) * 10000;
    System.out.println("Seu IMC é: " + imc);

    double pesoIdeal = 52 + (0.75 * (altura - 152.4));

   double pesoIdealAjustado = ((peso - pesoIdeal) * 0.25) + pesoIdeal;  
    System.out.println("Seu peso ideal é: " + pesoIdealAjustado);  


  input.close();  

    
    
  }
}
