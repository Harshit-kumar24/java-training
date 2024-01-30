
import java.io.*;
import java.util.Scanner;

public class IOExample {
    public static void main(String[] args){

        //taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text to write in file: ");
        String userInput = scan.nextLine();
        scan.close();

        //writing from a file
        try(FileWriter writer = new FileWriter("input.txt")){
            writer.write(userInput);
            System.out.println("Succesfully written in the file");

        }
        catch(IOException e){
            e.printStackTrace();
        }

        //reading from a file
        try(FileReader reader = new FileReader("input.txt")){
            char[] buffer = new char[1024];
            int byteRead = reader.read(buffer);

            if(byteRead != -1){
                String contentRead = new String(buffer,0,byteRead);
                System.out.println("Content read from the file: "+contentRead);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
