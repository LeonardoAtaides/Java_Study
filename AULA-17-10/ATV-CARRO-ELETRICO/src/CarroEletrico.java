public class CarroEletrico  implements  Autonomo, Recarregavel{
    private String modelo;
    private String destino;
    private int minutos;

    CarroEletrico(String modelo, String destino, int minutos){
        this.modelo = modelo;
        this.destino = destino;
        this.minutos = minutos;
    }


    @Override
    public void dirigirautonomo() {
        System.out.println("O " + modelo + " está dirigindo autonomamente: " + SUPORTE_GPS + " para o" + destino);
    }

    @Override
    public void regarregar() {
        if (TEMPO_MAXIMO < 30 ){
            System.out.println("O " + modelo + " está regarregando por " + minutos + " minutos");
        }else{
            System.out.println("Tempo não aceito!");
        }

    }
}
