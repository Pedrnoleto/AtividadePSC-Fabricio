//Escreva um programa que calcula o salário líquido de um funcionário. O programa deve solicitar o valor da hora de trabalho, o número de horas trabalhadas no mês e o percentual de desconto do INSS.


import java.util.Scanner;

public class Main {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.println("Bem-vindo ao calculador de salário");
  System.out.println("Insira o valor da hora de trabalho: ");

  double ValorHora = input.nextDouble();

  System.out.println("Insira o número de horas trabalhadas no mês");
  double HorasTrabalhadas = input.nextDouble();
    
  System.out.println("Insira o percentual de desconto do INSS");
  double PercentualINSS = input.nextDouble();
  PercentualINSS = PercentualINSS / 100;  //converte o percentual para decimal
 
  double SalarioBruto = ValorHora * HorasTrabalhadas;
  double SalarioLiquido = SalarioBruto - (SalarioBruto * PercentualINSS);

  System.out.print("O salário líquido é: " + SalarioLiquido );  

    
  }
}
