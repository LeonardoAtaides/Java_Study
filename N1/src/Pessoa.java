public class Pessoa {
    String nome;
    float peso;
    float altura;
    float imc;

    void calcularImc(){
        imc = this.peso / (this.altura * this.altura);
        System.out.println(String.format("O seu IMC é: %.2f", imc));
    }

}
