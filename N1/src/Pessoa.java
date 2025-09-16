public class Pessoa {
    String nome;
    float peso;
    float altura;
    float imc;

    void calcularImc(){
        imc = this.peso / (this.altura * this.altura);
    }

}
