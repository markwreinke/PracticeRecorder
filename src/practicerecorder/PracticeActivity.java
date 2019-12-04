/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecorder;

/**
 * ...I don't remember what this was for?
 * @author Mark
 */
public class PracticeActivity {
    private final PracticeResource activity;
    private final DateClass activityDate;
    
    public PracticeActivity(PracticeResource activity, DateClass activityDate){
        this.activity = activity;
        this.activityDate = activityDate;
    }
    
    public PracticeResource getActivity(){
        return activity;
    }
    
    public DateClass getActivityDate(){
        return activityDate;
    }
}
