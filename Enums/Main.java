package Enums;
import static Enums.Car.TrafficLights;
public class Main {
    public static void main(String[] args){
        Car car = new Car("Nissan-GTR",2014);

        car.drive(TrafficLights.GREEN);
    }
}
