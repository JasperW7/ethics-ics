/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wilso
 */
public class DataManager {
    
    // File paths
    private final String TIPS_FILE = "src/tips.txt"; 
    private final String LOG_FILE = "src/history_log.txt";
    
    // Collection to hold tips
    private ArrayList<String> safetyTips;

    public DataManager() {
        safetyTips = new ArrayList<>();
        loadTipsFromFile(); // Load tips
    }

    /**
     * Reads safety tips from flat-file
     */
    private void loadTipsFromFile() {
        try {
            File file = new File(TIPS_FILE);
            // Check if file exists before trying to read
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    // Only add non-empty lines
                    if (!line.trim().isEmpty()) {
                        safetyTips.add(line);
                    }
                }
                scanner.close();
            } else {
                System.out.println("Warning: tips.txt not found at " + file.getAbsolutePath());
                safetyTips.add("Default Tip: Keep your profile private.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading tips file: " + e.getMessage());
            safetyTips.add("Stay safe online!"); // Default tip if file fails
        }
    }

    /**
     * Returns a random tip from the list.
     * @return String tip
     */
    public String getRandomTip() {
        if (safetyTips.isEmpty()) return "No tips available.";
        
        Random rng = new Random();
        
        // get # of tips
        int limit = safetyTips.size(); 
        
        //random number between 0 and the total # of tips
        int randomIndex = rng.nextInt(limit);
        
        //Get tip at that specific random number
        return safetyTips.get(randomIndex);
    }
    
    /**
     * Saves the user's calculation results to a file.
     * @param totalHours Total hours spent
     * @param riskScore The calculated risk percentage
     */
    public void saveResultLog(double totalHours, double riskScore) {
        try {
            // Create FileWriter
            FileWriter fw = new FileWriter(LOG_FILE, true);
            
            // use PrintWriter
            PrintWriter pw = new PrintWriter(fw);
            
            String logEntry = "Log: User spends " + totalHours + " hrs/day. Risk Level: " + riskScore + "%";
            
            //Write to file
            pw.println(logEntry);
            
            //Close PrintWriter to ensure data is saved
            pw.close(); 
            
            System.out.println("Data saved to history_log.txt");
            
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}