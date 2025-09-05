public class Ebook  extends  Livro{
    private String watermark;

    public Ebook (Autor autor){
        super(autor);
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
