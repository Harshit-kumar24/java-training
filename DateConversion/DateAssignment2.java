package DateConversion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DateAssignment2 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        String userDate = scan.nextLine();
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        try{
            
        LocalDateTime currentDate = LocalDateTime.parse(userDate,formatter);
        System.out.println("Current Date: "+ currentDate);
        //adding one day
        LocalDateTime incrementedDate = currentDate.plusDays(1);
        System.out.println("One day added: "+ incrementedDate);

        //subtracting 10 days
        LocalDateTime decrementDate = currentDate.minusDays(10);
        System.out.println("Decremented 10 days: "+decrementDate);

        //Adding an hour
        LocalDateTime oneHrsIncrementDate = currentDate.plusHours(1);
        System.out.println("One Hour added: "+oneHrsIncrementDate);

        //Subtracting 5 hrs and 30 min
        LocalDateTime subSpecificTimeDate = currentDate.minusHours(5).minusMinutes(30);
        System.out.println("Decremented 5 hrs & 30 min: "+subSpecificTimeDate);

        List<LocalDateTime> dateData = new ArrayList<>();
        dateData.add(currentDate);
        dateData.add(incrementedDate);
        dateData.add(decrementDate);
        dateData.add(oneHrsIncrementDate);
        dateData.add(subSpecificTimeDate);

        Collections.sort(dateData);

        System.out.println("printing the dates in sorted order: ");

        for(LocalDateTime date: dateData){
            System.out.println(date);
        }
    }
    catch(DateTimeParseException e){
        e.printStackTrace();
    }
    scan.close();
      }
}
