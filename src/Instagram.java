/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaspe
 */
public class Instagram extends Socials{
    private int reelsPerWeek;
    private int postsPerWeek;
    public Instagram(int hours,int reelsPerWeek, int postsPerWeek){
        super(hours);
        this.reelsPerWeek=reelsPerWeek;
        this.postsPerWeek=postsPerWeek;
    }
    
    public int getReelsPerWeek() {return reelsPerWeek;}
    public int getPostsPerWeek() {return postsPerWeek;}
    public int getHrsSpent(){return super.hrsSpent;}
    @Override
    public String toString(){
        return "User spends "+ super.hrsSpent + " hours on Instagram, watches " + reelsPerWeek + " reels per week, and posts "+postsPerWeek+"posts per week.";
    }
}
