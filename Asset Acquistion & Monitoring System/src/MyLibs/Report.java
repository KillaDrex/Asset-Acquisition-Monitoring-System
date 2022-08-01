/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;

import java.util.ArrayList;

/**
 *
 * @author abero
 */
public abstract class Report {
    private ArrayList<Object[]> listOfEquipmentData = new ArrayList<>();
    
    public Report (ArrayList<Equipment> equipmentList, Object[] officeList){
        for (Equipment e : equipmentList) {
            Object[] equipmentData = new Object[5];
            equipmentData[0] = e.getEquipmentID();
            equipmentData[1] = e.getName();
            
            // create date string
            Date date = e.getPurchaseDate();
            String dateString = date.getMonth() + "/" + date.getDay() + "/" + date.getYear();
            
            // store date string
            equipmentData[2] = dateString;
            
            // store equipment condition
            equipmentData[3] = e.getCondition();
            
            // get office ID
            for (int i = 0; i < officeList.length; i++) {
                if (((Office)officeList[i]).getEquipmentList().contains(e) ) {
                    equipmentData[4] = i;
                    break;
                }
            }
            // store aggregated equipment data
            listOfEquipmentData.add(equipmentData);
        }  
    }
    
    protected abstract ArrayList<Object[]> getDetails();

    public ArrayList<Object[]> getListOfEquipmentData() {
        return listOfEquipmentData;
    }
}
