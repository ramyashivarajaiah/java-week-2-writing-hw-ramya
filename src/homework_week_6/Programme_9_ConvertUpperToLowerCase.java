package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */

public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in); // declaring a scanner class
        System.out.println("Enter the uppercase string : "); // we are getting input from customer
        String uppercase = scanner.nextLine(); // declaring a scanner object. 'uppercase' is the scanner object name
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase(); // we have called instance method by creating an object
        t.convertUppercaseToLowerCase(uppercase); //
        // closing the scanner object
        scanner.close();

    }

    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text) { // method name is convertUppercaseToLowerCase. String data type coz its a text
        System.out.println("The Lowercase value is = " + text.toLowerCase());

    }

}
