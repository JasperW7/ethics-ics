/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaspe
 */
public class TikTok extends Socials{
    private int reelsPerWeek;
    
    public TikTok(int hours,int reelsPerWeek){
        super(hours);
        this.reelsPerWeek=reelsPerWeek;
    }
    
    public int getReelsPerWeek() {return reelsPerWeek;}
    
    public int getHrsSpent(){return super.hrsSpent;}
    @Override
    public double calculateStalkability(){
        return Socials.totalHrs*Socials.HOURS_MULTIPLIER
                +reelsPerWeek*Socials.REELS_MULTIPLER 
                + NewJFrame.score*Socials.SCORE_MULTIPLIER;
    }
    
    @Override
    public String toString(){
        return "User spends "+ super.hrsSpent + " hours on TikTok, watches " + reelsPerWeek + " reels per week and has a stalkability of "+calculateStalkability()+".";
    }
    
    
}
