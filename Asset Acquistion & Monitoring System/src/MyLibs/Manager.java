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
    
     public void assignEquipment(Equipment equipment, Office office, ArrayList<Office> offices) {
        // check if equipment has already been assigned, if so, de-assign
        for (Office o : offices) {
           if (o.getEquipmentList().contains(equipment) ) {
               o.getEquipmentList().remove(o);
           }
        }
        
        // assign equipment to office
        office.getEquipmentList().add(equipment);
    } 
     
    public Report generateReport(ArrayList<Office> offices, ArrayList<Report> reportsList, int objRequest) {
        Report report;
        
        // combine all the equipments of each office
        ArrayList<Equipment> equipmentList = new ArrayList<>();
        for (Office o : offices) {
            for (Equipment e : o.getEquipmentList() ) {
                equipmentList.add(e);
            }
        }
        
        // choose which type of report
        if (objRequest == 0) {
            report = new OverallReport(equipmentList);
        } else { // 1
            report = new EquipmentExpensesReport(equipmentList);
        }
        
        // add to reports list
        reportsList.add(report);
        
        return report;
    }
}
