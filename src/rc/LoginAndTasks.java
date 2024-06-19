package rc;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Motheo Moleko [ST10461408]
 */
public class LoginAndTasks {
    // declare arrays to save the task details
    public static String[] devArray = {};
    public static String[] tNameArray = {};
    public static String[] tIDArray = {};
    public static int[] tDurationArray = {};
    public static String[] tStatusArray = {};
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This is the Tasks App. \nPlease register and log in before we get started!");
        
        // declare and initialise Login object
        Login login = new Login();
        
        // assigning values to attributes
        // we will login attributes because they are public
        login.fname = JOptionPane.showInputDialog("Enter your first name: ");
                
        login.lname = JOptionPane.showInputDialog("Enter your last name: ");

        login.username = JOptionPane.showInputDialog("Enter your desired username: \nEnsure you have less than 5 characters and an underscore (_)");
    
        login.password = JOptionPane.showInputDialog("Enter your password: ");
               
        // performing username and password checks
        boolean unameCheck = login.checkUserName(login.username);
        boolean pWordCheck = login.checkPasswordComplexity(login.password);

        // display the message explaining whether password or username is correctly formatted or not
        String message = login.registerUser(unameCheck, pWordCheck);
        JOptionPane.showMessageDialog(null, message);
        
        while (!message.endsWith("correctly.")){
            login.username = JOptionPane.showInputDialog("Enter your desired username: \nEnsure you have less than 5 characters and an underscore (_)");
            unameCheck = login.checkUserName(login.username);
            
            login.password = JOptionPane.showInputDialog("Enter your password: ");
            pWordCheck = login.checkPasswordComplexity(login.password);
            
            message = login.registerUser(unameCheck, pWordCheck);
            JOptionPane.showMessageDialog(null, message);
        }
        
        logIntoApp(login);   
    }    
    public static void logIntoApp(Login loginObj) {
        // ask user to enter their registered credentials.
        String loginUName, loginPWord;
        loginUName = JOptionPane.showInputDialog("Enter your registered username");
        loginPWord = JOptionPane.showInputDialog("Enter your registered password");
        
        boolean isUserLoggedIn = false;

        // Use a while loop to keep prompting the user for login details until they are logged in successfully
        while (!isUserLoggedIn) {
            // Check if the entered login details match the stored credentials
            isUserLoggedIn = loginObj.loginUser(loginUName, loginPWord);

            // If not logged in, prompt the user to try again
            if (!isUserLoggedIn) {
                JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
                loginUName = JOptionPane.showInputDialog("Enter your registered username");
                loginPWord = JOptionPane.showInputDialog("Enter your registered password");
            }
        }

        // If the loop exits, it means the user is logged in
        // Get the login status message
        String status = loginObj.returnLoginStatus(isUserLoggedIn);

        // Display the welcome message
        JOptionPane.showMessageDialog(null, status); 
        tasksApp();
    }
    
    // method to run Part 2 of POE
    // 
    // used once the user has succesfully logged in
    public static void tasksApp() {
        
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban!");
        int userOption = Integer.parseInt(JOptionPane.showInputDialog("Adding any tasks today? \n\n1) Add tasks \n2) Show Report \n3)Quit"));
        
        // keeps the app running without logging out the user
        while (userOption != 3){
            // Displays relevant infomation depending on the user options
            switch (userOption) {
                case 1:
                    Task task = new Task();
                    createTask(task); 
                    // this keeps the app running without the user logging in again
                    userOption = Integer.parseInt(JOptionPane.showInputDialog("Adding any tasks today? \n\n1) Add tasks \n2) Show Report \n3)Quit"));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Coming soon!");
                    // this keeps the app running without the user logging in again
                    userOption = Integer.parseInt(JOptionPane.showInputDialog("Adding any tasks today? \n\n1) Add tasks \n2) Show Report \n3)Quit"));
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "This is not a valid option. Try again");
                    // this keeps the app running without the user logging in again
                    userOption = Integer.parseInt(JOptionPane.showInputDialog("Adding any tasks today? \n\n1) Add tasks \n2) Show Report \n3)Quit"));
                    throw new AssertionError();
            }
        }
    }

    // method to implement createTask() from Task class
    // uses a for-loop depending on the number of tasks the users wishes to create
    
    // takes a parameter to use Task methods
    private static void createTask(Task task) {
        int numOfTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks to create"));
        
        // ">=" sign because loop starts at 1 and I need it to stop at the specified number of tasks
        for (int i = 1; numOfTasks >= i; i++) {
            String tName = JOptionPane.showInputDialog("Enter the Task name for task No. " + i);
            
            String tDescription =  JOptionPane.showInputDialog("Task Description");
            boolean descriptionCheck = task.checkTaskDescription(tDescription);
            // checking the task description character length
            while (descriptionCheck == false) {
                tDescription =  JOptionPane.showInputDialog("Please re-enter task Description");
                descriptionCheck = task.checkTaskDescription(tDescription);
            }
            
            String devDeets =  JOptionPane.showInputDialog("Developer needed");
            int tDuration = Integer.parseInt(JOptionPane.showInputDialog("Duration (in hours)"));
            
            String[] tStatusOptions = {"To do", "Doing", "Done"};
            String tStatus = (String) JOptionPane.showInputDialog(null, "Choose one of the following Task Statuses", "Task Status", JOptionPane.QUESTION_MESSAGE, null, tStatusOptions, tStatusOptions[0]);
            
            // saves all the inputted details as a single task
            task.createTask(tName, tDescription, devDeets, i, tStatus, tDuration);
            // prints details after ALL tasks are declared
            String taskDetails = task.printTaskDetails();
            JOptionPane.showMessageDialog(null, taskDetails);
        }
        
        // display totalHours AFTER all the tasks are created
        int totalHours = task.returnTotalHours();
        JOptionPane.showMessageDialog(null, "Total hours: " + totalHours);
    }
    
    public static void saveDetails(int index, String devDeets, String tName,  String tID, int tDuration, String tStatus) {
        devArray[index] = devDeets;
        tNameArray[index] = tName;
        tIDArray[index] = tID;
        tDurationArray[index] = tDuration;
        tStatusArray[index] = tStatus;
    }
    
    public static int[] getDoneTasks(String[] tStatusArr) {
        List<Integer> indexList = new ArrayList<>();
        
        // Iterate through the array to find indices of "Done" tasks
        for (int i = 0; i < tStatusArr.length; i++) {
            if (tStatusArr[i].equals("Done")) {
                indexList.add(i);
            }
        }
        
        // Convert List<Integer> to int[]
        int[] indices = new int[indexList.size()];
        for (int i = 0; i < indexList.size(); i++) {
            indices[i] = indexList.get(i);
        }
        
        return indices;
        /*
        // in main:
        int[] doneTaskIndices = getDoneTasks(tStatusArray);
        // Print the indices of "Done" tasks
        for (int index : doneTaskIndices) {
            System.out.println("Index of 'Done': " + index);
        }
        */
    }
    
    // options
    // create one big array with all the details. Almost like Task.printTaskDetails()
    // create several arrays for each task item and use the arrays are parallel arrays (same index = same info/task)
    
    // option 1: 
    // -- one array can't hold everything because there's an int data type amongst strings (solution: use .toString() and parseInt when the info is needed)
    // ++ the data is in one thing and its easier to fetch?
    // -- have to work with 2D arrays which can get complex quickly
    
    // option 2:
    // ++ use the details as parallel arrays
    // ++ all the details are in their respective arrays 
    // -- it can break easily if user doesn't enter info... unless I have a default value if the
}

