public class Main {
    public static void main(String[] args) {
        ContaCorrente teste = new ContaCorrente(123, "Joao", 0);


        teste.depositar(1200);
        try {
            teste.sacar(1000);

        } catch (SaldoExcecao e) {
            System.out.println(e.getMessage());
        }


        teste.atualizarSaldo();

    }
    }
