package dateconversion.example.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConv {
    public static void main(String[] args){
        //converting current date to desired format
        Date newDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate  = dateFormat.format(newDate);
        System.out.println("formatted date is "+formattedDate);

        //parsing a string to date
        String parsedString = "2024-01-28 99:88:22";

        try{
            Date parsedDate = dateFormat.parse(parsedString);
            System.out.println("Parsed date is "+parsedDate);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }
}
