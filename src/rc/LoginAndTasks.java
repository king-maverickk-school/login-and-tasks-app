package rc;

import java.util.Scanner;

/**
 *
 * @author Motheo Moleko [ST10461408]
 */
public class LoginAndTasks {
    
    
    public static void main(String[] args) {
        // initialise a Scanner object for user input
        Scanner objScanner = new Scanner(System.in);
        
        // declare and initialise Login object
        Login login = new Login();
        
        // we will user login attributes because they are public
        // assigning values to attributes
        System.out.print("Enter your first name: ");
        login.fname = objScanner.next();
        
        System.out.print("\nEnter your last name: ");
        login.lname = objScanner.next();
        
        System.out.print("\nEnter your desired username: ");
        login.username = objScanner.next();
        
        System.out.print("\nEnter your password: ");
        login.password = objScanner.next();
        
        // close the scanner safely here
        objScanner.close();
               
        // performing username and password checks
        boolean unameCheck = login.checkUserName(login.username);
        boolean pWordCheck = login.checkPasswordComplexity(login.password);
        
        // display the message explaining whether password or username is correctly formatted or not
        String message = login.registerUser(unameCheck, pWordCheck);
        System.out.println(message);
        
        // verifies that the login details entered matches the login details stored during registration
        boolean isUserLoggedIn = login.loginUser(message);
        
        // outputs a message. is user logged in or not
        String status = login.returnLoginStatus(isUserLoggedIn);
        System.out.println(status);
    }
    
}
