/*
Enunciado: Desafio Veiculos Elétrico

Crie duas interfaces
1- Recarregavel{
- Método abstrato *regarregar*, que recebe paramêtros (int, tempo minutos),imprima "algo como regarregando por X minutos"
- Constante int TEMPO_MAXIMO = 30
}

2- Autonomo {
- Método abstrato *dirigirautonomo* , que recebe como paremetro como (string, destino), imprimindo "dirigindo autononamente para o destino"
- Constante boolean SUPORTE_GPS = TRUE
}

Crie uma classe carro eletrico que implemente ambas as interfaces, adicione o atributo string MODELO no construtor, nas implementações use o modelo - Ex: "O modelo X está regarregando"
Na classe teste veiculo- (MAIN) crie um objeto CarroEltrico, chame o metodo via referencias das interfaces (polimorfismo) e use as constantes

*/

public class Main {
    public static void main(String[] args) {

    CarroEletrico carro = new CarroEletrico("BYD", "Park Way", 30);
        carro.dirigirautonomo();
        carro.regarregar();

        }
    }
