/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

import java.util.ArrayList;

/**
 *
 * @author killa
 */
public class User {
    public static int numUsers;
    
    private int userID;
    private String name;
    private String password;
    
    public User(String name, String password) {
        // set ID
        this.userID = numUsers;
        
        // increment
        numUsers++;
        
        this.name = name;
        this.password = password;
    }
    
    public boolean login(ArrayList<Object[]> userInfoList) {
       // iterate over list of user info in the system to check if the user exists
       for (Object[] info : userInfoList) {
           String name = (String)info[0];
           
           // if user exists (not case sensitive), check password (case sensitive)
           if (this.name.equalsIgnoreCase(name) ) {
               String password = (String)info[1];
               
               if (this.password.equals(password) ) return true;
           }
       }
       
       // no user or wrong log-in details
       return false;
    }
    
    public void recordEquipmentCondition(Equipment equipment, String condition) {
        equipment.setCondition(condition);
    }
    
    public void viewReport(Report report) {
        report.printDetails();
    }

    public String getName() {
        return name;
    }
    
    
}
