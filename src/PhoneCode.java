import java.util.Scanner;
//=============================================================================
public class PhoneCode {
    //-----------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int phoneNumber;

        do {
            System.out.print("Please enter your 305 phone number:  ");
            phoneNumber = keyboard.nextInt();
        } while (phoneNumber < 1000000 && phoneNumber > 9999999);
        System.out.println("The phone number 305" +phoneNumber + "can be encoded as" );
        numbersToString(305);
        numbersToString(phoneNumber);



    }
//-----------------------------------------------------------------------------

    //-----------------------------------------------------------------------------
    private static void numbersToString(int phoneNumber) {
        char[] digitsStartAt = {'0', '1', 'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W'};
        int[] digitsHaveLetters = {1, 1, 3, 3, 3, 3, 3, 3, 4, 3, 4};

        int digit;
        String finalString = "";
        char letter;

        while (phoneNumber > 0) {
            digit = phoneNumber % 10;
            letter = (char) (Math.floor(Math.random() * digitsHaveLetters[digit]) + digitsStartAt[digit]);
            finalString = letter + finalString;
            phoneNumber = phoneNumber / 10;

        }

        System.out.print(finalString);


    }
    //-----------------------------------------------------------------------------

}
