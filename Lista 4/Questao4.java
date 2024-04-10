// Em um campeonato de LOL, enquanto não há a tomada de território, o contador implementado deve contar (que é contabilizado pelo jogo), o número de kills, deaths e assists. 
// Se o número de kills for menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais “master”. Se o número de deaths chegar a 20 ou mais,  ele mostra a mensagem 
//“Houston, we have a problem”. Se o número de assists chegar a 20 ou mais, é mostrada a mensagem: “team work”. Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
// Dicas: 
// há kills, deaths e assists total e da rodada
// medite na frase: enquanto não há um vencedor, faça…
// pergunte a cada loop o número de cada medida comentada.
// você deve perguntar se há um vencedor a cada loop…

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kills = 0;
        int deaths = 0;
        int assiststotal = 0;
        int rodada = 0;

        while (true) {

            rodada++;

            System.out.println("Seja bem-vindo ao 1° Campeonato UNA de LOL \n Digite seus dados abaixo");
            System.out.println("Qual quantidades de Kills ?");
            kills = scanner.nextInt();

            System.out.println("Qual quantidade de deaths ?");
            deaths = scanner.nextInt();

            System.out.println("Qual total de assists ?");
            assiststotal = scanner.nextInt();

            if (kills <= 5) {
                System.out.println("Você é o verdadeiro Noob");
            }

            else if (kills >= 20) {

                System.out.println("Você se tornou um Master");

            }

            if (deaths >= 20) {
                System.out.println("Houston, we have a problem");

            }

            if (assiststotal >= 20) {
                System.out.println("team work");

            }

            System.out.println("Existe um vencedor na partida ? \n Digite sim para sair...");
            String sim = scanner.next();
            if (sim.equalsIgnoreCase("sim")) {

                break;

            }

        }

        System.out.println("Parabéns pela vitoria. Fim de campeonato");
        System.out.println("Numero total de rodadas: " + rodada);

        scanner.close();
    }
}
