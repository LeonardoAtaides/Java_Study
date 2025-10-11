public class Animal {
    protected String nome;


    public Animal(String nome){
        this.nome = nome;
    }

    void AnimalDormir(){
        System.out.println("O " + getNome() + "está dormindo!");
    }

    public abstract String FazerSom();


    public String getNome() {
        return nome;
    }
}
