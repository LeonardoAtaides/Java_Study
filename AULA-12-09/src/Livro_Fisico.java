public class Livro_Fisico extends Livro {

    private double taxadeImpressao;

    Livro_Fisico( Autor autor){
        super(autor);
    }

    public double getTaxadeImpressao() {
        return taxadeImpressao;
    }

    public void setTaxadeImpressao(double taxadeImpressao) {
        this.taxadeImpressao = taxadeImpressao;
    }
}
