// Crie um programa em Java que implementa um jogo simples de adivinhação. O objetivo do jogo é que o usuário tente adivinhar um número secreto gerado aleatoriamente pelo computador.
// Este número estará entre 1 e 100, inclusive. Para tornar o jogo interativo e dar feedback ao jogador, o programa deve informar após cada tentativa se o palpite do usuário é muito alto,
// muito baixo, ou correto. O jogo termina quando o usuário acertar o número, e o programa deve informar o número de tentativas que foram necessárias para chegar à resposta correta.
// Exemplo: Bem-vindo ao Jogo de Adivinhação!
//Estou pensando em um número entre 1 e 100...
//Tente adivinhar qual é!
//Digite seu palpite: 50
//Muito alto. Tente novamente.
//Digite seu palpite: 25
//Muito baixo. Tente novamente.
//Digite seu palpite: 37
//Parabéns! Você acertou o número em 3 tentativas!

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int valorcorreto = random.nextInt(100) + 1;
        int palpite;
        int rodada = 0;

        System.out.println("Bem-vindo ao jogo ADIVINHAÇÂO UNA");
        System.out.println(
                "Você precisa acertar um número de 1 a 100 \n soltaremos dicas se esta proximo ou nao do número correto:");

        String resposta;

        do {

            while (true) {

                rodada++;

                System.out.println("Digite seu palpite: ");

                palpite = scanner.nextInt();

                if (palpite == valorcorreto) {
                    System.out.println("Parabéns você acertou o número no total de " + rodada + " rodadas.");
                    break;

                }

                else if (palpite < valorcorreto) {
                    System.out.println("Muito baixo. Tente novamente.");
                } else {
                    System.out.println("Muito alto. Tente novamente.");
                }
            }

            System.out.println("Você deseja jogar novamente ? Se sim digite S.");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("S"));

        scanner.close();
    }

}
