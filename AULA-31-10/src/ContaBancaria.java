public class ContaBancaria {
    public Object sacar;
    private double saldo;

   ContaBancaria (double saldo){
        this.saldo = saldo;
    }

    public void Sacar(double valorsaque) throws SaldoException {
        if (valorsaque > getSaldo()) {
            throw new SaldoException("Não foi possível sacar, saldo baixo do valor de saque");
        }else {
            double saldoatual = saldo -  valorsaque;
            System.out.println("Saque realizado com sucesso! Saldo: " + saldoatual);
        }
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
