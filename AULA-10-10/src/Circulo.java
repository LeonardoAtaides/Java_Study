public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String cor) {
        super(cor);
        this.raio = raio;
    }

    public void calcularArea(){
        double area = Math.PI * raio * raio;
        System.out.println("A area do circulo é: " + area);
    }


}