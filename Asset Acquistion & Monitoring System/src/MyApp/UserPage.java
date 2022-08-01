/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

import MyLibs.Employee;
import MyLibs.Equipment;
import MyLibs.EquipmentExpensesReport;
import MyLibs.Manager;
import MyLibs.Office;
import MyLibs.OverallReport;
import MyLibs.Report;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 *
 * @author killa
 */
public class UserPage extends javax.swing.JPanel {
    // options panel
    private javax.swing.JToggleButton jToggleButton1 = new javax.swing.JToggleButton();
    private javax.swing.JToggleButton jToggleButton2 = new javax.swing.JToggleButton();
    private javax.swing.JToggleButton jToggleButton3 = new javax.swing.JToggleButton();
    private javax.swing.JToggleButton jToggleButton4 = new javax.swing.JToggleButton();
    private javax.swing.JToggleButton jToggleButton6 = new javax.swing.JToggleButton();
    
    // actions panel
    private javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel8 = new javax.swing.JLabel();    
    private javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel12 = new javax.swing.JLabel(); 
    private javax.swing.JLabel jLabel13 = new javax.swing.JLabel();  
    private javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel16 = new javax.swing.JLabel(); 
    private javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel18 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel19 = new javax.swing.JLabel(); 
    private javax.swing.JLabel jLabel20 = new javax.swing.JLabel(); 
    private javax.swing.JLabel jLabel21 = new javax.swing.JLabel(); 
    
    private javax.swing.JComboBox jComboBox1 = new javax.swing.JComboBox();
    private javax.swing.JComboBox jComboBox2 = new javax.swing.JComboBox();
    private javax.swing.JComboBox jComboBox3 = new javax.swing.JComboBox();
    private javax.swing.JComboBox jComboBox4 = new javax.swing.JComboBox();
    private javax.swing.JComboBox jComboBox5 = new javax.swing.JComboBox();
    private javax.swing.JComboBox jComboBox6 = new javax.swing.JComboBox();
    private javax.swing.JComboBox jComboBox7 = new javax.swing.JComboBox();
    
