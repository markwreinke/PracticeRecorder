/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecorder;

import java.util.LinkedList;
import javax.xml.bind.annotation.XmlElement;

/**
 * An object describing a practice session
 * @author Mark
 */
public class PracticeSession implements Comparable{
    //@XmlElement(name = "sessionDate")
    private DateClass practiceDate;
    
    @XmlElement(name= "activity")
    private LinkedList<Activity> activityList;
    
    /**
     * Constructs practice session
     * @param date 
     */
    public PracticeSession(DateClass date){
        this.practiceDate = date;
        activityList = new LinkedList<>();
    }
    
    /**
     * Default constructor
     */
    public PracticeSession(){
        this(new DateClass());
    }
    
    /**
     * Adds a new activity
     * @param newActivity 
     */
    public void addActivity(Activity newActivity){
        activityList.add(newActivity);
    }
    
    /**
     * Returns the date of the practice
     * @return 
     */
    public DateClass getPracticeDate() {
        return practiceDate;
    }

    /**
     * Returns the activities from this session
     * @return 
     */
    public LinkedList<Activity> getActivityList() {
        return activityList;
    }

    /**
     * Sets the date of the session
     * @param practiceDate 
     */
    public void setPracticeDate(DateClass practiceDate) {
        this.practiceDate = practiceDate;
    }

    /**
     * Uses the compareTo from the dateclass to compare - newer dates first
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o) {
        PracticeSession compared = (PracticeSession)o;
        return this.practiceDate.compareTo(compared.getPracticeDate());
    }
    
    
}
