/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaspe
 */
public class Reddit extends Socials{
    private int postsPerWeek;
    
    public Reddit(int hours,int postsPerWeek){
        super(hours);
        this.postsPerWeek=postsPerWeek;
    }
    
    public int getPostsPerWeek() {return postsPerWeek;}
    
    public int getHrsSpent(){return super.hrsSpent;}
    
    @Override
    public double calculateStalkability(){
        return Socials.totalHrs*Socials.HOURS_MULTIPLIER
                + postsPerWeek*Socials.POSTS_MULTIPLIER
                + NewJFrame.score*Socials.SCORE_MULTIPLIER;
    }
    
    @Override
    public String toString(){
        return "User spends "+ super.hrsSpent + " hours on Reddit, posts "+postsPerWeek+"posts per week, and has a stalkability of "+calculateStalkability()+".";
    }
}
