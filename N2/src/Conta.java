public abstract class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            setSaldo( getSaldo() + valor);
            System.out.printf("Deposito de R$%.2f realizado com sucesso!%n", getSaldo());
        }else {
            System.out.println("Não e possivel depositar valor negativo!");
        }
    }


    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException("Não foi possível sacar, sem saldo suficiente!");
        }else {
            System.out.printf("Saque de R$%.2f realizado com sucesso!%n", valor);
            setSaldo( getSaldo() - valor);
        }
    }


    public abstract void atualizarSaldo();


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
