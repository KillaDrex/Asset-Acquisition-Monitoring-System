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
    public EquipmentExpensesReport(ArrayList<Equipment> equipmentList) {
        super(equipmentList);
    }

    @Override
    protected ArrayList<Object[]> getDetails(Object[] officeList) {
//            // remove all 'good condition' equipment
//            ArrayList<Equipment> listOfEquipment = new ArrayList<>();
//            for (Equipment e : equipmentList) {
//                // ignore equipment
//                if (e.getCondition().equals("Good condition") ) {
//                    continue;
//                }
//                
//                // put to list
//                listOfEquipment.add(e);
//            }       
        return null;
    }   
}
