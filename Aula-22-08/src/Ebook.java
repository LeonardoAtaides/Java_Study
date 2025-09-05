public class Ebook  extends  Livro{
    private String watermark;

    public Ebook (Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 15){
            System.out.println("Desconto não pode ser maior que 15%");
            return false;
        }

        return super.aplicarDescontoDe(porcentagem);
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
