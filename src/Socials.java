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
    protected static final double HOURS_MULTIPLIER=0.01;
    protected static final double SCORE_MULTIPLIER=0.02;
    protected static final double REELS_MULTIPLER=0.001;
    protected static final double POSTS_MULTIPLIER=0.01;
     
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
        return totalHrs*HOURS_MULTIPLIER + NewJFrame.score*SCORE_MULTIPLIER;
    }
    
    
    @Override
    public String toString(){
        return "User spends "+ totalHrs + " time on social media with a stalkability of "+calculateStalkability()+".";
    }
    
}
