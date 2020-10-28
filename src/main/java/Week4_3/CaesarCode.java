package Week4_3;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args){
        //Enter message and key for cipher
        String message, decryptedMessage = "";
        int key;
        char alphabet;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a message: ");
        message = sc.nextLine();

        System.out.println("Enter key, value by which each character in the message gets shifted: ");
        key = sc.nextInt();

        for(int i = 0; i < message.length(); i++){
            alphabet = message.charAt(i);

            //For alphabet between 'a' and 'z'
            if(alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char)(alphabet - key);

                if(alphabet < 'a'){
                    alphabet = (char)(alphabet + 'z' - 'a' + 1);
                }

                decryptedMessage += alphabet;
            }

            //For alphabet between 'A' and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z'){
                alphabet = (char)(alphabet - key);

                if(alphabet < 'A'){
                    alphabet = (char)(alphabet + 'Z' - 'A' + 1);
                }

                decryptedMessage += alphabet;
            }
            else {
                decryptedMessage += alphabet;
            }
        }

        System.out.println("Decrypted Message = " + decryptedMessage);
    }
}