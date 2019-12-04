/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecorder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Queue;
import javax.xml.bind.JAXB;

/**
 * The main class that the program uses
 * @author Mark
 */
public class PracticeRecorder {
    private TechnicalWorks techList = new TechnicalWorks();
    private PracticeSessions sessionList = new PracticeSessions();
    
    private MainFrame mainFrame;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PracticeRecorder recorder = new PracticeRecorder();
    }
    
    /**
     * Constructor fills the data structures from the files.
     */
    public PracticeRecorder(){
        try(BufferedReader input = Files.newBufferedReader(Paths.get("technicalresourses.xml"))){
            techList = JAXB.unmarshal(input, TechnicalWorks.class);
        } 
        catch (IOException ex) {
            System.err.println("Error opening file.");
        }
        try(BufferedReader input = Files.newBufferedReader(Paths.get("practiceSessionsLog.xml"))){
            sessionList = JAXB.unmarshal(input, PracticeSessions.class);
        } catch (IOException ex) {
            System.err.println("Error opening file.");
        }
        
     
        mainFrame = new MainFrame(this);
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainFrame.setVisible(true);
            }
        });
    }
    
    /**
     * Ends the GUI parts of the program
     */
    public void endProgram(){
        mainFrame.dispose();
    }
    
    /**
     * Adds a new technical work to the list and remakes the file
     * @param newWork 
     */
    public void addTechnicalWork(TechnicalWork newWork){
        techList.addTechnical(newWork);
        try(BufferedWriter output = Files.newBufferedWriter(Paths.get("technicalResourses.xml"))){
            JAXB.marshal(techList, output);
        } 
        catch (IOException ex) {
            System.err.println("Errror opening file. Terminating");
        }
    }
    
    /**
     * Adds a new practice session to the queue, and remakes the file
     * @param session 
     */
    public void addPracticeSession(PracticeSession session){
        sessionList.addSession(session);
        try(BufferedWriter output = Files.newBufferedWriter(Paths.get("practiceSessionsLog.xml"))){
            JAXB.marshal(sessionList, output);
        } 
        catch (IOException ex) {
            System.err.println("Errror opening file. Terminating");
        }
    }
    
    /**
     * Returns the technical list
     * @return 
     */
    public List<TechnicalWork> getTechnicalList() {
        return techList.getTechnicalList();
    }

    /**
     * Returns the session list
     * @return 
     */
    public Queue<PracticeSession> getSessionList() {
        return sessionList.getSessions();
    }
    
    
}
