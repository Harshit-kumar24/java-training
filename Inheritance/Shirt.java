package Inheritance;

public class Shirt extends Product {
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public Shirt(int price, String color,String brand, Size size){
        super(price,color,brand);
        this.size = size;
    }
    public Size getSize(){
        return this.size;
    }

    public void setSize(Size size){
        this.size = size;
    }
    
    @Override
    public void fold(){
        super.fold();
        System.out.println("shirt is getting folded on the table");
    }
    
    @Override
    public void wear(){
        System.out.println("wear this in upperhalf of the body");
    }


}
