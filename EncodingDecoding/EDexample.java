package EncodingDecoding;

import java.util.Base64;

public class EDexample {
    public static void main(String[] args){
        //encoding to string
        String exampleString = "This string is going to be encoded";
        byte[] exampleInByte = exampleString.getBytes();
        
        String encodedString = Base64.getEncoder().encodeToString(exampleInByte);

        System.out.println("Encoded String: "+encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);

        System.out.println("Decoded String: "+ decodedString);


    }
}
