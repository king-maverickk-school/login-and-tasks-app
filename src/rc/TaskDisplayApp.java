/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
public class TaskDisplayApp {
    // declare arrays to save the task details
    public static String[] devArray = {};
    public static String[] tNameArray = {};
    public static String[] tIDArray = {};
    public static int[] tDurationArray = {};
    public static String[] tStatusArray = {};
    
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
    
    public static int getLongestTask(int[] tDuration) {
        int longest = 0;
        for (int i = 0; i < tDuration.length - 1; i++) {
            if (i != 0) {
                if (tDuration[i] > tDuration[i-1]) { //
                    longest = tDuration[i];
                }
            } else {
                longest = tDuration[i];
            }
        }
        return longest;
    }
    
    // get longest task index
    // int longest
    // for task in tDuration
    // if (!i = 0) ... if task[i] > task[i-1]
    // longest = task[i]

}
