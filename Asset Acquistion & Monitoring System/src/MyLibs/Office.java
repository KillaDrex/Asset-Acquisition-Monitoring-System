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
    
    //hii pacheck n lang if mali, lmk if need ko i-revise srysry
    public Office() {
    Office office = new Office();
    office.officeID = numOffice;
    office.officeID++; 
  }
    
    public Office (ArrayList<Equipment> equipmentList) {
    equipmentList.numOffice = officeID;
  }
    
}
