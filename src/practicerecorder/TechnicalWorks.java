/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecorder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 * A shell class for a list of technical works
 * @author Mark
 */
public class TechnicalWorks {
    @XmlElement(name = "technicalwork")
    private  List<TechnicalWork> technicalList;
    
    /**
     * Constructor
     */
    public TechnicalWorks(){    
        this.technicalList = new ArrayList<>();
    }

    /**
     * Returns the list of exercises
     * @return 
     */
    public List<TechnicalWork> getTechnicalList() {
        return technicalList;
    }
    
    /**
     * Adds a new exercise to the list.
     * @param work 
     */
    public void addTechnical(TechnicalWork work){
        technicalList.add(work);
    }
}
