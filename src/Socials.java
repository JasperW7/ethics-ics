/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaspe
 */
public class Socials {
    private static int totalAccounts;
    private static int totalHrs;
    protected int hrsSpent;
    protected String platformName;
    public Socials(String platform,int hours){
        this.platformName=platform;
        this.hrsSpent=hours;
        totalHrs += hours;
        totalAccounts++;
    }
    public int getTotalAccounts(){return totalAccounts;}
    @Override
    public String toString(){
        return "User spends "+ totalHrs + " time on social media";
    }
    
}
