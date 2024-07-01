/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rc.login.and.tasks.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ST10461408
 */
public class TaskTest {

    public TaskTest() {
        
    }
    
    @Test
    public void testTaskIDCorrect() {
        Task testInstance = new Task();
        int numOfTasks = 2;
        
        String[] task_one_test_data = {"Create Login Feature", "Create Login to authenticate users", "Robyn Harrison", "8", "To Do"};
        String[] task_two_test_data = {"Add Task Feature", "Create Add Task feature to add task users", "Mike Smith", "10", "Doing"};
        // ">=" sign because loop starts at 1 and I need it to stop at the specified number of tasks
        for (int i = 0; numOfTasks >= i; i++) {
            
            // for the two tasks and to avoid errors, i use switch
            switch (i) {
                case 0:
                    String tName = task_one_test_data[0];
                    String tDescription = task_one_test_data[1];
                    String devDeets = task_one_test_data[2];
                    int tDuration = Integer.parseInt(task_one_test_data[3]);
                    String tStatus = task_one_test_data[4];
                    
                    testInstance.createTask(tName, tDescription, devDeets, i, tStatus, tDuration);
                    
                    // displaying the unique task ID
                    String taskOneID = testInstance.returnTaskID();
                    System.out.println(taskOneID);
                    break;
                case 1:
                    String tName2 = task_two_test_data[0];
                    String tDescription2 = task_two_test_data[1];
                    String devDeets2 = task_two_test_data[2];
                    int tDuration2 = Integer.parseInt(task_two_test_data[3]);
                    String tStatus2 = task_two_test_data[4];
                    
                    testInstance.createTask(tName2, tDescription2, devDeets2, i, tStatus2, tDuration2);
                   
                    // displaying the unique task ID
                    String taskTwoID = testInstance.returnTaskID();
                    System.out.println(taskTwoID);
                    break;
            }  
        }
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription_Success() {
        System.out.println("checkTaskDescription true test");
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription("Create Login feature");
        assertEquals(expResult, result);
        System.out.println("Task successfully captured."); // message for "true" description
    }

    @Test
    public void testCheckTaskDescription_Fail() {
        System.out.println("checkTaskDescription false test");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription("fdsfdasfdsnfdsianfdufniadusfndusiafnadsufnasudfufnuaidsnfbyb");
        assertEquals(expResult, result);
    }
    
    

}
