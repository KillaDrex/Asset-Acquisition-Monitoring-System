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
public class EquipmentExpensesReport implements Report {
    private ArrayList<Object[]> listOfEquipmentData = new ArrayList<>();  
        
    public EquipmentExpensesReport(ArrayList<Equipment> equipmentList, Object[] officeList) {
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

    @Override
    public ArrayList<Object[]> getDetails() {
        ArrayList<Object[]> equipmentData = new ArrayList<>();
        
        // iterate over current list of equipment data & get to-be purchased equipment
        for (Object[] oArr : listOfEquipmentData) {
            if (oArr[3].equals("For replacement or lost") ) {
                // add equipment data
                equipmentData.add(oArr);                
                continue;
            }
            

        }
        
        return equipmentData;
    }   
}
