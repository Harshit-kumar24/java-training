public class WeatherNetwork {
    public static void main(String[] args) {


        
        int temp = 25;  
        String forecast = "";

        if(temp<=-1){
            forecast = "The forecast is FREEZING! wear a coat";
        }
        else if(temp<=10){
            forecast = "The forecast is chilly! wear a coat";
        }
        else{
            forecast = "It is warm! go outside";
        }
        
        System.out.println(forecast);
    }
}
