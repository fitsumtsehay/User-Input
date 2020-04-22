// Program will ask user input. After the user gives answer program ends
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Create a Scanner object
        String firstName = "";
        System.out.print("Enter your first name: ");
        firstName = keyboard.next();   // read user input
        while (firstName != "") {
            System.out.println("Your First name is: " + firstName);
            break; // end process
        }
    }
}

