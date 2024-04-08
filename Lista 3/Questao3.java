// Escreva um programa em Java para ler o número de votos brancos, nulos e
// válidos. Calcular e escrever o percentual que cada um representa em relação
// ao total de eleitores.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double validos, nulos, brancos, totaleleitores;
        int result, resut2, result3;

        System.out.println("Digite o total de votos válidos: ");
        validos = scanner.nextDouble();

        System.out.println("Digite o total de votos nulos: ");
        nulos = scanner.nextDouble();

        System.out.println("Digite o total de votos em branco: ");
        brancos = scanner.nextDouble();

        totaleleitores = validos + nulos + brancos;
        result = (int) ((validos * 100) / totaleleitores);
        resut2 = (int) ((nulos * 100) / totaleleitores);
        result3 = (int) ((brancos * 100) / totaleleitores);

        System.out.println("Resultado dos votos: Brancos= " + result3 + "%");
        System.out.println("Resultado dos votos: Validos= " + result + "%");
        System.out.println("Resultado dos votos: Nulos= " + resut2 + "%");

        scanner.close();
    }
}
