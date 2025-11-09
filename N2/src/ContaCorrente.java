public class ContaCorrente extends Conta implements OperacoesBancarias{

    public ContaCorrente(int numero, String titular, double saldo ){
        super(numero,titular, saldo);
    }

    @Override
    public void sacar(double valor) throws SaldoExcecao {
        double taxaOp = valor * 0.005;
        double saldoFinal = valor + taxaOp;

        System.out.println("Sacando...");
        if (saldoFinal > getSaldo()) {
            throw new SaldoExcecao("Não foi possível sacar, sem saldo suficiente!");
        }else {
            System.out.println("taxa de operação: " + saldoFinal );
            setSaldo(getSaldo() - saldoFinal );
        }
    }

    @Override
    public void atualizarSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n", getSaldo());
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
