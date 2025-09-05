public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNomeAutor("J.R.R Tolkien");
        autor.setEmailAutor("jrrtolkien@gmail.com");
        autor.setCPFAutor("123.456.789-00");

        Livro livro  = new Livro();
        livro.setNome("O Senhor dos Anéis.");
        livro.setDescricao("Uma história de fantasia medieval.");
        livro.setValor(200);
        livro.setIsbn("123-456-78-9");

        livro.setAutor(autor);
        livro.mostrarDetalhes();

        System.out.println("O livro agora custa: " + livro.getValor());
        System.out.println(livro.temAutor());

    }
}