public class Calculadora {

    public void dividir(int a, int b) throws DividirPorZeroException{
        if (b == 0){
            throw new DividirPorZeroException("Não foi possivel dividir por zero");
        }

        int c = a / b ;
    }
}
