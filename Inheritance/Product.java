package Inheritance;

public abstract class Product {
    private int price;
    private String color;
    private String brand;

    public Product(int price, String color,String brand){
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void fold(){
        System.out.println("foldoing my " + this.getBrand() +" clothes");
    }

    public abstract void wear();
}