    private javax.swing.JButton jButton1 = new javax.swing.JButton();
    private javax.swing.JButton jButton2 = new javax.swing.JButton();
    private javax.swing.JButton jButton3 = new javax.swing.JButton();
    private javax.swing.JButton jButton4 = new javax.swing.JButton();
    
    
    /**
     * Creates new form Page
     */
    public UserPage() {
        initComponents();
        
        // determine if user is an employee or manager
        if (AppForm.getUser() instanceof Employee) {
            userMode();
        } else {
            extendedUserMode();
        }
        
        // use default mode
        defaultMode();
        
        // options panel items
        jToggleButton1.setBackground(new java.awt.Color(47, 44, 69));
        jToggleButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Record Item");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(47, 44, 69));
        jToggleButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("View Reports");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(47, 44, 69));
        jToggleButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("Logout");
        jToggleButton3.setActionCommand("");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jToggleButton4.setBackground(new java.awt.Color(47, 44, 69));
        jToggleButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("Assign Item");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(47, 44, 69));
        jToggleButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jToggleButton6.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setText("Make Report");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
             
        // actions panel items
        jLabel3.setForeground(new java.awt.Color(54, 50, 78));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/ghost.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("to the left to do something...");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Uh oh..");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Click on an option");
        
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Assign an equipment");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 35)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("||");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Equipment");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("to an office");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Office ID");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Assign");    
        
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Record the condition");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("of an equipment");        
        
        jLabel14.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Equipment Type:");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Equipment Condition:");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Equipment ID:");    
        
        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Record Condition");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });    
        
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ((javax.swing.JLabel)jComboBox1.getRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);
 
        jComboBox2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ((javax.swing.JLabel)jComboBox2.getRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);
      
        jComboBox3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ((javax.swing.JLabel)jComboBox3.getRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });   
        
        jComboBox4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Good condition", "Needs repair", "For replacement or lost"}) );
        ((javax.swing.JLabel)jComboBox4.getRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

        jComboBox5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N 
        jComboBox5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ((javax.swing.JLabel)jComboBox5.getRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });  
        
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Set the appropriate type");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("and generate a report");

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Generate Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Report Type:");

        jComboBox7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Overall", "Expenses" }));     
        ((javax.swing.JLabel)jComboBox7.getRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        jLabel17.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("View Recent Reports");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Reports:");

        jComboBox6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ((javax.swing.JLabel)jComboBox6.getRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("View Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 50, 78));

        jPanel1.setBackground(new java.awt.Color(47, 44, 69));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(AppForm.getUser() == null ? "" : AppForm.getUser().getName() + "!");

        jPanel2.setBackground(new java.awt.Color(54, 33, 61));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hi,");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());
        
        // depending on selected equipment type, show specific IDs
        String equipmentType = (String)jComboBox5.getSelectedItem();
        LinkedHashSet<Integer> IDs = new LinkedHashSet<>();

        // get stock equipment 
        for (Equipment e : parent.getStockEquipmentList() ) {
            if (e.getName().equals(equipmentType) ) { // name matches type
                IDs.add(e.getEquipmentID() );
            }
        }
        
        // get equipment from each office
        for (Office office : parent.getOfficeList() ) {
            // iterate over each office's equipment
            for (Equipment e : office.getEquipmentList() ) {
                if (e.getName().equals(equipmentType) ) { // name matches type
                    IDs.add(e.getEquipmentID() );
                }
            }
        }        
        
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(IDs.toArray() ) );
        
        // set condition
        jComboBox3ActionPerformed(null);
    }
    
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());

        // get picked equipment
        int equipmentID = (Integer)jComboBox3.getSelectedItem();
        Equipment equipment = null;
        
        // get stock equipment 
        for (Equipment e : parent.getStockEquipmentList() ) {
            if (e.getEquipmentID() == equipmentID) { // name matches type
                equipment = e;
                break;
            }
        }
        
        // get equipment from each office (if equipment not in stock)
        if (equipment == null) {
            outer: for (Office office : parent.getOfficeList() ) {
                // iterate over each office's equipment
                for (Equipment e : office.getEquipmentList() ) {
                    if (e.getEquipmentID() == equipmentID) { // name matches type
                        equipment = e;
                        break outer;
                    }
                }
            }     
        }
        
        // show equipment condition
        String[] condition = {equipment.getCondition() };
        jComboBox4.setSelectedItem(equipment.getCondition());
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) { // view a specific report                                         
        // TODO add your handling code here:
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());
        
        if (parent.getListOfReports().size() < 1) { // no reports loaded
            javax.swing.JOptionPane.showMessageDialog(parent, "No reports are in storage.", "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);                  
        } else {
            int reportIndex = jComboBox6.getSelectedIndex();
            Report report = parent.getListOfReports().get(reportIndex);
            
            // get report data (view report)
            ArrayList<Object[]> listOfEquipmentData = AppForm.getUser().viewReport(report);
            
            // show table with data
            String title = report instanceof OverallReport ? "An Overall Equipment Report" : "A Report on Equipment Expenses";
            javax.swing.JDialog frame = new javax.swing.JDialog(parent, title, true);
            frame.getContentPane().add(new ReportPanel(listOfEquipmentData) );
            frame.setResizable(false);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);       
        }
    }          
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { // generate report
        // TODO add your handling code here:
        String type = (String)jComboBox7.getSelectedItem();
        int objRequest;
        
        // set object type
        if (type.equals("Overall") ) {
            objRequest = 0;
        } else {
            objRequest = 1;
        }
        
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());
            
        // create appropriate report
        Report report = ((Manager)AppForm.getUser() ).generateReport(parent.getStockEquipmentList(), parent.getOfficeList(), objRequest);
        
        if (objRequest == 0) {
            // inform user
            javax.swing.JOptionPane.showMessageDialog(parent, "Generated an overall report.", "Success!",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);                   
        } else {   
            // inform user
            javax.swing.JOptionPane.showMessageDialog(parent, "Generated an equipment expenses report.", "Success!",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);                   
        }
        
        // add report to reports list
        ArrayList<Report> listOfReports = parent.getListOfReports();
        listOfReports.add(report);
        
        // limit the list of reports to size 4
        if (listOfReports.size() > 5) {
            listOfReports.remove(0);
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { // record equipment condition                                       
        // TODO add your handling code here:
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());

        // get picked equipment
        int equipmentID = (Integer)jComboBox3.getSelectedItem();
        Equipment equipment = null;
        
        // get stock equipment 
        for (Equipment e : parent.getStockEquipmentList() ) {
            if (e.getEquipmentID() == equipmentID) { // name matches type
                equipment = e;
                break;
            }
        }
        
        // get equipment from each office (if equipment not in stock)
        if (equipment == null) {
            outer: for (Office office : parent.getOfficeList() ) {
                // iterate over each office's equipment
                for (Equipment e : office.getEquipmentList() ) {
                    if (e.getEquipmentID() == equipmentID) { // name matches type
                        equipment = e;
                        break outer;
                    }
                }
            }     
        }

       // get condition
       String newCondition = (String)jComboBox4.getSelectedItem();
       
       // set condition
       AppForm.getUser().recordEquipmentCondition(equipment, newCondition);
       
       // inform user
       switch (newCondition) {
            case "Good condition":
                javax.swing.JOptionPane.showMessageDialog(parent, 
                        equipment.getName() + " with ID " + equipment.getEquipmentID() + 
                        " is now recorded to be in good condition.", "Success!",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);                   
            break;
            case "Needs repair":
                javax.swing.JOptionPane.showMessageDialog(parent, 
                        equipment.getName() + " with ID " + equipment.getEquipmentID() + 
                        " is now recorded to be needing repair.", "Success!",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);                  
            break;
            default: // for replacement or lost
                javax.swing.JOptionPane.showMessageDialog(parent, 
                        equipment.getName() + " with ID " + equipment.getEquipmentID() + 
                        " is now recorded to be set for replacement.", "Success!",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);        
       }       
    }             
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { // assign equipment                               
        // TODO add your handling code here:
        
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());
        
        // get equipment picked
        String name = (String)jComboBox1.getSelectedItem();
        int equipmentID = Integer.parseInt(name.substring(name.indexOf("ID") + 2, name.indexOf(']')));
        Equipment e = null;

        // check first if equipment is in stock
        for (Equipment equipment : parent.getStockEquipmentList() ) {
           if (equipment.getEquipmentID() == equipmentID) {
               e = equipment;
               break;
           }
        }
        
        if (e == null) {    // equipment is not in stock, check each office
            outer: for (Office o : parent.getOfficeList() ) {
                for (Equipment equipment : o.getEquipmentList() ) {
                    // iterate over each office's equipment list to find the selected equipment based on its ID
                    if (equipment.getEquipmentID() == equipmentID) {
                        e = equipment;
                        break outer;
                    }
                }
            }
        }
        
        
        // assign equipment (if needed)
        if (!((String)jComboBox2.getSelectedItem()).equals("[STOCK]") ) { // assigning to an office
            int officeID = Integer.parseInt((String)jComboBox2.getSelectedItem() );
            
            for (int i = 0; i < parent.getOfficeList().size(); i++) {
                if (i == officeID) { // found office, break loop
                    // assign equipment
                    ((Manager)AppForm.getUser()).assignEquipment(e, parent.getOfficeList().get(officeID), 
                                                                    parent.getOfficeList(), parent.getStockEquipmentList());
               
                    // inform user
                    javax.swing.JOptionPane.showMessageDialog(parent, 
                            e.getName() + " with ID " + e.getEquipmentID() + 
                            " has been assigned to Office " + officeID + ".", "Success!",
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } else { // equipment put to stock
            // assign equipment
            ((Manager)AppForm.getUser()).assignEquipment(e, null, parent.getOfficeList(), parent.getStockEquipmentList());
                    
            // inform user
            javax.swing.JOptionPane.showMessageDialog(parent, 
                    e.getName() + " with ID " + e.getEquipmentID() + 
                    " has been put to stock.", "Success!",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);           
        }
        
        // re-draw combo box for equipment
        ArrayList<String> items = new ArrayList();
        
        // get stock equipment first
        for (Equipment equipment : parent.getStockEquipmentList() ) {
            items.add(equipment.getName() + "[ID" + equipment.getEquipmentID() + "]");
        }
        
        // get equipment from each office
        int counter = 0;
        for (Office office : parent.getOfficeList() ) {
            // iterate over each office's equipment
            for (Equipment equipment : office.getEquipmentList() ) {
                String str = equipment.getName() + "[ID" + equipment.getEquipmentID() + "] Office " + counter;
                items.add(str);
            } 
            
            // increment
            counter++;
        }
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(items.toArray() ) );
    }  
    
    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) { // logout toggle                                      
        // TODO add your handling code here:
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());

        // hide log-in error message
        parent.getLoginErrorMessageLabel().setForeground(new java.awt.Color(78, 87, 101));

        // go back to login page
        parent.remove(this);
        parent.add(new LoginPage(parent.getContentPane()));
        parent.pack();
    }                                              

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) { // view reports toggle                                          
        // TODO add your handling code here:
        viewReportsMode();
        jToggleButton2.setSelected(true);
    }                                              

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) { // record item condition toggle
        // TODO add your handling code here
        recordItemMode();
        jToggleButton1.setSelected(true);
        
    } 
    
    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) { // assign equipment toggle                                               
        // TODO add your handling code here:
        assignItemMode();
        jToggleButton4.setSelected(true);
    }                                              

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        generateReportMode();
        jToggleButton6.setSelected(true);
    } 
    
    // options panel
    private void userMode() { // for employees
        // remove all items in options panel
        remove(jLabel1);
        remove(jLabel2);
        remove(jToggleButton1);
        remove(jToggleButton2);
        remove(jToggleButton3);
        remove(jToggleButton4);
        remove(jToggleButton6);
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(37, 37, 37)
                .addComponent(jToggleButton2)
                .addGap(37, 37, 37)
                .addComponent(jToggleButton3)
                .addContainerGap(271, Short.MAX_VALUE))
        );        
    }
    
    private void extendedUserMode() {
        // remove all items in options panel
        remove(jLabel1);
        remove(jLabel2);
        remove(jToggleButton1);
        remove(jToggleButton2);
        remove(jToggleButton3);
        remove(jToggleButton4);
        remove(jToggleButton6);
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton4)
                .addGap(37, 37, 37)
                .addComponent(jToggleButton1)
                .addGap(37, 37, 37)
                .addComponent(jToggleButton6)
                .addGap(37, 37, 37)
                .addComponent(jToggleButton2)
                .addGap(37, 37, 37)
                .addComponent(jToggleButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );        
    }
    ///
    
    // actions panel
    private void clearActionPanel() {
        // clear all items on the actions panel
        remove(jLabel3);
        remove(jLabel5);
        remove(jLabel6);
        remove(jLabel7);
        remove(jLabel4);
        remove(jLabel10);
        remove(jLabel8);
        remove(jLabel9);
        remove(jLabel11);
        remove(jComboBox1);
        remove(jComboBox2);
        remove(jComboBox3);
        remove(jComboBox4);
        remove(jComboBox5);
        remove(jButton1); 
        remove(jButton2);
        remove(jLabel12);
        remove(jLabel13);
        remove(jLabel14);
        remove(jLabel15);
        remove(jLabel16);
        remove(jLabel19);
        remove(jLabel20);
        remove(jLabel21);
        remove(jButton3);
        remove(jComboBox7);
        remove(jLabel17);
        remove(jLabel18);
        remove(jComboBox6);
        remove(jButton4);
        
        // untoggle every toggle button
        jToggleButton1.setSelected(false);
        jToggleButton2.setSelected(false);;
        jToggleButton4.setSelected(false);
        jToggleButton6.setSelected(false);
    }
    
    private void defaultMode() {
        // remove all items in actions panel
        clearActionPanel();
        
        // add in necessary items
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(126, 126, 126))
        );       
    }
    
    private void recordItemMode() {
        // remove all items in actions panel
        clearActionPanel();
        
        // add in necessary items
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 49, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(86, 86, 86))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(60, 60, 60))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(109, 109, 109))))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(55, 55, 55))
                );        
                
        // modify item properties
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());
        
        LinkedHashSet<String> items = new LinkedHashSet();
        
        // get stock equipment first
        for (Equipment e : parent.getStockEquipmentList() ) {
            items.add(e.getName());
        }
        
        // get equipment from each office
        for (Office office : parent.getOfficeList() ) {
            // iterate over each office's equipment
            for (Equipment e : office.getEquipmentList() ) {
                items.add(e.getName() );
            } 
        }
        
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(items.toArray() ) );        
        
        // update equipment ID combo box
        jComboBox5ActionPerformed(null);
    }
    
    private void assignItemMode() {
        // remove all items in actions panel
        clearActionPanel();
        
        // add in necessary items
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addGap(80, 80, 80))
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(147, 147, 147))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(150, 150, 150))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(313, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(115, 115, 115)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(93, 93, 93)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jLabel10)
                    .addContainerGap(413, Short.MAX_VALUE)))
        );
        
        // modify item properties
        ArrayList<String> items = new ArrayList();
        
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());
        
        // get stock equipment first
        for (Equipment e : parent.getStockEquipmentList() ) {
            items.add(e.getName() + "[ID" + e.getEquipmentID() + "]");
        }
        
        // get equipment from each office
        int counter = 0;
        for (Office office : parent.getOfficeList() ) {
            // iterate over each office's equipment
            for (Equipment e : office.getEquipmentList() ) {
                String str = e.getName() + "[ID" + e.getEquipmentID() + "] Office " + counter;
                items.add(str);
            } 
            
            // increment
            counter++;
        }
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(items.toArray() ) );
        
        // get Office IDs
        ArrayList<String> officeIDs = new ArrayList<>();
        
        officeIDs.add("[STOCK]");   // id for stock 
        for (Office office : parent.getOfficeList() ) {
            String ID = "" + office.getOfficeID();
            officeIDs.add(ID);
        }
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(officeIDs.toArray() ) );
    }
    
    private void generateReportMode() {
        // remove all items in actions panel
        clearActionPanel(); 
        
        // add necessary items
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(145, 145, 145)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(37, 37, 37))
        );    
        
        // modify necessary items
        jComboBox7.setSelectedIndex(0);
    }
    
    private void viewReportsMode() {
        // remove all items in actions panel
        clearActionPanel(); 
        
        // add necessary items        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel17))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jButton4)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel17)
                .addGap(156, 156, 156)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(jButton4)
                .addGap(54, 54, 54))
        );
        
        // modify necessary items
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());
        
        ArrayList<Report> listOfReports = parent.getListOfReports();
        
        jComboBox6.removeAllItems();
        if (listOfReports.size() == 0) {
            jComboBox6.addItem("[No Reports Loaded]");
        } else {
            for (int i = 0; i < 5; i++) {
                // no more reports to load
                if (i == listOfReports.size() )
                    break;
                
                // set the suffix
                String suffix = "";
                if (listOfReports.size() != 1) { // more than one report available
                    if (i == 0) {
                        suffix = " (Oldest)";
                    } else if (i == listOfReports.size() - 1) {
                        suffix = " (Most recent)";
                    }
                }
                
                // get the report type
                String type;
                if (listOfReports.get(i) instanceof OverallReport) {
                    type = "Overall Report";
                } else { // equipment expenses report
                    type = "Expenses Report";
                }
                
                // add option
                jComboBox6.addItem(type + suffix);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
