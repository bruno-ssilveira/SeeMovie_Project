import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filmeFav = leitura.nextLine();

        System.out.println(filmeFav);

    }

}
