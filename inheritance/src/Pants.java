package inheritance.src;

public class Pants extends Product{
    private Waist waist;
    public enum Waist {SMALL, MEDIUM, LARGE}

    public Pants(int price,String color,String brand,Waist waist){
        super(price,color,brand);
        this.waist = waist;
    }

    public Waist getWaist(){
        return this.waist;
    }

    public void setWaist(Waist waist){
        this.waist = waist;
    }

    @Override 
    public void wear(){
        System.out.println("wear these in lower half of the body");
    }
    
}
