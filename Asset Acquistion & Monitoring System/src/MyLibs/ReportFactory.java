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
public abstract class ReportFactory {
    protected abstract Report createReportObject(int objRequest, ArrayList<Equipment> equipmentList, ArrayList<Office> offices);
    
    public Report createReport(int objRequest, ArrayList<Equipment> equipmentList, ArrayList<Office> offices) {
        Report report = createReportObject(objRequest, equipmentList, offices);
        return report;
    }
}
