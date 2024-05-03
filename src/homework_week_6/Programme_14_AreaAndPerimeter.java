package homework_week_6;

/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Programme_14_AreaAndPerimeter {

    public static void areaAndPerimeterOfRectangle(int height, int width) { // no return with parameter
        int perimeter = 2 * (height + width); // formula is in the question (Perimeter is 2 * (5.6 + 8.5) = 28.20) we can use double if the numbers are in decimal
        int area = height * width; // formula is in question (Area is 5.6 * 8.5 = 47.60)
        System.out.println("The area of the rectangle is : " + area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);

    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in); // declaring scanner class
        System.out.println("Enter the width of the rectangle: ");
        int height = scanner.nextInt(); // object declaration of class. 'width' is the obj name
        System.out.println("Enter the height of the rectangle: ");
        int width = scanner.nextInt(); // object declaration of class. 'height' is the obj name
        areaAndPerimeterOfRectangle(height, width); // we have called 'areaAndPerimeterOfRectangle' static method directly
        // closing the scanner object
        scanner.close();
    }


}
