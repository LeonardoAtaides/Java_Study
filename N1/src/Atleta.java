public class Atleta extends Pessoa{
   private String esportePraticado;

    @Override
    void mostrarDados(){
        super.mostrarDados();
        System.out.println("Esporte:" + esportePraticado);
    }

   @Override
   void calcularImc(){
       imc = (this.getPeso() / (this.getAltura()* this.getAltura())) * 0.95f ;
       System.out.print(String.format("IMC: %.2f", imc));
       System.out.print("\t(reduzido em 5% pelo porte atlético!)");
   }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
