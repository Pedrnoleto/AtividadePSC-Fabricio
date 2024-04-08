

import java.util.Scanner;
public class Main {
public static void main(String[] args){

          Scanner scanner = new Scanner(System.in);

          double px1, py1;
          double px2, py2;
          double result;

          System.out.println("Digite as cordenas do ponto 1\nDigite x:");
          px1 = scanner.nextDouble();
          System.out.println("Digite y:");
          py1 = scanner.nextDouble();

          System.out.println("Digite as cordenas do ponto 2\n Digite x:");
          px2 = scanner.nextDouble();
          System.out.println("Digite y:");
          py2 = scanner.nextDouble();

          result = Math.sqrt(Math.pow((px1-px2),2) + Math.pow((py1-py2),2));

          System.out.println("A distância entre os dois pontos eh: " + result);







          scanner.close();
      }

  }
