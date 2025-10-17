//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Passaro passaro = new Passaro("Passareco");
        passaro.voar();

        System.out.println("--------------------------------------------");

        Voavel voavel = new Passaro("Mabel");
        voavel.voar();

        Pato pato = new Pato("Quaqua");
        pato.nadar();
        pato.voar();

    }
}
