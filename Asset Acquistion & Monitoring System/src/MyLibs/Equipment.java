/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;
/**
 *
 * @author Carlos Miguel
 */
public class Equipment {
    public static int numEquipment;
    
    private int equipmentID;
    private String name;
    private Date purchaseDate;
    private String condition;

    public Equipment(String name, int day, int month, int year, String condition) {
        // set ID
        equipmentID = numEquipment;
        
        // increment
        numEquipment++;
        
        // set name
        this.name = name;
        
        // create Date object
        Date purchaseDate = new Date(day, month, year);
        this.purchaseDate = purchaseDate;
        
        this.condition = condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
