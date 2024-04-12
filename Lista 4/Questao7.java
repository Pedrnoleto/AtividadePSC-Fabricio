import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colunas, forma;

        System.out.print("Digite o número de colunas (maior que 0): ");
        colunas = input.nextInt();

        if (colunas <= 0) {

            System.out.println("Você saiu do programa.");
            return;

        }

        System.out.println(
                "Escolha a sua forma geométrica: \n1 - retângulo\n2 - diagonal superior esquerda\n3 - diagonal superior direita\n4 - diagonal inferior esquerda\n5 - diagonal inferior direita");
        forma = input.nextInt();

        switch (forma) {
            case 1:
                for (int j = 0; j < colunas; j++) {
                    for (int i = 0; i < colunas; i++) {
                        System.out.print("* ");
                    }
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ");
                }

                break;
            case 2:
                for (int i = 0; i < colunas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        if (j >= i) {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < colunas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        if (j >= i) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 0; i < colunas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        if (j <= i) {
                            System.out.print("* ");
                        } else {
                            System.out.print("");
                        }
                    }
                    System.out.println();
                }
                break;
            case 5:
                for (int i = 0; i < colunas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        if (j >= colunas - i - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        input.close();
    }
}
