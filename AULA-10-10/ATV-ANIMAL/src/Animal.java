public abstract class Animal {
    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void dormindo(){
        System.out.println( getNome() + " está dormindo!");
    }

    public abstract void fazerSom();

    public String getNome() {
        return nome;
    }
}
