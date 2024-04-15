/* Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro), ou seja, A*B, por intermédio de adições sucessivas. 
Tanto A quanto B devem ser fornecidos pela pessoa utilizadora do programa. */

import java.util.Scanner;  

public class Main {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        double valueA, result;
        int valueB;
      
        System.out.print("Digite o valor de A onde é 1° fator da multiplicação (número real) : ");
        valueA = input.nextDouble();
      
        System.out.print("Digite o valor do 2° onde é fator da multiplicação (número inteiro): ");
      
        valueB = input.nextInt();
        result = valueA * valueB;
      
        System.out.println("A mutiplicação de " + valueA + " por " + valueB + " é: " + result);
        input.close();
    }
}
