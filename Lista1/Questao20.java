import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI a ser acrescido:");
        double porcentagemIPI = scanner.nextDouble();

        System.out.println("Digite o código da peça 1:");
        int codigoPeca1 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peça 1:");
        double valorUnitarioPeca1 = scanner.nextDouble();

        System.out.println("Digite a quantidade de peças 1:");
        int quantidadePeca1 = scanner.nextInt();


        System.out.println("Digite o código da peça 2:");
        int codigoPeca2 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peça 2:");
        double valorUnitarioPeca2 = scanner.nextDouble();

        System.out.println("Digite a quantidade de peças 2:");
        int quantidadePeca2 = scanner.nextInt();

        double totalPeca1 = valorUnitarioPeca1 * quantidadePeca1;
        double totalPeca2 = valorUnitarioPeca2 * quantidadePeca2;
        double totalSemIPI = totalPeca1 + totalPeca2;
        double valorIPI = (porcentagemIPI / 100) * totalSemIPI;
        double valorTotal = totalSemIPI + valorIPI;

        System.out.println("\nResumo da Compra:");
        System.out.println("Código da peça 1: " + codigoPeca1);
        System.out.println("Total peça 1: R$ " + totalPeca1);
        System.out.println("Código da peça 2: " + codigoPeca2);
        System.out.println("Total peça 2: R$ " + totalPeca2);
        System.out.println("Total sem IPI: R$ " + totalSemIPI);
        System.out.println("Valor IPI: R$ " + valorIPI);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        scanner.close();
    }
}
