public class Atleta extends Pessoa{
   private String esportePraticado;

    @Override
    void mostrarDados(){
        super.mostrarDados();
        System.out.println("Esporte:" + esportePraticado);
    }

   @Override
   public float calcularImc(){
       this.setImc(this.getPeso() / (this.getAltura() * this.getAltura()));
       return getImc();
   }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
