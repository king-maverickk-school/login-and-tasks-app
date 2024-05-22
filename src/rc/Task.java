package rc;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    public int numOfTasks, taskNumber, taskDuration, totalHours;
    public String taskName, taskDescription, devDetails, taskID, taskStatus;
    
    public Task() {
        numOfTasks = 0;
        taskStatus = "";
        taskNumber = 0;
        taskName = "";
        taskDescription = "";
        devDetails = "";
        taskID = "";
        taskDuration = 0;
        totalHours = 0;
    }
    
    // createTaskID uses the task name, number and developer details to generate an appropriate task ID
    private String createTaskID(String tName, int tNumber, String devDeets){
        // takes taskName (first 2 letters), taskNumber (autogenerated), devDetails (last 3 letters)
        // the format is tN:07:dev - "task name":taskNumber:"dev first name"
        
        // String method to extract characters in a string (first 2 letters)
        tName = taskName.substring(0, 2);
        tNumber = taskNumber; // this variable is for the actual taskID string
        
        String[] firstName = devDetails.split(" ");
        int lastLetter = firstName[0].length();
        int thirdLastLetter = firstName[0].length() - 3;
        devDeets = firstName[0].substring(thirdLastLetter, lastLetter);
        
        String taskId = tName.toUpperCase() + ":" + tNumber + ":" + devDeets.toUpperCase();
        return taskId;
    }
    
    // method to take all the user input and save all the task details
    public void createTask(String tName, String tDescription, String devDeets, int tNumber, String tStatus, int tDuration) {
        taskName = tName;
        taskDescription = tDescription;
        devDetails = devDeets;

        taskStatus = tStatus;
        taskNumber = tNumber;
        taskDuration = tDuration;
        
        totalHours = totalHours + taskDuration; // modify and store the total hours to the local variable
        
        // createTaskID uses the task name, number and developer details to generate an appropriate task ID
        taskID = createTaskID(tName, tNumber, devDeets);
    }

    // check the character length of the of the task description (as required)
    public boolean checkTaskDescription(String tDescription){
        if (tDescription.length() > 50) {
            return false;
        }
        else return true;
    }
    
    // print all the task details. they were set in createTask()
    public String printTaskDetails(){
        return "Task Name: "+ taskName + "\nTask Description: " + taskDescription
                + "\nDeveloper: " + devDetails + "\nTask Status: " + taskStatus +
                "\nTask Duration: " + taskDuration + "\n\nTask ID: " + taskID;
    }
    
    // return the total hours of ALL the tasks
    // they are modified in createTask()
    public int returnTotalHours(){
        return totalHours;
    }
    
}
