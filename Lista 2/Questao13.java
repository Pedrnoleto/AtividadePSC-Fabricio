// . Escreva um programa que seja capaz de realizar a soma de duas frações, não é  necessário simplificar. As entradas serão o numerador e, o denominador da primeira  fração, seguidos do numerador e, o denominador da segunda fração. O resultado também deverá ser exibido em formato de fração. e.g:

import java.util.Scanner;
public class Main {
  public static void main(String[] args){

  Scanner input = new Scanner (System.in);

  int num1, den1, num2, den2, mmc, res1, res2, res3;

    System.out.println("Digite o numerador da primeira fração: ");
    num1 = input.nextInt();
    System.out.println("Digite o denominador da primeira fração: ");
    den1 = input.nextInt();

    System.out.println("Digite o numerador da segunda fração: ");
    num2 = input.nextInt();  
    System.out.println("Digite o denominador da segunda fração: ");
    den2 = input.nextInt();


    int num3 = num1 * den2 + num2 * den1;

    mmc = den1 * den2;  // resolvendo o mmc

    
    res1 = mmc / den1;   
    res1 = res1 * num1;

    res2 = mmc / den2;
    res2 = res2 * num2;
    
    res3 = res1 + res2;

    System.out.println("O resultado da soma das frações é:   \n "  + res3 + "\n  -----\n    " + mmc);
    



  input.close();

    
    
  }
}
