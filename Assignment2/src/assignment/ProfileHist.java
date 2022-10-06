/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.text.SimpleDateFormat;
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
    public void updateProfile(Profile tempEmployee, ArrayList<Profile> profileHist){

      
        //for-loop to find empId
        for(Profile p: profileHist){
            
        if(p.getEmpId()== tempEmployee.getEmpId()){
           p.setName(tempEmployee.getName()); 
          // p.setEmpId(tempEmployee.getEmpId()); 
           p.setAge(tempEmployee.getAge()); 
           p.setGender(tempEmployee.getGender());
           String startDate = new SimpleDateFormat("yyyy-MM-dd").format(tempEmployee.getStartDate());
           
          // p.setStartDate(tempEmployee.getStartDate());
           p.setLevel(tempEmployee.getLevel()); 
           p.setPositionTitle(tempEmployee.getPositionTitle()); 
           p.setTeamInfo(tempEmployee.getTeamInfo()); 
           p.setPhoneNumber(tempEmployee.getPhoneNumber()); 
          p.setEmail(tempEmployee.getEmail()); 
          p.setPhoto(tempEmployee.getPhoto());
          
            
            
            
        }
        
        }
        
        
    }
    
    public ArrayList<Profile> searchByName(String searchValue, ArrayList<Profile> tempList, ArrayList<Profile> historyList){        
        for(Profile p: historyList){
            if(p.getName().equalsIgnoreCase(searchValue)){
                tempList.add(p);
            }
        }     
        return tempList;
    }
    public ArrayList<Profile> searchById(String searchValue, ArrayList<Profile> tempList, ArrayList<Profile> historyList){        
        for(Profile p: historyList){
            if(Integer.toString(p.getEmpId()).equalsIgnoreCase(searchValue)){
                tempList.add(p);
            }
        } 
        return tempList;
    }

        
    public ArrayList<Profile> searchByTeam(String searchValue, ArrayList<Profile> tempList, ArrayList<Profile> historyList){        
        for(Profile p: historyList){
            if(p.getTeamInfo().equalsIgnoreCase(searchValue)){
                tempList.add(p);
            }
        }  
        
        return tempList;
    }
    public ArrayList<Profile> searchByDesignation(String searchValue, ArrayList<Profile> tempList, ArrayList<Profile> historyList){        
        for(Profile p: historyList){
            if(p.getPositionTitle().equalsIgnoreCase(searchValue)){
                tempList.add(p);
            }
        }  
        
        return tempList;
 }
     public ArrayList<Profile> searchByLevel(String searchValue, ArrayList<Profile> tempList, ArrayList<Profile> historyList){        
        for(Profile p: historyList){
            if(p.getLevel().equalsIgnoreCase(searchValue)){
                tempList.add(p);
            }
        }  
        
        return tempList;
 }
    
    
    public ArrayList<Profile> searchByPhone(String searchValue, ArrayList<Profile> tempList, ArrayList<Profile> historyList){        
        for(Profile p: historyList){
           if(p.getPhoneNumber().equalsIgnoreCase(searchValue))
                   {
                tempList.add(p);
            }
        }  
        
        return tempList;
 }
    
}

    

   
    
    
    

