


import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Qual altura você deseja atingir em metro ?");
    double altura = input.nextDouble();
    System.out.println("Qual altura de cada degrau metro ?");
    double degrau = input.nextDouble();

        double alturatotal = (altura/degrau);

    System.out.println("Você precisará subir " + alturatotal + " degraus");
    
    

    
  }
}
