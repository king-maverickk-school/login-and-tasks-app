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
    
    public boolean checkUserName(String uName){
        if (uName.length() >= 6 || !uName.contains("_")){
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean checkPasswordComplexity(String pWord){
        String passRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!.+-]).{8,25}$";
        Pattern pattern = Pattern.compile(passRegex);
        Matcher matcher = pattern.matcher(pWord);
        return matcher.matches();
    }
    
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
     
    
}
