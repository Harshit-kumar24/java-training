package DateConversion;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateAssignment {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String userDate = scan.nextLine();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        try{
        Date parsedDate = formatter.parse(userDate);

        //Unix format
        long unixFormat = parsedDate.getTime();
        System.out.println("Unix format: "+unixFormat);

        //local timestamp(IST) to UTC

        SimpleDateFormat utcFormatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utcTime = utcFormatter.format(parsedDate);
        System.out.println("UTC format: "+utcTime);

        //UTC to Local timestamp(IST)
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

        Date utcParsedDate = utcFormatter.parse(utcTime);
        String istTime = formatter.format(utcParsedDate);
        System.out.println("IST time: "+istTime);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        scan.close();
    }
}
