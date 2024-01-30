package EncryptionDecryption;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class CipherEDExample {
    public static void main(String[] args){
        String originalMessage = "This string is going to be encrypted and decrypted";

        try{
        //generating secret key
        SecretKey secretKey = generateSecretKey();
        //encrypting
        String encryptedMessage = encrypt(originalMessage,secretKey);
        System.out.println("Encrypted message: "+encryptedMessage);

        //decrypting
        String decryptedMessage = decrypt(encryptedMessage,secretKey);
        System.out.println("Decrypted message: "+decryptedMessage);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static SecretKey generateSecretKey() throws Exception{
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); 
        return keyGenerator.generateKey();
         };

    private static String encrypt(String message,SecretKey secretKey) throws Exception{
        Cipher cipher  = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);

        byte[] encryptBytes = cipher.doFinal(message.getBytes());

        return Base64.getEncoder().encodeToString(encryptBytes);
    }

    private static String decrypt(String encryptedMessage,SecretKey secretKey) throws Exception{
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE,secretKey);

        byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);

        return new String(decryptedBytes);
    }
}


