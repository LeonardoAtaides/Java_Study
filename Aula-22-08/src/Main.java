public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        Ebook ebook = new Ebook(autor);

        ebook.setNome("Herança em Java");
        ebook.mostrarDetalhes();

    }
}