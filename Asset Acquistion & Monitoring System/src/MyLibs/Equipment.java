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
    public int numEquipment;
    private int equipmentID;
    private String name;
    private Date purchaseDate;
    private String condition;

    public Equipment(String name, Date purchaseDate, String condition) {
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.condition = condition;
    }
    
    
}
