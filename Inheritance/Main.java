package Inheritance;

import Inheritance.Pants.Waist;
import Inheritance.Shirt.Size;
public class Main {
    public static void main(String[] args){
        Shirt shirt = new Shirt(32322,"white","snitch",Size.MEDIUM);
        Pants pants = new Pants(34234,"black","snitch",Waist.LARGE);

        shirt.setBrand("armani");

        pants.fold();
        shirt.fold();
    }
}
