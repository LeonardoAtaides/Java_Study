
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Leonardo");
        p1.setAltura(1.70f);
        p1.setPeso(68.0f);


        System.out.println(p1.getNome());
        System.out.println(p1.getAltura());
        System.out.println(p1.getPeso());
        p1.calcularImc();


    }
}