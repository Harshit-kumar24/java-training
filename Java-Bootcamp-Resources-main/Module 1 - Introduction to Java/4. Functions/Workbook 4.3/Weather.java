public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        
        
    }

     public static double fahrenheitToCelsius(double fahrenheit){
        double celcius = (fahrenheit - 32) * (5/9);

        return celcius;
     }

    public static void printTemperatures(double fahrenheit){
            System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit) +"\n");
    }
}