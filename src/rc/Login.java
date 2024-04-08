
package rc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private String username, password, fname, lname;
        
    public boolean checkUserName(String uName){
        if (uName.length() >= 6 || !uName.contains("_")){
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean checkPasswordComplexity(String pWord){
        String myregex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!.+-]).{8,25}$";
        Pattern pattern = Pattern.compile(myregex);
        Matcher matcher = pattern.matcher(pWord);
        return matcher.matches();
    }
    
    public String registerUser(boolean uName, boolean pWord){
        if (uName == false) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters long in length.";
        }
        if (pWord == false) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        else {
            return "Registered successfully";
        }
    }
    
   
}
