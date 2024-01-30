package enums.src;
import enums.src.Car.TrafficLights;

public class EnumsExample {
    public static void main(String[] args){
        Car car = new Car("Nissan-GTR",2014);

        car.drive(TrafficLights.GREEN);
    }
}
