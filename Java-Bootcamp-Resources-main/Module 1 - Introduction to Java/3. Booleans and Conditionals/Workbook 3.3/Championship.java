public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        int pointsMargin = gryffindor-ravenclaw;
        
        if(pointsMargin>=100){
                System.out.println("gryffindor is in 1st place");
        }
        else if(pointsMargin>=0){
                System.out.println("gryffindor is in second place" );
        }
        else if(pointsMargin>=-100){
            System.out.println("gryffindor is in third place");
        }
        else{
            System.out.println("gryffindor is in fourth place");
        }
    }
}
