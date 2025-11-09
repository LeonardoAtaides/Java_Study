public interface OperacoesBancarias {

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException;

    public void imprimirExtrato();

}
