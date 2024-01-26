import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions.
        
        
        Scanner scan = new Scanner(System.in);
        int score = 0;

        String input;
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");

        input = scan.nextLine();
        if(input.equals("Brazil")){
            score+=5;
        }
        

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
       
        input = scan.nextLine();
        if(input.equals("Mercury")){
            score+=5;
        }

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");

        input = scan.nextLine(); 
        if(input.equals("AB-negative")){ 
            score+=5;
        }

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");

        input = scan.nextLine();
        if(input.equals("Hermione")){
            score+=5;
        }



        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        
        System.out.println("Your final score is: " + score + "/20");


        if(score>=15){
            System.out.println("Wow, you know your stuff");
        }
        else if(score>=5 && score<15){
            System.out.println("Not bad!");
        }
        else{
            System.out.println("better luck next time");
        }


        scan.close();

    }
}
