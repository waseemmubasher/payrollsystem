
package JFrames;

import BeanClasses.EmployeeBean;
import DBManager.DBM;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Waseem
 */
public class UpdateEmployee extends javax.swing.JFrame {
Vector v = null;
static int employeeId;
eventClass eventclass = new eventClass();

    /**
     * Creates new form UpdateEmployee
     */
    public UpdateEmployee(int employeeId) throws Exception{
        
        initComponents();
         v = DBM.getEmployee(employeeId);
         list.setListData(v);
        list.setSelectedIndex(0);
        setBounds(0,0,1050,635);
        if(list.getSelectedIndex()==0){
        EmployeeBean bean = (EmployeeBean)list.getSelectedValue();
        empid.setText(bean.getEmpId());
        empnam.setText(bean.getEmpName());
        empfname.setText(bean.getEmpFname());
        empsurname.setText(bean.getEmpSurname());
        empgender.setText(bean.getEmpGender());
        empdob.setText(bean.getEmpDob());
        address.setText(bean.getEmpAddress());
        contactno.setText(bean.getEmpContactno());
        doj.setText(bean.getEmpDoj());
        empsalary.setText(bean.getBasicSalary()+"");
        medical.setText(bean.getAllowMedical()+"");
        conveyance.setText(bean.getAllowConvance()+"");
        homerent.setText(bean.getAllowHomerent()+"");
        cola.setText(bean.getAllowCola()+"");
        designation.setText(bean.getDesignation());
        medicalleave.setText(bean.getMaxMedicalleave()+"");
        casualleave.setText(bean.getMaxCasualLeave()+"");
       
       
        ImageIcon image = bean.getImg();
        Image im = image.getImage();
        Image myImg=im.getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImg);
        imagelabel.setIcon(newImage);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        imagelabel = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        medical = new javax.swing.JTextField();
        conveyance = new javax.swing.JTextField();
        homerent = new javax.swing.JTextField();
        cola = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        empsalary = new javax.swing.JTextField();
        empid = new javax.swing.JTextField();
        empnam = new javax.swing.JTextField();
        empfname = new javax.swing.JTextField();
        empsurname = new javax.swing.JTextField();
        empgender = new javax.swing.JTextField();
        empdob = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        doj = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        medicalleave = new javax.swing.JTextField();
        casualleave = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        list.setFont(new java.awt.Font("Dialog", 0, 14));
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        list.setSelectedIndex(1);
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Employee");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Employee ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 77, 113, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 118, 113, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Father Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 159, 113, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Surname");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 200, 113, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 241, 113, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 282, 113, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ContactNo");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 360, 113, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Date of Joining");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 400, 113, 35);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Address");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 323, 48, 30);

        imagelabel.setBackground(new java.awt.Color(0, 0, 0));
        imagelabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Waseem\\Documents\\NetBeansProjects\\FYP\\x.png")); // NOI18N
        imagelabel.setText("jLabel17");
        jPanel1.add(imagelabel);
        imagelabel.setBounds(770, 110, 190, 250);

        update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(880, 550, 80, 31);

        back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(30, 540, 70, 31);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Yearly Casual Leaves");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(340, 120, 140, 35);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Yearly Medical Leaves ");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(340, 80, 134, 35);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Medical Allowance");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(0, 50, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Conveyance Allowance");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 90, 140, 35);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("HomeRent Allowance");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 130, 140, 35);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("COLA");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(0, 170, 113, 35);

        medical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                medicalKeyTyped(evt);
            }
        });
        jPanel2.add(medical);
        medical.setBounds(150, 50, 230, 30);

        conveyance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                conveyanceKeyTyped(evt);
            }
        });
        jPanel2.add(conveyance);
        conveyance.setBounds(150, 90, 230, 30);

        homerent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                homerentKeyTyped(evt);
            }
        });
        jPanel2.add(homerent);
        homerent.setBounds(150, 130, 230, 30);

        cola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colaKeyTyped(evt);
            }
        });
        jPanel2.add(cola);
        cola.setBounds(150, 170, 230, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Basic Salary");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 10, 71, 35);
        jPanel2.add(empsalary);
        empsalary.setBounds(150, 10, 230, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(340, 160, 380, 210);

        empid.setEditable(false);
        jPanel1.add(empid);
        empid.setBounds(130, 80, 200, 30);
        jPanel1.add(empnam);
        empnam.setBounds(130, 120, 200, 30);
        jPanel1.add(empfname);
        empfname.setBounds(130, 160, 200, 30);
        jPanel1.add(empsurname);
        empsurname.setBounds(130, 200, 200, 30);
        jPanel1.add(empgender);
        empgender.setBounds(130, 240, 200, 30);
        jPanel1.add(empdob);
        empdob.setBounds(130, 280, 200, 30);
        jPanel1.add(address);
        address.setBounds(130, 320, 200, 30);

        contactno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactnoKeyTyped(evt);
            }
        });
        jPanel1.add(contactno);
        contactno.setBounds(130, 360, 200, 30);
        jPanel1.add(doj);
        doj.setBounds(130, 400, 200, 30);
        jPanel1.add(designation);
        designation.setBounds(130, 440, 200, 30);

        medicalleave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                medicalleaveKeyTyped(evt);
            }
        });
        jPanel1.add(medicalleave);
        medicalleave.setBounds(490, 80, 230, 30);

        casualleave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                casualleaveKeyTyped(evt);
            }
        });
        jPanel1.add(casualleave);
        casualleave.setBounds(490, 120, 230, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Designation");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 440, 113, 35);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1310, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     void clear(){
        empid.setText(null);
        empnam.setText(null);
        empfname.setText(null);
        empsurname.setText(null);
        empgender.setText(null);
        empdob.setText(null);
        address.setText(null);
        contactno.setText(null);
        doj.setText(null);
        empsalary.setText(null);
        medical.setText(null);
        conveyance.setText(null);
        homerent.setText(null);
        cola.setText(null);
       
        designation.setText(null);
        medicalleave.setText(null);
        casualleave.setText(null);
        
    ImageIcon ic = new ImageIcon("x.png");
    imagelabel.setIcon(ic);
     //list.removeAll();
     }
    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
       
    }//GEN-LAST:event_listMouseClicked

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged

    }//GEN-LAST:event_listValueChanged

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        UpdateEmployee.this.setVisible(false);
        try {
            new SearchEmployee().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

    private void contactnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactnoKeyTyped
          eventclass.integerEvent(evt);
    if(contactno.getText().length() >=11)
        evt.consume();//limitation of textbox input
    }//GEN-LAST:event_contactnoKeyTyped

    private void medicalleaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicalleaveKeyTyped
         eventclass.integerEvent(evt);
    }//GEN-LAST:event_medicalleaveKeyTyped

    private void casualleaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_casualleaveKeyTyped
        eventclass.integerEvent(evt);
    }//GEN-LAST:event_casualleaveKeyTyped

    private void medicalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicalKeyTyped
         eventclass.integerEvent(evt);
    }//GEN-LAST:event_medicalKeyTyped

    private void conveyanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conveyanceKeyTyped
         eventclass.integerEvent(evt);
    }//GEN-LAST:event_conveyanceKeyTyped

    private void homerentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homerentKeyTyped
         eventclass.integerEvent(evt);
    }//GEN-LAST:event_homerentKeyTyped

    private void colaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colaKeyTyped
         eventclass.integerEvent(evt);
    }//GEN-LAST:event_colaKeyTyped

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        EmployeeBean bean = (EmployeeBean)list.getSelectedValue();
        int empId = bean.getEmployeeId();
        String employeeName = empnam.getText().toUpperCase();
        String employeeFname = empfname.getText().toUpperCase();
        String employeeSurname = empsurname.getText().toUpperCase();
        String employeeAddress = address.getText().toUpperCase();
        String employeeContactno = contactno.getText();
        String employeeDesignation = designation.getText().toUpperCase();
        String employeeMonthMedicalLeave = medicalleave.getText();int monthlyMedicalLeave = Integer.parseInt(employeeMonthMedicalLeave);
        String employeeMonthlyCasualLeave = casualleave.getText();int monthlyCasualLeave = Integer.parseInt(employeeMonthlyCasualLeave);
        String employeeConvanceAllowance = conveyance.getText();int convanceAllowance = Integer.parseInt(employeeConvanceAllowance);
        String employeeMedicalAllowance = medical.getText();int medicalAllowance = Integer.parseInt(employeeMedicalAllowance);
        String employeeHomeRentAllowance = homerent.getText();int homeRentAllowance = Integer.parseInt(employeeHomeRentAllowance);
        String employeeColaAllowance = cola.getText();int colaAllowance = Integer.parseInt(employeeColaAllowance);
        int basicSalary = Integer.parseInt(empsalary.getText());
        
        try{
        int rows = DBM.updateEmployee(empId,employeeName, employeeFname, employeeSurname, employeeAddress, employeeContactno, employeeDesignation, monthlyMedicalLeave, monthlyCasualLeave,basicSalary,medicalAllowance, convanceAllowance ,homeRentAllowance, colaAllowance);
        
        if(rows>0){
        JOptionPane.showMessageDialog(null,"Updated...");
       // clear();
        }
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_updateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
       UpdateEmployee Ue = new UpdateEmployee(employeeId);
       Ue.show();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField casualleave;
    private javax.swing.JTextField cola;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField conveyance;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField doj;
    private javax.swing.JTextField empdob;
    private javax.swing.JTextField empfname;
    private javax.swing.JTextField empgender;
    private javax.swing.JTextField empid;
    private javax.swing.JTextField empnam;
    private javax.swing.JTextField empsalary;
    private javax.swing.JTextField empsurname;
    private javax.swing.JTextField homerent;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    private javax.swing.JTextField medical;
    private javax.swing.JTextField medicalleave;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
