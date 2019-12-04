/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecorder;

import java.util.PriorityQueue;
import java.util.Queue;
import javax.xml.bind.annotation.XmlElement;

/**
 * Shell class for the list of practice sessions
 * @author Mark
 */
public class PracticeSessions {
    @XmlElement(name = "practiceSessions")
    private Queue<PracticeSession> sessionList;
    
    /**
     * Constructor
     */
    public PracticeSessions(){
        this.sessionList = new PriorityQueue<>();
    }
    
    /**
     * Adds a new session to the list.
     * @param session 
     */
    public void addSession(PracticeSession session){
        sessionList.add(session);
    }
    
    /**
     * Returns the list of sessions.
     * @return 
     */
    public Queue<PracticeSession> getSessions(){
        return sessionList;
    }
}
