/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecorder;

/**
 * A specific type of practice resource
 * @author Mark
 */
public class TechnicalWork extends PracticeResource  {

    /**
     * Constructor set the name.
     * @param name 
     */
    public TechnicalWork(String name){
        super(name);
    }

    /**
     * Default constructor.
     */
    public TechnicalWork() {
        this("default");
    }
    
    
}
