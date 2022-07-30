/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;
import java.util.ArrayList;


/**
 *
 * @author jmsde
 */
public class Office {
    public static int numOffice;
    
    private int officeID;
    private ArrayList<Equipment> equipmentList;
    
    public Office () {
        // set ID
        officeID = numOffice;
        
        // increment
        numOffice++;
    }

    public Office(ArrayList<Equipment> equipmentList) {
        // set ID
        this();
                
        this.equipmentList = equipmentList;
    } 

    public ArrayList<Equipment> getEquipmentList() {
        return equipmentList;
    }
}
