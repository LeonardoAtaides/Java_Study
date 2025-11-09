public class Main {
    public static void main(String[] args) {
        ContaCorrente teste = new ContaCorrente(123, "Joao", 0);
        ContaCorrente teste2 = new ContaCorrente(321, "Pedro", 0);


        teste.depositar(1200);
        teste.transferir(teste2,200);
        try {
            teste.sacar(10);

        } catch (SaldoExcecao e) {
            System.out.println(e.getMessage());
        }


    teste.imprimirExtrato();
    }
    }
