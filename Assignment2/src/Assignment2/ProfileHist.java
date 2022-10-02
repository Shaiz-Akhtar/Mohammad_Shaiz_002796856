/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;
import java.util.*;

/**
 *
 * @author Shaiz Akhtar
 */
public class ProfileHist {
    private ArrayList<Profile>history;

    public ProfileHist() {
    history = new ArrayList<Profile>();
    
    }

    public ArrayList<Profile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Profile> history) {
        this.history = history;
    }
    public void addprofile(Profile profile){
        history.add(profile);
    }
    public void deleteProfile(Profile p)
    {
        history.remove(p);
    }
    }

    

   
    
    
    

