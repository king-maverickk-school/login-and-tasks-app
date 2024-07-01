package rc.login.and.tasks.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ST10461408
 */
public class LoginTest {
    
    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName_Valid_Username() {
        System.out.println("checkUserName() true test:");
        String uName = "kyl_";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(uName);
        assertEquals(expResult, result);

        // this only prints on success of assertEquals
        System.out.println("Welcome <user first name>,<user last name> \n it is great to see you.");
    }
    
    @Test
    public void testCheckUserName_Invalid_Username() {
        System.out.println("checkUserName() true test:");
        String uName = "kyle!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(uName);
        assertEquals(expResult, result);

        // this only prints on false result of assertEquals
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity_ValidPWord() {
        System.out.println("checkPasswordComplexity() Test: ");
        String valid_pass = "Ch&&sec@99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(valid_pass);
        
        assertEquals(expResult, result);
        
        // this only prints on success of assertEquals
        System.out.println("Password successfully captured.");
    }
    
    @Test
    public void testCheckPasswordComplexity_InvalidPWord() {
        System.out.println("checkPasswordComplexity() Test: ");
        String invalid_pass = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(invalid_pass);
        
        assertEquals(expResult, result);
        
        // this only prints on false result of assertEquals
        System.out.println("Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
    }

}
