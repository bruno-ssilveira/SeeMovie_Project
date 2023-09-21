import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        for (int tries = 0; tries < 5; tries++) {
            int aleatoryNumber = new Random().nextInt(100);

            System.out.println("Adivinhe o número aleatório entre 1 e 100, são 5 tentativas: ");
            int number = leitor.nextInt();

            if (number == aleatoryNumber) {
                System.out.println("Você acertou!");
                break;
            } else if (tries < 3){
                    if(number > aleatoryNumber) {
                        System.out.println("O número digitado era maior que o sorteado.");
                    } else {
                        System.out.println("O número digitado era menor que o sorteado.");
                    }
                    System.out.println("Mais uma chance.");

            } else if (tries < 4){
                if(number > aleatoryNumber) {
                    System.out.println("O número digitado é maior que o sorteado.");
                } else {
                    System.out.println("O número digitado é menor que o sorteado.");
                }
                System.out.println("Última chance!");

            } else {
                System.out.println("Não foi dessa vez! :(");
            }
        }

    }

}