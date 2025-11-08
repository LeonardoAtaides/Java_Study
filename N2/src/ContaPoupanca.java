public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, String titular, double saldo ){
        super(numero,titular, saldo);
    }

    @Override
    public void sacar(double valor) throws SaldoExcecao {
        double taxaOp = valor * 0.003;
        double saldoFinal = valor + taxaOp;

        if (saldoFinal > getSaldo()) {
            throw new SaldoExcecao("Não foi possível sacar, sem saldo suficiente!");
        }else {
            System.out.println("taxa de operação: " + saldoFinal );
            setSaldo(getSaldo() - saldoFinal );
        }
    }

    @Override
    public void atualizarSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }
}
