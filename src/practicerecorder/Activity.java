/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecorder;

/**
 * This class describes an individual activity within a practice session
 * @author Mark
 */
public class Activity {
    private PracticeResource resource;
    private int timePracticed;
    
    /**
     * Constructs an activity object
     * @param resource
     * @param timePracticed 
     */
    public Activity(PracticeResource resource, int timePracticed){
        this.resource = resource;
        this.timePracticed = timePracticed;
    }
    /**
     * Activity default constructor
     */
    public Activity(){
        this(new TechnicalWork(), 0);
    }

    /**
     * Returns what resource that the activity used
     * @return 
     */
    public PracticeResource getResource() {
        return resource;
    }

    /**
     * Returns the time practiced
     * @return 
     */
    public int getTimePracticed() {
        return timePracticed;
    }

    /**
     * Sets the resource used
     * @param resource 
     */
    public void setResource(PracticeResource resource) {
        this.resource = resource;
    }

    /**
     * Sets the time practiced
     * @param timePracticed 
     */
    public void setTimePracticed(int timePracticed) {
        this.timePracticed = timePracticed;
    }
    
}
