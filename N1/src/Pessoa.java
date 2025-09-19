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
        if(peso > 0 && altura > 0){
            imc = this.peso / (this.altura * this.altura);
            return imc;
        }else{
            System.out.println("Não foi possível calcular IMC\n");
            return 0;
        }
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
            System.out.println("Peso inválido!");
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
