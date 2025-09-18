public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Atleta p2 = new Atleta();

        // PESSOA COMUM
        System.out.println("-- Pessoa Comum --");
        p1.setNome("Leonardo");
        p1.setAltura(1.70f);
        p1.setPeso(68.0f);

        p1.calcularImc();
        p1.mostrarDados();


        // ATLETA
        System.out.println("-- Atleta --");
        p2.setNome("Ataídes");
        p2.setAltura(1.70f);
        p2.setPeso(68.0f);
        p2.setEsportePraticado("Futebol");

        p2.calcularImc();
        p2.mostrarDados();

    }
}