package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Motheo Moleko [ST10461408]
 */
public class LoginAndTasks {
    
    
    public static void main(String[] args) {
        String tName = "Add flowers";
        String devDeets = "Motheo";
        String[] tNameArr = tName.split(tName);
        String[] devDeetsArr = devDeets.split(devDeets);
        
        System.out.print(tNameArr[0]);

        JOptionPane.showMessageDialog(null, "This is the Tasks App. \nPlease register and log in before we get started!");
        
        // declare and initialise Login object
        Login login = new Login();
        
        // assigning values to attributes
        // we will login attributes because they are public
        login.fname = JOptionPane.showInputDialog("Enter your first name: ");
                
        login.lname = JOptionPane.showInputDialog("Enter your last name: ");

        login.username = JOptionPane.showInputDialog("Enter your desired username: \nEnsure you have less than 5 characters and an underscore (_)");
    
        login.password = JOptionPane.showInputDialog("Enter your password: ");
               
        // performing username and password checks
        boolean unameCheck = login.checkUserName(login.username);
        boolean pWordCheck = login.checkPasswordComplexity(login.password);

        // display the message explaining whether password or username is correctly formatted or not
        String message = login.registerUser(unameCheck, pWordCheck);
        JOptionPane.showMessageDialog(null, message);
        while (!message.endsWith("correctly.")){
            login.username = JOptionPane.showInputDialog("Enter your desired username: \nEnsure you have less than 5 characters and an underscore (_)");
            unameCheck = login.checkUserName(login.username);
            
            login.password = JOptionPane.showInputDialog("Enter your password: ");
            pWordCheck = login.checkPasswordComplexity(login.password);
            
            message = login.registerUser(unameCheck, pWordCheck);
            JOptionPane.showMessageDialog(null, message);
        }
        
        logIntoApp(login);        
    }    
    public static void logIntoApp(Login loginObj) {
        // ask user to enter their registered credentials.
        String loginUName, loginPWord;
        loginUName = JOptionPane.showInputDialog("Enter your registered username");
        loginPWord = JOptionPane.showInputDialog("Enter your registered password");
        
        boolean isUserLoggedIn = false;

        // Use a while loop to keep prompting the user for login details until they are logged in successfully
        while (!isUserLoggedIn) {
            // Check if the entered login details match the stored credentials
            isUserLoggedIn = loginObj.loginUser(loginUName, loginPWord);

            // If not logged in, prompt the user to try again
            if (!isUserLoggedIn) {
                JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
                loginUName = JOptionPane.showInputDialog("Enter your registered username");
                loginPWord = JOptionPane.showInputDialog("Enter your registered password");
            }
        }

        // If the loop exits, it means the user is logged in
        // Get the login status message
        String status = loginObj.returnLoginStatus(true);

        // Display the welcome message
        JOptionPane.showMessageDialog(null, status);
        System.out.println(status);
        }
    
    public static void tasksApp() {
        
    }
    }

