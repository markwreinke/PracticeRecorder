/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecorder;

import javax.xml.bind.annotation.XmlElement;

/**
 * A general class for a resource.
 * @author Mark
 */
public class PracticeResource {    
    @XmlElement(name = "exerciseName")
    private final String name;
        
    /**
     * Constructs PracticeResource
     * @param name 
     */  
    public PracticeResource(String name){
        this.name = name;
    }
    
    /**
     * Default constructor
     */
    public PracticeResource(){
        this("default");
    }
     
    /**
     * Returns the name
     * @return 
     */
    public String getName(){
        return name;
    }
         
    @Override
    public String toString(){
        return name;
    }
}
