public class Main {
    public static void main(String[] args) {

        System.out.println("This is the See Movie!");
        System.out.println("Movie: Avatar");

        int anoDeLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com seres azuis de 3m que habitam Pandora.";
        System.out.println(sinopse);

        //Três aspas para permitir pular linha no texto. /* blablabla */ para um bloco de texto.
        String pulaLinha;
        pulaLinha = """
                Um filme muito bom!
                Recomendo de verdade que assistam.
                """;
        System.out.println(pulaLinha);
    }
}