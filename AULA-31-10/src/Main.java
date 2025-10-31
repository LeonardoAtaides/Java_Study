public class Main {
    public static void main(String[] args){
        /*try {
            int a = 10;
            int b = 0;
            int c = a / b;

        }catch (ArithmeticException e){
            System.out.println("Deu ruim aí chefe. calculo impossível " + e.getMessage());
        }// não é obrigatório  -  finally {}*/


        /*Calculadora calculadora = new Calculadora();
        try {
            calculadora.dividir(10, 0);
        }catch (DividirPorZeroException e){
            System.out.println("Erro: " + e.getMessage());
        }*/


        ContaBancaria conta = new ContaBancaria(1000);
        try{
            conta.Sacar(1000);
        }catch (SaldoException e){
            System.out.println("Erro: " + e.getMessage());
        }



    }
}
