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
#autobuild job
    // importing the File class
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}

#WEBHOOK JOB FOR THE QEDGETECHREPO
    #CODE FOR USER_MONTHLY_CRED_REPORTS
