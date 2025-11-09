public class ContaPoupanca extends Conta implements OperacoesBancarias{
    public ContaPoupanca(int numero, String titular, double saldo ){
        super(numero,titular, saldo);
    }

    @Override
    public void atualizarSaldo() {
        double rendimentoMensal = getSaldo() * 0.003;
        setSaldo(getSaldo() + rendimentoMensal);
        System.out.printf("Rendimento Mensal: R$%.2f%n", rendimentoMensal );
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
        System.out.println("Tipo de Conta: Poupança (CP) ");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numéro: " + getNumero());
        System.out.printf("Saldo Disponível: R$%.2f%n", getSaldo());
        System.out.println("-----------------------------\n");
    }


}
