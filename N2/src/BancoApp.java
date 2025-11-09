public class BancoApp {
    public static void main(String[] args) {
        ContaCorrente teste = new ContaCorrente(123, "Joao", 0);
        ContaPoupanca teste2 = new ContaPoupanca(321, "Pedro", 0);

        System.out.println("==== Conta Corrente=====");
        teste.depositar(1200);
        try {
            teste.sacar(10);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            teste.transferir(teste2, 100);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        teste.atualizarSaldo();
        teste.imprimirExtrato();

        System.out.println("==== Conta Poupança=====");
        teste2.depositar(200);
        try {
            teste2.sacar(10);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            teste2.transferir(teste2, 0);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        teste2.atualizarSaldo();
        teste2.imprimirExtrato();


    }
    }
