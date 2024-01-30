package EncryptionDecryption;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;

public class RSAEncryptionExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //taking user input for encryption and decrpytion
        System.out.println("Please enter the string to be encrypted: ");
        String originalMessage = scan.nextLine();

        try{
            //generating a secret key
            KeyPair secretKey = generateSecretKey();

            //encrypting
            String encryptedMessage = encrypt(originalMessage,secretKey.getPublic());
            System.out.println("The encrypted message is: "+encryptedMessage);

            //decrypting
            String decryptedMessage = decrypt(encryptedMessage,secretKey.getPrivate());
            System.out.println("The decrypted message is: "+decryptedMessage);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            finally{
                scan.close();
            }
        }


        //generate key function
        
    private static KeyPair generateSecretKey() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048); 
        return keyPairGenerator.generateKeyPair();
    }

        //encryption function
    private static String encrypt(String message, PublicKey publicKey) throws Exception{
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] encryptedBytes = cipher.doFinal(message.getBytes());

        return new String(java.util.Base64.getEncoder().encode(encryptedBytes));
    }
        //decryption function
      public static String decrypt(String encryptedMessage, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage.getBytes());
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);

        return new String(decryptedBytes);
    }
    
    }
