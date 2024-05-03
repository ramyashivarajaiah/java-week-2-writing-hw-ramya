package homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme_3 {

    //3.1 Declare one instance and one static variable.

    String name = " Prime ";
    static String surname = " Testing ";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.

    public void instanceMethod() {//method naming convention - firstletter will be lowecase and the inner word will start with uppercase
        System.out.println(name); // we have called directly coz both variable and method are instance
        System.out.println(Programme_3.surname); // we have called surename directly using classname. Static variable can be called anywhere within the class using the class name without creating an object.

    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.

    public static void staticMethod() {
        System.out.println(surname); // we have called surname directly coz both method and variable are static
        Programme_3 programme_3 = new Programme_3(); // we have created object to call instance variable to static method
        System.out.println(programme_3.name); // we have called static varaible 'name' through object

    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.

    public static void main(String[] args) {
        Programme_3 programme_3 = new Programme_3();  // we have created an object to call instance method ('instanceMethod')
        programme_3.instanceMethod(); //we have called 'instanceMethod' through object
        staticMethod();

    }

}