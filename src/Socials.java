/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaspe
 */
public class Socials {
    protected static int totalAccounts;
    protected static int totalHrs;
    protected int hrsSpent;
     
   public Socials(int hours){
        this.hrsSpent=hours;
        totalHrs += hours;
        totalAccounts++;
    }
    
    public Socials(){
        this(0);
        totalAccounts++;
        
    }
    
    public int getTotalAccounts(){return totalAccounts;}
    
    public double calculateStalkability(){
        return totalHrs*0.01 + NewJFrame.score*0.02;
    }
    
    
    @Override
    public String toString(){
        return "User spends "+ totalHrs + " time on social media";
    }
    
}
