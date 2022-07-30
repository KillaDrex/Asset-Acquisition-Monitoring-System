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
    private ArrayList<Equipment> equipmentList;
    
    public Report (ArrayList<Equipment> equipmentList){
        this.equipmentList = equipmentList;
    }
    
    public abstract void printDetails();
}
