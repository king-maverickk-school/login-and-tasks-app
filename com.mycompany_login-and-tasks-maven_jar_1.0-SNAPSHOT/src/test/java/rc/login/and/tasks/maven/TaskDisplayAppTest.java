/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rc.login.and.tasks.maven;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskDisplayAppTest {
    
    public TaskDisplayAppTest() {
    }
    
    /**
     * Test of getDoneTasks method, of class TaskDisplayApp.
     */
    @Test
    public void testGetDoneTasks() {
        System.out.println("getDoneTasks");
        TaskDisplayApp instance = new TaskDisplayApp();
        int numOfTasks = 4;
        
        String[] taskOne = {"Mike Smith", "Create Login", "5", "To do"};
        String[] taskTwo = {"Edward Harris", "Create Add Features", "8", "Doing"};
        String[] taskThree = {"Samantha Paulson", "Create reports", "2", "Done"};
        String[] taskFour = {"Glenda Oberholzer", "Add arrays", "11", "To do"};
        
        for (int i = 0; i < numOfTasks; i++) {
            switch (i){
                case 0:
                    instance.saveDetails(taskOne[0], taskOne[1], "", Integer.parseInt(taskOne[2]), taskOne[3]);
                    break;
                case 1:
                    instance.saveDetails(taskTwo[0], taskTwo[1], "", Integer.parseInt(taskTwo[2]), taskTwo[3]);
                    break;
                case 2:
                    instance.saveDetails(taskThree[0], taskThree[1], "", Integer.parseInt(taskThree[2]), taskThree[3]);
                    break;
                case 3:
                    instance.saveDetails(taskFour[0], taskFour[1], "", Integer.parseInt(taskFour[2]), taskFour[3]);
                    break;
                default:
                    break;
            }
        }
        
        instance.getDoneTasks();
    }

    /**
     * Test of displayLongestTask method, of class TaskDisplayApp.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        TaskDisplayApp instance = new TaskDisplayApp();
        int numOfTasks = 4;
        
        String[] taskOne = {"Mike Smith", "Create Login", "5", "To do"};
        String[] taskTwo = {"Edward Harris", "Create Add Features", "8", "Doing"};
        String[] taskThree = {"Samantha Paulson", "Create reports", "2", "Done"};
        String[] taskFour = {"Glenda Oberholzer", "Add arrays", "11", "To do"};
        
        for (int i = 0; i < numOfTasks; i++) {
            switch (i){
                case 0:
                    instance.saveDetails(taskOne[0], taskOne[1], "", Integer.parseInt(taskOne[2]), taskOne[3]);
                    break;
                case 1:
                    instance.saveDetails(taskTwo[0], taskTwo[1], "", Integer.parseInt(taskTwo[2]), taskTwo[3]);
                    break;
                case 2:
                    instance.saveDetails(taskThree[0], taskThree[1], "", Integer.parseInt(taskThree[2]), taskThree[3]);
                    break;
                case 3:
                    instance.saveDetails(taskFour[0], taskFour[1], "", Integer.parseInt(taskFour[2]), taskFour[3]);
                    break;
                default:
                    break;
            }
        }
        
        instance.displayLongestTask();
    }

    /**
     * Test of searchTaskByTaskName method, of class TaskDisplayApp.
     */
    @Test
    public void testSearchTaskByTaskName() {
        System.out.println("searchTaskByTaskName");
        String tName = "Create Login";
        TaskDisplayApp instance = new TaskDisplayApp();
        int numOfTasks = 4;
        
        String[] taskOne = {"Mike Smith", "Create Login", "5", "To do"};
        String[] taskTwo = {"Edward Harris", "Create Add Features", "8", "Doing"};
        String[] taskThree = {"Samantha Paulson", "Create reports", "2", "Done"};
        String[] taskFour = {"Glenda Oberholzer", "Add arrays", "11", "To do"};
        
        for (int i = 0; i < numOfTasks; i++) {
            switch (i){
                case 0:
                    instance.saveDetails(taskOne[0], taskOne[1], "", Integer.parseInt(taskOne[2]), taskOne[3]);
                    break;
                case 1:
                    instance.saveDetails(taskTwo[0], taskTwo[1], "", Integer.parseInt(taskTwo[2]), taskTwo[3]);
                    break;
                case 2:
                    instance.saveDetails(taskThree[0], taskThree[1], "", Integer.parseInt(taskThree[2]), taskThree[3]);
                    break;
                case 3:
                    instance.saveDetails(taskFour[0], taskFour[1], "", Integer.parseInt(taskFour[2]), taskFour[3]);
                    break;
                default:
                    break;
            }
        }
        
        instance.searchTaskByTaskName(tName); // returns
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskDisplayApp.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developer = "Samantha Paulson";
        TaskDisplayApp instance = new TaskDisplayApp();
        int numOfTasks = 4;
        
        String[] taskOne = {"Mike Smith", "Create Login", "5", "To do"};
        String[] taskTwo = {"Edward Harris", "Create Add Features", "8", "Doing"};
        String[] taskThree = {"Samantha Paulson", "Create reports", "2", "Done"};
        String[] taskFour = {"Glenda Oberholzer", "Add arrays", "11", "To do"};
        
        for (int i = 0; i < numOfTasks; i++) {
            switch (i){
                case 0:
                    instance.saveDetails(taskOne[0], taskOne[1], "", Integer.parseInt(taskOne[2]), taskOne[3]);
                    break;
                case 1:
                    instance.saveDetails(taskTwo[0], taskTwo[1], "", Integer.parseInt(taskTwo[2]), taskTwo[3]);
                    break;
                case 2:
                    instance.saveDetails(taskThree[0], taskThree[1], "", Integer.parseInt(taskThree[2]), taskThree[3]);
                    break;
                case 3:
                    instance.saveDetails(taskFour[0], taskFour[1], "", Integer.parseInt(taskFour[2]), taskFour[3]);
                    break;
                default:
                    break;
            }
        }
        
        instance.searchTasksByDeveloper(developer);
    }

    /**
     * Test of deleteTaskByName method, of class TaskDisplayApp.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        String tName = "Create reports";
        TaskDisplayApp instance = new TaskDisplayApp();
        int numOfTasks = 4;
        
        String[] taskOne = {"Mike Smith", "Create Login", "5", "To do"};
        String[] taskTwo = {"Edward Harris", "Create Add Features", "8", "Doing"};
        String[] taskThree = {"Samantha Paulson", "Create reports", "2", "Done"};
        String[] taskFour = {"Glenda Oberholzer", "Add arrays", "11", "To do"};
        
        for (int i = 0; i < numOfTasks; i++) {
            switch (i){
                case 0:
                    instance.saveDetails(taskOne[0], taskOne[1], "", Integer.parseInt(taskOne[2]), taskOne[3]);
                    break;
                case 1:
                    instance.saveDetails(taskTwo[0], taskTwo[1], "", Integer.parseInt(taskTwo[2]), taskTwo[3]);
                    break;
                case 2:
                    instance.saveDetails(taskThree[0], taskThree[1], "", Integer.parseInt(taskThree[2]), taskThree[3]);
                    break;
                case 3:
                    instance.saveDetails(taskFour[0], taskFour[1], "", Integer.parseInt(taskFour[2]), taskFour[3]);
                    break;
                default:
                    break;
            }
        }
        
        instance.deleteTaskByName(tName);
    }

    /**
     * Test of displayAll method, of class TaskDisplayApp.
     */
    @Test
    public void testDisplayAll() {
        System.out.println("displayAll");
        TaskDisplayApp instance = new TaskDisplayApp();
        int numOfTasks = 4;
        
        String[] taskOne = {"Mike Smith", "Create Login", "5", "To do"};
        String[] taskTwo = {"Edward Harris", "Create Add Features", "8", "Doing"};
        String[] taskThree = {"Samantha Paulson", "Create reports", "2", "Done"};
        String[] taskFour = {"Glenda Oberholzer", "Add arrays", "11", "To do"};
        
        for (int i = 0; i < numOfTasks; i++) {
            switch (i){
                case 0:
                    instance.saveDetails(taskOne[0], taskOne[1], "", Integer.parseInt(taskOne[2]), taskOne[3]);
                    break;
                case 1:
                    instance.saveDetails(taskTwo[0], taskTwo[1], "", Integer.parseInt(taskTwo[2]), taskTwo[3]);
                    break;
                case 2:
                    instance.saveDetails(taskThree[0], taskThree[1], "", Integer.parseInt(taskThree[2]), taskThree[3]);
                    break;
                case 3:
                    instance.saveDetails(taskFour[0], taskFour[1], "", Integer.parseInt(taskFour[2]), taskFour[3]);
                    break;
                default:
                    break;
            }
        }
        
        instance.displayAll();
    }
    
}
