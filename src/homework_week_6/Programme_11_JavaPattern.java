package homework_week_6;

/* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */

public class Programme_11_JavaPattern {
    public static void main(String[] args) {
        Programme_11_JavaPattern t = new Programme_11_JavaPattern(); // declaring object 't' to call instance method into main method
        t.javaPattern();

    }

    public void javaPattern() {// this is no return no parameter/argument
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");

    }
}
