package homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programeme_4 {

    //4.1 Declare two instance and two static variables.
    //instance variable

    String name = "Prime"; //anything in string must be in quotation
    String surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.

    public void instanceMethod() { // method name should start with lowercase and inner word should start with uppercase
        System.out.println(Programeme_4.a); // static variable can be called anywhere within the class directly by using class name
        System.out.println(Programeme_4.b);
        System.out.println(name);
        System.out.println(surname);

    }

    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.

    public static void staticMethod() {
        Programeme_4 programme_4 = new Programeme_4(); // we have created an object. programme_4 is the object name
        System.out.println(programme_4.name); // we have called instance variable 'name' throught object 'programme_4'
        System.out.println(programme_4.surname); // we have called instance variable 'surname' throught object 'programme_4'
        System.out.println(a); // we have called static variable 'a' directly. static variable to static method we can call directly
        System.out.println(b); // we have called static variable 'b' directly. static variable to static method we can call directly

    }

    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.

    public static void main(String[] args) {
        Programeme_4 programme_4 = new Programeme_4(); // we have created an object. programme_4 is the object name
        programme_4.instanceMethod(); // we have called 'instanceMethod' throught object
        staticMethod(); //we have called static method 'staticMethod' directly. static variable to static method we can call directly
    }


}
