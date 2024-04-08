// . Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento inserido


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double potWatts, horas, valorKWh, KWh, valorGasto;

        System.out.println("Digite a potência do seu equipamento em Watts:");
        potWatts = scanner.nextDouble();

        System.out.println("Digite o tempo que seu equipamento fica ligado por dia:");
        horas = scanner.nextDouble();

        System.out.println("Digite o valor do KWh:");
        valorKWh = scanner.nextDouble();

        KWh=(potWatts*horas*30)/1000; //Dividir por 1000 é importante porque recebos o valor em Watts e o calculo é feito em KiloWatts 

        valorGasto = KWh * valorKWh;

      System.out.println("O gasto mensal de energia do equipanto é de " + KWh + " KWh");
      System.out.println("O valor gasto com esse equipamento foi de " + valorGasto + " reais");



        scanner.close();
    }
}
