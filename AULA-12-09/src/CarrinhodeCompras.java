public class CarrinhodeCompras {
    private double valorTotal;

    public void adicionarLivro(Livro livro){
        System.out.println("Livro adicionado ao carrinho:" + livro);
        //livro.aplicarDescontoDe(5);
        valorTotal += livro.getValor();
    }

    public double getValorTotal(){
        return valorTotal;
    }
}
