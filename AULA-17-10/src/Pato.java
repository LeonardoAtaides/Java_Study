public class Pato implements Voavel, Nadavel{
    private String nome;

    public Pato(String nome){
        this.nome = nome;
    }

    @Override
    public void nadar(){
        System.out.println(nome + " está nadando a " + VELOCIDADE_MAXIMA + " Km/h");
    }

    @Override
    public void voar(){
        System.out.println(nome + " está voando " + ALTITUDE_MAXIMA + " metros acima do solo.");
    }

}
