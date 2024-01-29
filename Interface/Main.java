package Interface;

public class Main {
    public static void main(String[] args){
        Cake cake = new Cake(2020);

        cake.bake();

        cake.setCalories(2200);
        System.out.println("Calories: "+ cake.getCalories());

    }
}
