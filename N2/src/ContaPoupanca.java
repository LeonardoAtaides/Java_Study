public class ContaPoupanca extends Conta implements OperacoesBancarias{
    public ContaPoupanca(int numero, String titular, double saldo ){
        super(numero,titular, saldo);
    }

    @Override
    public void atualizarSaldo() {
        double rendimentoMensal = getSaldo() * 0.003;
        setSaldo(getSaldo() + rendimentoMensal);
        System.out.println("Rendimento Mensal: " + rendimentoMensal );
        System.out.println("Saldo atual: " + getSaldo());
    }

    @Override
    public void transferir(Conta destino, double valor){
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            System.out.printf("R$%.2f Transfêrido com sucesso%n", valor);
        }else {
            System.out.println("Saldo insuficiente para realizar a transfência!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n------ Extrato Conta Corrente ------");
        System.out.println("Titular da Conta: " + getTitular());
        System.out.println("Numéro: " + getNumero());
        System.out.println("Saldo Disponível: " + getSaldo());
        System.out.println("-------------------------------------\n");
    }


}
