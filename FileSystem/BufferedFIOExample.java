import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFIOExample{
    public static void main(String[] args){
        //writing in a file
        String[] names = {"harshit","ayushi","zama sir"};

        try{ 
        BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
        writer.write("This is a testing text, would you like some tea.");
        writer.write("\nThis is another line in the file");

        for(String it: names){
               writer.write("\n"+it) ;
        }
        writer.close();

        }
         catch (IOException e) {
            e.printStackTrace();
        }
        
        //Reading from a file
        try{
            BufferedReader reader = new BufferedReader( new FileReader("input.txt"));
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }



    
}





