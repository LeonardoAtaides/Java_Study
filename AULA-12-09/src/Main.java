public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        Ebook ebook = new Ebook(autor);

        ebook.setNome("Herança em Java");


        LivroFisico livrofisico = new LivroFisico(autor);
        livrofisico.setNome("TESTE");
        livrofisico.setValor(400);

        CarrinhodeCompras carrinhodeCompras = new CarrinhodeCompras();
        carrinhodeCompras.adicionarLivro(livrofisico);
        carrinhodeCompras.adicionarLivro(ebook);


    }
}