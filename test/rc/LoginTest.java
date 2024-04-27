/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {

    @Test
    public void testCheckUserName_ValidUsername() {
        String username = "kyl_1";
        boolean expectedResult = true;
        Login login = new Login();
        boolean actualResult = login.checkUserName(username);
        assertEquals(expectedResult, actualResult, "Username is correctly formatted");
    }

    @Test
    public void testCheckUserName_InvalidUsername() {
        String username = "kyle!!!!!!!";
        boolean expectedResult = false;
        Login login = new Login();
        boolean actualResult = login.checkUserName(username);
        assertEquals(expectedResult, actualResult, "Username is incorrectly formatted");
    }

    @Test
    public void testCheckPasswordComplexity_ValidPassword() {
        String password = "Ch&&sec@ke99";
        boolean expectedResult = true;
        Login login = new Login();
        boolean actualResult = login.checkPasswordComplexity(password);
        assertEquals(expectedResult, actualResult, "Password successfully captured");
    }

    @Test
    public void testCheckPasswordComplexity_InvalidPassword() {
        String password = "password";
        boolean expectedResult = false;
        Login login = new Login();
        boolean actualResult = login.checkPasswordComplexity(password);
        assertEquals(expectedResult, actualResult, "password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
    }

    @Test
    public void testLoginUser_SuccessfulLogin() {
        String validUsername = "kyl_1";
        String validPassword = "Ch&&sec@ke99";
        Login login = new Login();
        boolean loginStatus = login.loginUser(validUsername, validPassword);
        assertTrue(loginStatus, "Login successful");
    }

    @Test
    public void testLoginUser_FailedLogin() {
        String invalidUsername = "kyle!!!!!!!";
        String invalidPassword = "password";        
        Login login = new Login();
        boolean loginStatus = login.loginUser(invalidUsername, invalidPassword);
        assertFalse(loginStatus, "Login failed");
    }
}
