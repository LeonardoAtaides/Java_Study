public abstract class FormaGeometrica {
    protected String cor;

    public FormaGeometrica(String cor){
        this.cor = cor;
    }

    public void exibirCor(String cor){
        System.out.println("A cor da forma e: "+ cor);
    }

    public String getCor() {
        return cor;
    }
}
