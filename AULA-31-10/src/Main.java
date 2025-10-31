public class Main {
    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

        }catch (ArithmeticException e){
            System.out.println("Deu ruim aí chefe. calculo impossível " + e.getMessage());
        }// não é obrigatório  -  finally {}
    }
}
