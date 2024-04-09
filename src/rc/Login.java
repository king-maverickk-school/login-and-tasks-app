package rc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Motheo Moleko [ST10461408]
 */
public class Login {
    // declare variables to be used
    // I made them public because I plan on NOT using setters and getters
    public String username, password, fname, lname;
    
    // Default Constructor. Used for calling Login class
    public Login() {
        username = "";
        password = "";
        fname = "";
        lname = "";
    }
    
    // checks the length of the username and if there is an underscore. 
    // username is taken as a parameter
    // using "not if"/negative type of selection statement
    public boolean checkUserName(String uName){
        if (uName.length() >= 6 || !uName.contains("_")){
            return false;
        }
        else {
            return true;
        }
    }
    
    // Checks the password complexity, password is taken as a parameter
    // using regex Pattern and Matcher 
    public boolean checkPasswordComplexity(String pWord){
        // (?=.*[a-z]) - used to determine if lower characters are present
        // (?=.*[A-Z]) - used to determine if upper characters are present
        // (?=.*[@#$%!.+-]) - used to determine if the listed symbols are present
        // .{8,25} - (linked to above) used to check length of password
        // $ - end of string
        String passRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!.+-]).{8,25}$";
        Pattern pattern = Pattern.compile(passRegex);
        Matcher matcher = pattern.matcher(pWord);
        return matcher.matches();
    }
    
    // returns a message indicating succesful/failed login.
    // message is determined by formatting of the username and password
    public String registerUser(boolean uName, boolean pWord){
        if (uName == false) {
            return "FAIL. Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters long in length.";
        }
        if (pWord == false) {
            return "FAIL. Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        else {
            return "Success! Username and password formatted correctly.";
        }
    }
    
    // uses the message from registerUser() to say whether login was successful or nah
    public boolean loginUser(String message){
        if (message.contains("FAIL.")){
           return false;
        }
        else {
           return true;
       }
   }
   
    // used to display the welcome message upon successful login
    public String returnLoginStatus(boolean status){
        if (status == true){
           return "Welcome " + fname + " " + lname + "! \nIt is great to see you.";
        }
        else {
           return "FAILURE! Not logged in";
        }
    }
    
}
