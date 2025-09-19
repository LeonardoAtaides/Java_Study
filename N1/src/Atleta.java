public class Atleta extends Pessoa{
   private String esportePraticado;

    @Override
    void mostrarDados(){
        super.mostrarDados();
        System.out.println("Esporte:" + esportePraticado);
    }

   @Override
   public float calcularImc(){
        if (this.getPeso() > 0 && this.getAltura() > 0){
            this.setImc(this.getPeso() / (this.getAltura() * this.getAltura()) * 0.95f);
            System.out.println("IMC reduzido em 5% pelo porte atlético");
        }else {
            System.out.println("Não foi possível calcular IMC\n");
        }
       return getImc();
   }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
