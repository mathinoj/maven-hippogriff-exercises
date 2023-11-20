import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;


public class Maven_Exercises {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("What it dew? ");
            String response = input.nextLine();
            System.out.println("isNumeric: " +StringUtils.isNumeric(response));
            System.out.println("Swap: " +StringUtils.swapCase(response));
            System.out.println("Reverse: " +StringUtils.reverse(response));

//Tells whether or not what the user entered is a number
//Flips the case of the string
//Reverses the string

        }
}
