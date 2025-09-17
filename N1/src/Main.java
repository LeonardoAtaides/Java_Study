
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Atleta p2 = new Atleta();


        p1.setNome("Leonardo");
        p1.setAltura(1.70f);
        p1.setPeso(68.0f);


        System.out.println(p1.getNome());
        System.out.println(p1.getAltura());
        System.out.println(p1.getPeso());
        p1.calcularImc();

        System.out.println("--------");

        p2.setNome("Ataídes");
        p2.setAltura(1.80f);
        p2.setPeso(75.0f);
        p2.setEsportePraticado("Vôlei");

        System.out.println(p2.getNome());
        System.out.println(p2.getAltura());
        System.out.println(p2.getPeso());
        System.out.println(p2.getEsportePraticado());
        p2.calcularImc();

    }
}