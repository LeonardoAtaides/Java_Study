public class Pessoa {
    private String nome;
    private float peso;
    private float altura;
    float imc;

    void calcularImc(){
        imc = this.peso / (this.altura * this.altura);
        System.out.println(String.format("O seu IMC é: %.2f", imc));
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
