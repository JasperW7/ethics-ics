/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaspe
 */
public class Instagram extends Socials {
    private int reelsPerDay;
    private int postsPerDay;
    
    public Instagram(int hours, int reelsPerDay, int postsPerDay){
        super(hours);
        this.reelsPerDay = reelsPerDay;
        this.postsPerDay = postsPerDay;
    }
    
    public int getReelsPerDay() { return reelsPerDay; }
    public int getPostsPerDay() { return postsPerDay; }
    
    @Override
    public double calculateStalkability(){
        return super.hrsSpent * Socials.HOURS_MULTIPLIER
                + reelsPerDay * Socials.REELS_MULTIPLER 
                + postsPerDay * Socials.POSTS_MULTIPLIER
                + NewJFrame.score * Socials.SCORE_MULTIPLIER;
    }
    
    @Override
    public String toString(){
        return "User spends " + super.hrsSpent + " hours on Instagram, watches " 
               + reelsPerDay + " reels/day, posts " + postsPerDay + " posts/day.";
    }
}