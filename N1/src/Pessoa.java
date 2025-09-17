public class Pessoa {
    private String nome;
    private float peso;
    private float altura;
    float imc;

    void mostrarDados(){
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
        if (altura > 0){
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso > 0){
            this.peso = peso;
        }else {
            System.out.println("Peso inválido! \n");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
