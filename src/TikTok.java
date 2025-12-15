/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaspe
 */
public class TikTok extends Socials {
    private int reelsPerDay; // Renamed
    
    public TikTok(int hours, int reelsPerDay){
        super(hours);
        this.reelsPerDay = reelsPerDay;
    }
    
    public int getReelsPerDay() { return reelsPerDay; }
    
    @Override
    public double calculateStalkability(){
        return super.hrsSpent * Socials.HOURS_MULTIPLIER
                + reelsPerDay * Socials.REELS_MULTIPLER 
                + NewJFrame.score * Socials.SCORE_MULTIPLIER;
    }
    
    @Override
    public String toString(){
        return "User spends " + super.hrsSpent + " hours on TikTok, watches " 
               + reelsPerDay + " reels per day.";
    }
}    
