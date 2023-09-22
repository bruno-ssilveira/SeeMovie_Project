public class Principal {
    public static void main(String[] args) {
        Movie avatar = new Movie();

        avatar.nome = "Avatar";
        avatar.anoDeLancamento = 2023;
        avatar.duracaoEmMinutos = 183;
        avatar.incluidoNoPlano = true;

        System.out.println(avatar);
        System.out.println(avatar.nome);

        avatar.exibeFichaTecnica();
        avatar.avalia(5);
        avatar.avalia(6);
        avatar.avalia(7);
        System.out.println("Total de avaliações: " + avatar.getTotalDeAvaliacoes());
        System.out.println(avatar.pegaMedia());
    }
}