
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Leonardo";
        p1.altura = 1.70f;
        p1.peso = 68.0f;


        System.out.println(p1.nome);
        System.out.println(p1.altura);
        System.out.println(p1.peso);
        p1.calcularImc();


    }
}