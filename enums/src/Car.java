package enums.src;

public class Car {
    private String name;
    private int year;
    public enum TrafficLights {RED,GREEN,YELLOW};

    public Car(){

    }

    public Car(String name,int year){
        this.name = name;
        this.year = year;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setyear(int year){
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public int getyear(){
        return this.year;   
    }

    public void drive(TrafficLights signal){

        if(signal==null){
            throw new IllegalArgumentException("signal can't be null");
        }
        
        switch(signal){
            case RED:
                System.out.println("you can't drive");
                break;
            case YELLOW:
                System.out.println("you have to wait for a while");
            case GREEN:
                System.out.println("you can go gentleman");
        }
    }
    
}
