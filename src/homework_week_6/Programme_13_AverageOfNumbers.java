package homework_week_6;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in); //scanner class declaration
        System.out.println("Enter the first number: "); //user is expected to enter input
        double X = scanner.nextDouble(); //scanner object declaration. 'X' is the obj name
        System.out.println("Enter the second number: "); //user is expected to enter input
        double Y = scanner.nextDouble(); //scanner object declaration. 'Y' is the obj name
        System.out.println("Enter the third number: "); //user is expected to enter input
        double Z = scanner.nextDouble(); //scanner object declaration. 'Z' is the obj name
        averageOfThreeNumbers(X, Y, Z);
        //closing the scanner object
        scanner.close();
    }

    // Calculation the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.print("The average of " + a + " , " + b + " and " + c + " is : " + average);

    }
}
