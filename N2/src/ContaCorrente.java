public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, String titular, double saldo ){
        super(numero,titular, saldo);
    }

    @Override
    public void atualizarSaldo() {
        double rendimentoMensal = getSaldo() * 0.003;
        setSaldo(getSaldo() + rendimentoMensal);
        System.out.println("Rendimento Mensal: " + rendimentoMensal );
        System.out.println("Saldo atual: " + getSaldo());
    }
}
