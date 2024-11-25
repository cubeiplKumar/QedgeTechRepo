// A class with private access specifier
public class MyClass {

    // Private field
    private int privateField = 10;

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Public method to access private members
    public void accessPrivateMembers() {
        // Accessing the private field
        System.out.println("Private Field: " + privateField);

        // Calling the private method
        privateMethod();
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing private members through a public method
        myObject.accessPrivateMembers();
    }
}