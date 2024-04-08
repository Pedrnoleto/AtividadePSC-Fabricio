//  Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    

  double potencia, horas, valor, kwh, valorpago;

    System.out.println("Digite a potência do equipamento em Watts: ");
    potencia = input.nextDouble();
    
    System.out.println("Digite a quantidade de horas que o equipamento fica ligado por dia: ");
    horas = input.nextDouble();
    
    System.out.println("Digite o valor do KW/h: ");
    valor = input.nextDouble();
    kwh = (potencia * horas) / 1000;
    valorpago = kwh * valor;

    System.out.println("O valor pago é: " + valorpago);

    input.close();
    
    
    
  }
}
