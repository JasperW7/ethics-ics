/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaspe
 */
public class Reddit extends Socials {
    private int postsPerDay; // Renamed
    
    public Reddit(int hours, int postsPerDay){
        super(hours);
        this.postsPerDay = postsPerDay;
    }
    
    public int getPostsPerDay() { return postsPerDay; }
    
    @Override
    public double calculateStalkability(){
        return Socials.totalHrs * Socials.HOURS_MULTIPLIER
                + postsPerDay * Socials.POSTS_MULTIPLIER
                + NewJFrame.score * Socials.SCORE_MULTIPLIER;
    }
    
    @Override
    public String toString(){
        return "User spends " + super.hrsSpent + " hours on Reddit, posts " 
               + postsPerDay + " posts per day.";
    }
}