
public class Main {
    public static void main(String[] args) {
        // Erro de compilação
        // FormaGeometrica forma = new FormaGeometrica("Preto");

        // Representação do Polimorfismo
        FormaGeometrica circulo = new Circulo("Preto", 5);
        circulo.exibirDetalhes();

        System.out.println();

        FormaGeometrica retangulo = new Retangulo("Amarelo", 10, 5);
        retangulo.exibirDetalhes();




        }
    }
