package inheritance.src;

import inheritance.src.Pants.Waist;
import inheritance.src.Shirt.Size;
public class InheritanceExample {
    public static void main(String[] args){
        Shirt shirt = new Shirt(32322,"white","snitch",Size.MEDIUM);
        Pants pants = new Pants(34234,"black","snitch",Waist.LARGE);

        shirt.setBrand("armani");

        pants.fold();
        shirt.fold();
    }
}
