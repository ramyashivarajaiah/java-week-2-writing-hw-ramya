package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Programme_8_AreaOfTriangle {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in); // we have declared a scanner class
        System.out.println("Please enter the length of the triangle : ");
        int length = scanner.nextInt(); // to get input from the user for length
        System.out.println("Please enter the height of the triangle : ");
        int height = scanner.nextInt(); // to get input from the user for height
        areaOfTriangle(length, height); // we have called 'areaOfTriangle' method directly as main method and method both as static
        // closing the scanner object
        scanner.close();

    }

    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height) { // areaOfTriangle is with parameter/argument
        int area = (length * height) / 2; // formula for calculating triangle is 'area = (base/length * height) / 2'
        System.out.println("The Area of a triangle is : " + area); // print statement with concotination

    }
}
