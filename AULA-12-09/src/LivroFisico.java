public class LivroFisico extends Livro {

    private double taxadeImpressao;

    LivroFisico( Autor autor){
        super(autor);
    }

    @Override
     public void mostrarDetalhes(){
        String mensagem = "Detalhes fdo Livro:";
        System.out.println(mensagem);

        System.out.println("Nome: " + this.getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Taxa de Impressão: " + this.getTaxadeImpressao());
        System.out.println("------------");


        if(temAutor()){
            this.getAutor().mostrarDetalhesAutor();
        }

        System.out.println("---------");
    }

    public double getTaxadeImpressao() {
        return this.getValor() * 5 /100;
    }

    public void setTaxadeImpressao(double taxadeImpressao) {
        this.taxadeImpressao = taxadeImpressao;
    }
}
