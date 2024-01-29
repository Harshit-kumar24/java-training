package Interface;

public class Cake implements Desert{
    private int calories;


    public Cake(int calories){
        this.calories = calories;
    }
    
    @Override
    public void bake(){
        System.out.println("the cake is getting baked");
    }

    @Override
    public int getCalories(){
        return this.calories;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }
    
}
