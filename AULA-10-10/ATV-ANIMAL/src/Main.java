import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
        Animal gato = new Gato("Miauzinho");
        gato.fazerSom();
        gato.dormindo();

        Animal cachorro = new Cachorro("Joaquim");

        cachorro.fazerSom();
        cachorro.dormindo();
*/


        ArrayList<Animal> listaAnimais = new ArrayList<>();

        listaAnimais.add(new Gato("Mimi"));
        listaAnimais.add(new Gato("Bidu"));
        listaAnimais.add(new Cachorro("Joaguim"));
        listaAnimais.add(new Cachorro("Pipoca"));

        for (Animal i : listaAnimais) {
            i.fazerSom();
            i.dormindo();
        }

    }
}