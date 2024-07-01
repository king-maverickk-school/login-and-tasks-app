package rc.login.and.tasks.maven;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ST10461408
 */
public class TaskDisplayApp {
    // declare arrays to save the task details
    public List<String> devArray = new ArrayList<>();
    public List<String> tNameArray = new ArrayList<>();
    public List<String> tIDArray = new ArrayList<>();
    public List<Integer> tDurationArray = new ArrayList<>();
    public List<String> tStatusArray = new ArrayList<>(); 
    
    public void saveDetails(String devDeets, String tName,  String tID, int tDuration, String tStatus) {
        devArray.add(devDeets);
        tNameArray.add(tName);
        tIDArray.add(tID);
        tDurationArray.add(tDuration);
        tStatusArray.add(tStatus);
    }
    
    public void getDoneTasks() {        
        // Iterate through the array to find indices of "Done" tasks
        for (int i = 0; i < tStatusArray.size(); i++) {
            if (tStatusArray.get(i).equals("Done")) {
                JOptionPane.showMessageDialog(null, "Developer: " + devArray.get(i) + "\nTask Name: " + tNameArray.get(i) + "\nTask Duration: " +tDurationArray.get(i));
            }
        }
    }
    
    public void displayLongestTask() {
        int maxDurationIndex = 0;
        for (int i = 1; i < tDurationArray.size(); i++) {
            if (tDurationArray.get(i) > tDurationArray.get(maxDurationIndex)) {
                maxDurationIndex = i; 
            }
        }
        JOptionPane.showMessageDialog(null, "Developer: " + devArray.get(maxDurationIndex) + "\nTask Duration: " + tDurationArray.get(maxDurationIndex));
    }
    
    public void searchTaskByTaskName(String tName) {
        int index = tNameArray.indexOf(tName);
        if (index != -1) {
            JOptionPane.showMessageDialog(null, "Task Name: " + tNameArray.get(index) + "\nDeveloper: " + devArray.get(index) + "\nTask Status: " + tStatusArray.get(index));
        } else {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }
    
    public void searchTasksByDeveloper(String developer) {
        boolean found = false;
        for (int i = 0; i < devArray.size(); i++) {
            if (devArray.get(i).equalsIgnoreCase(developer)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + tNameArray.get(i) + "Status: " + tStatusArray.get(i));
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "No tasks found for developer: " + developer);
        }
    }
    
    public void deleteTaskByName(String tName) {
        int index = tNameArray.indexOf(tName);
        if (index != -1) {
            devArray.remove(index);
            tNameArray.remove(index);
            tIDArray.remove(index);
            tDurationArray.remove(index);
            tStatusArray.remove(index);
            JOptionPane.showMessageDialog(null, "Task name '" + tName + "' deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }
    
    public void displayAll() {
        for (int i = 0; i < tNameArray.size(); i++) {
            JOptionPane.showMessageDialog(null, "Developer: " + devArray.get(i) + "\nTask Name: " + 
                    tNameArray.get(i) + "\nTask ID: " + tIDArray.get(i) + 
                    "\nTask Duration: " + tDurationArray.get(i) + "\nTask Status: " 
                    + tStatusArray.get(i) + "\n");
        }
    }
}
