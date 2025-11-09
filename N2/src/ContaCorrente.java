public class ContaCorrente extends Conta{

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
}
