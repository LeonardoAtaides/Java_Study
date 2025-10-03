public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Atleta p2 = new Atleta();
        Pessoa p3 = new Pessoa();

        // PESSOA COMUM
        System.out.println("-- Pessoa Comum --");
        p1.setNome("Leonardo");
        p1.setAltura(1.70f);
        p1.setPeso(68.0f);

        p1.calcularImc();
        p1.mostrarDados();

        // ATLETA
        System.out.println("\n-- Atleta --");
        p2.setNome("Ataídes");
        p2.setAltura(1.70f);
        p2.setPeso(68.0f);
        p2.setEsportePraticado("Futebol");

        p2.calcularImc();
        p2.mostrarDados();

        // PESSOA COMUM
        System.out.println("\n-- Pessoa Comum --");
        p3.setNome("Maria");
        p3.setAltura(0.00f);
        p3.setPeso(00.0f);

        p3.calcularImc();
        p3.mostrarDados();

    }
}