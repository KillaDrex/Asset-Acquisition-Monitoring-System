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
public class EquipmentExpensesReport extends Report {
    public EquipmentExpensesReport(ArrayList<Equipment> equipmentList, Object[] officeList) {
        super(equipmentList, officeList);
    }

    @Override
    protected ArrayList<Object[]> getDetails() {
        ArrayList<Object[]> equipmentData = new ArrayList<>();
        
        // iterate over current list of equipment data & remove 'good condition' equipment
        for (Object[] oArr : getListOfEquipmentData() ) {
            if (oArr[3].equals("Good condition") ) {
                continue;
            }
            
            // add equipment data
            equipmentData.add(oArr);
        }
        
        return equipmentData;
    }   
}
