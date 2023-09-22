public class Movie {
    // Atributos da classe Movie
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    // Utilizando o "get" para poder acessar o totalDeAvaliacoes que está privado. Tornando privado, impossibilita esse atributo de ser acessado e modificado diretamente, sendo possível somente por métodos da classe.
    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    //Um método para exibir a Ficha Técnica do filme.
    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluso no plano: " + incluidoNoPlano);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}