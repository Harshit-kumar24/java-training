
import java.nio.file.*;
import java.util.Scanner;

public class NioExample {
    public static void main(String[] args){

        //taking user input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the text to write: ");        
        String userInput = scan.nextLine();

        //write to given file
        Path filePath = Paths.get("input.txt");

        try{
            //writing to the file
            Files.write(filePath,userInput.getBytes());
            System.out.println("File is updated with user input");

            //reading from the file
            byte[] readBytes = Files.readAllBytes(filePath);
            String readContent = new String(readBytes);

            System.out.println("Content written in the file is: ");
            System.out.println(readContent);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            scan.close();
        }
    }
}
