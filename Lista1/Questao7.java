// Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

    double salario; 

  System.out.println("Digite o seu salário atual: ");
    salario = input.nextDouble();
    double reajuste = salario + (salario * 0.07);
    
  System.out.println("O seu salário com reajuste é: " + reajuste);
  

    
    

    
  }
}
