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
public class TaskTest {
    
    public TaskTest() {
    }
    
    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription_Success() {
        System.out.println("checkTaskDescription true");
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription("Create Login feature");
        assertEquals(expResult, result);
        fail("Task succesfully captured.");
    }
    
    @Test
    public void testCheckTaskDescription_Fail() {
        System.out.println("checkTaskDescription false");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription("fdsfdasfdsnfdsianfdufniadusfndusiafnadsufnasudfufnuaidsnfbyb");
        assertEquals(expResult, result);
        fail("Please enter a task description of less than 50 characters.");
    }
    
}
