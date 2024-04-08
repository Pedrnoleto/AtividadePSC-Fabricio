// (Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela: Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. Entrada: QUAL A IDADE DA PESSOA?: 17 Saída: ELEITOR FACULTATIVO

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int idade;
    
    System.out.println("Qual sua idade ?");
    idade = scanner.nextInt();

    if(idade < 16){
      System.out.println("Não eleitor");
    }
    if(idade >= 16 && idade <= 17){
      System.out.println("Eleitor não obrigatório");
    }
    if(idade >= 18 && idade <= 65){
      System.out.println("Eleitor obrigatório");
      }
    if(idade > 65){
      System.out.println("Eleitor facultativo");
    }
    
    scanner.close();
  }
}
    
