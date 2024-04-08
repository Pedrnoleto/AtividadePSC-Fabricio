// Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. Seu programa deve receber o valor dos três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno. Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos outros dois!
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        boolean triangle = true;
      
        System.out.println("Informe o 1° lado do triângulo: ");
        a = scanner.nextDouble();
        System.out.println("Informe o 2° lado do triângulo: ");
        b = scanner.nextDouble();
        System.out.println("Informeo 3° lado do triângulo: ");
        c = scanner.nextDouble();
      
        if (a + b <= c || a + c <= b || b + c <= a) {
            triangle = false;
            System.out.println("Os valores são inválidos para formar um triângulo.");
        }

        if (triangle) {
            if (a == b && b == c) {
                System.out.println("O triângulo é equilátero");
            } else if (a == b || b == c || c == a) {
                System.out.println("O triângulo é isósceles");
            } else {
                System.out.println("O triângulo é escaleno");
            }
        }

      
        scanner.close();
    }
}
