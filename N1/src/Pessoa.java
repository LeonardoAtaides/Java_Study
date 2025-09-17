public class Pessoa {
    private String nome;
    private float peso;
    private float altura;
    float imc;

    void mostrarDados(){
        System.out.println("-- Pessoa Comum --");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    void calcularImc(){
        imc = this.peso / (this.altura * this.altura);
        System.out.println(String.format("IMC: %.2f", imc));
        System.out.println("\n");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
