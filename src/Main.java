public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.mark = "Chevrolet";
        car.year = 2002;
        car.engine.Fuel_Type = "Gasolina";
        car.engine.power = 120;

        System.out.println(car.ignition_ON);
        System.out.println("--".repeat(15));
        System.out.println("O modelo do carro é: "+ car.mark);
        System.out.println("O Ano do carro é: "+ car.year);
        System.out.println("O Ano do carro é: "+ car.engine.Fuel_Type);
        System.out.println("O Ano do carro é: "+ car.engine.power);
        System.out.println("--".repeat(15));
        System.out.println(car.ignition_OFF);
    }
}