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
public class OverallReport extends Report {
    public OverallReport(ArrayList<Equipment> equipmentList, Object[] officeList) {
        super(equipmentList, officeList);
    }
        
    @Override
    protected ArrayList<Object[]> getDetails() {
        return getListOfEquipmentData();
    }
}
