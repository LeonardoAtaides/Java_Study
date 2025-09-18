public class Pessoa {
    private String nome;
    private float peso;
    private float altura;
    private float imc;

    void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.printf("IMC: %.2f%n\n", imc);
    }

    public float calcularImc(){
        imc = this.peso / (this.altura * this.altura);
        return imc;
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

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
}
