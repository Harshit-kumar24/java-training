package interfaces.src;

public class InterfaceExample {
    public static void main(String[] args){
        Cake cake = new Cake(2020);

        cake.bake();

        cake.setCalories(2200);
        System.out.println("Calories: "+ cake.getCalories());

    }
}
