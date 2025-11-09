public class ContaCorrente extends Conta implements OperacoesBancarias{

    public ContaCorrente(int numero, String titular, double saldo ){
        super(numero,titular, saldo);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double taxaOp = valor * 0.005;
        double saldoFinal = valor + taxaOp;

        if (saldoFinal > getSaldo()) {
            throw new SaldoInsuficienteException("Não foi possível sacar, sem saldo suficiente!");
        }else {
            System.out.printf("Saque de R$%.2f realizado com sucesso!%n", valor);
            setSaldo(getSaldo() - saldoFinal );
        }
    }

    @Override
    public void atualizarSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n", getSaldo());
    }

    @Override
    public void transferir (Conta destino, double valor) throws SaldoInsuficienteException{
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            System.out.printf("Transfência de R$%.2f realizado com sucesso!%n", valor);
        }else {
            throw new SaldoInsuficienteException("Não foi possível realizar a transfência, sem saldo suficiente!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n---------- Extrato ----------");
        System.out.println("Tipo de Conta: Corrente (CC) ");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numéro: " + getNumero());
        System.out.printf("Saldo Disponível: R$%.2f%n", getSaldo());
        System.out.println("-----------------------------\n");
    }
}
