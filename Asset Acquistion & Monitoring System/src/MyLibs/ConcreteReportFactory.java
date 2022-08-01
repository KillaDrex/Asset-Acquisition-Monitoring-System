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
public class ConcreteReportFactory extends ReportFactory {
    @Override
    protected Report createReportObject(int objRequest, ArrayList<Equipment> equipmentList, ArrayList<Office> offices) {
        Report report = null;
        
        if (objRequest == 0) {
            report = new OverallReport(equipmentList, offices.toArray());
        } else if (objRequest == 1) {
            report = new EquipmentExpensesReport(equipmentList, offices.toArray());
        }
            
        return report;
    }
}
