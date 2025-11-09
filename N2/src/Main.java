public class Main {
    public static void main(String[] args) {
        ContaCorrente teste = new ContaCorrente(123, "Joao", 0);
        ContaCorrente teste2 = new ContaCorrente(321, "Pedro", 0);


        teste.depositar(1200);

        try {
            teste.sacar(10);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            teste.transferir(teste2, 1500);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        teste.imprimirExtrato();
    }
    }
