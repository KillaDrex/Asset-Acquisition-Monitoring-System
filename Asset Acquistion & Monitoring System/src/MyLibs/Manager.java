/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;

import java.util.ArrayList;

/**
 *
 * @author RONALD
 */
public class Manager extends User{
    public Manager(String name, String password) {
        super(name, password);
    }
    
     public void assignEquipment(Equipment equipment, Office office, ArrayList<Office> offices, ArrayList<Equipment> stockEquipmentList) {
        // check if equipment has already been assigned, if so, de-assign
        for (Office o : offices) {
           if (o.getEquipmentList().contains(equipment) ) {
               o.getEquipmentList().remove(equipment);
               
                // put equipment to stock
                stockEquipmentList.add(equipment);
                break;               
           }
        }
        
        // assign equipment to office
        if (office != null) {
            office.getEquipmentList().add(equipment);
            stockEquipmentList.remove(equipment);
        }
    } 
     
    public Report generateReport(ArrayList<Equipment> stockEquipmentList, ArrayList<Office> offices, int objRequest) {
        Report report;
        
        // combine all the equipments of stock & each office
        ArrayList<Equipment> equipmentList = new ArrayList<>();
        for (Equipment e : stockEquipmentList) {
            equipmentList.add(e);
        }        
        for (Office o : offices) {
            for (Equipment e : o.getEquipmentList() ) {
                equipmentList.add(e);
            }
        }
        
        // choose which type of report
        if (objRequest == 0) {
            report = new OverallReport(equipmentList, offices.toArray());
        } else { // 1
            report = new EquipmentExpensesReport(equipmentList, offices.toArray() );
        }
        
        return report;
    }
}
