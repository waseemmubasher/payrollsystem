
package JFrames;

import DBManager.DBM;
import JFrames.eventClass.*;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Waseem
 */

public class NewEmployee extends javax.swing.JFrame {
eventClass eventclass = new eventClass();
    public NewEmployee() {
        initComponents();
        setBounds(0,0, 1070, 570);
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        empconvenceallow = new javax.swing.JTextField();
        empmedical = new javax.swing.JTextField();
        emphomrent = new javax.swing.JTextField();
        empcola = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        imagelabel = new javax.swing.JLabel();
        browseimage = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        empgender = new javax.swing.JComboBox<>();
        empdoj = new com.toedter.calendar.JDateChooser();
        empdob = new com.toedter.calendar.JDateChooser();
        empid = new javax.swing.JTextField();
        imagepath = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        empnam = new javax.swing.JTextField();
        empfname = new javax.swing.JTextField();
        empsurname = new javax.swing.JTextField();
        empaddress = new javax.swing.JTextField();
        empcontactno = new javax.swing.JTextField();
        nicno = new javax.swing.JTextField();
        empdesignation = new javax.swing.JTextField();
        empsalary = new javax.swing.JTextField();
        empmedicalleave = new javax.swing.JTextField();
        empcasualleave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Employee");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 113, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 113, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Father Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 113, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Surname");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 141, 113, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 182, 113, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 222, 113, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 262, 113, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contact No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 302, 113, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Basic Salary");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Designation");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 377, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Date of Joining");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 113, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Yearly Medical Leave ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("N-I-C No");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Upload Image");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 140, 35));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Allowance Convence");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 11, 125, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Allowance HomeRent");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 93, 128, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Allowance COLA");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 134, 113, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Allowance Medical");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 52, 113, 30);

        empconvenceallow.setText("0");
        empconvenceallow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empconvenceallowKeyTyped(evt);
            }
        });
        jPanel2.add(empconvenceallow);
        empconvenceallow.setBounds(150, 10, 220, 30);

        empmedical.setText("0");
        empmedical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empmedicalKeyTyped(evt);
            }
        });
        jPanel2.add(empmedical);
        empmedical.setBounds(150, 50, 220, 30);

        emphomrent.setText("0");
        emphomrent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emphomrentKeyTyped(evt);
            }
        });
        jPanel2.add(emphomrent);
        emphomrent.setBounds(150, 90, 220, 30);

        empcola.setText("0");
        empcola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empcolaKeyTyped(evt);
            }
        });
        jPanel2.add(empcola);
        empcola.setBounds(150, 130, 220, 30);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 212, 370, 200));

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 481, 89, 35));

        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 481, 89, 35));

        imagelabel.setBackground(new java.awt.Color(0, 0, 0));
        imagelabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Waseem\\Documents\\NetBeansProjects\\FYP\\x.png")); // NOI18N
        imagelabel.setText("jLabel17");
        jPanel1.add(imagelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 190, -1));

        browseimage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        browseimage.setText("Browse");
        browseimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseimageActionPerformed(evt);
            }
        });
        jPanel1.add(browseimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 80, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Allowances");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 182, 113, 35));

        empgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(empgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 182, 220, 30));
        jPanel1.add(empdoj, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 19, 220, 30));
        jPanel1.add(empdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 222, 220, 30));

        empid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 219, 30));

        imagepath.setEditable(false);
        imagepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagepathActionPerformed(evt);
            }
        });
        jPanel1.add(imagepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 190, 30));

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 481, 89, 35));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Yearly Casual Leave");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 140, 35));
        jPanel1.add(empnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 220, 30));
        jPanel1.add(empfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 220, 30));
        jPanel1.add(empsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, 30));
        jPanel1.add(empaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 220, 30));

        empcontactno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empcontactnoKeyTyped(evt);
            }
        });
        jPanel1.add(empcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 220, 30));

        nicno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicnoKeyTyped(evt);
            }
        });
        jPanel1.add(nicno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 220, 30));
        jPanel1.add(empdesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 220, 30));

        empsalary.setText("0");
        empsalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empsalaryKeyTyped(evt);
            }
        });
        jPanel1.add(empsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 220, 30));

        empmedicalleave.setText("0");
        empmedicalleave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empmedicalleaveKeyTyped(evt);
            }
        });
        jPanel1.add(empmedicalleave, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 220, 30));

        empcasualleave.setText("0");
        empcasualleave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empcasualleaveKeyTyped(evt);
            }
        });
        jPanel1.add(empcasualleave, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 220, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1070, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagepathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagepathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagepathActionPerformed

    private void browseimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseimageActionPerformed
        JFileChooser file = new JFileChooser();
file.setCurrentDirectory(new File(System.getProperty("user.home")));
FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
file.addChoosableFileFilter(filter);
int result = file.showSaveDialog(null);
if(result== JFileChooser.APPROVE_OPTION){
File selectedFile = file.getSelectedFile();
String path = selectedFile.getAbsolutePath();
imagepath.setText(path);
BufferedImage bi;
        try
        {   //display the image in jlabel
            bi=ImageIO.read(selectedFile);
            imagelabel.setIcon(new ImageIcon(bi));
        }
        catch(IOException e)
        {
      }
}
    }//GEN-LAST:event_browseimageActionPerformed

    void clear(){
    empid.setText(null);
    empnam.setText(null);
    empfname.setText(null);
    empsurname.setText(null);
    empdob.setCalendar(null);
    nicno.setText(null);
    empaddress.setText(null);
    empcontactno.setText(null);
    empsalary.setText("0");
    empdesignation.setText(null);
    empdoj.setCalendar(null);
    empmedicalleave.setText("0");
    empcasualleave.setText("0");
    empconvenceallow.setText("0");
    empmedical.setText("0");
    emphomrent.setText("0");
    empcola.setText("0");
    imagepath.setText(null);
    ImageIcon ic = new ImageIcon("x.png");
    imagelabel.setIcon(ic);
    nicno.setText(null);
    
    }
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-d");
    try{
        String employeeId = empid.getText().toUpperCase();
        String employeeName = empnam.getText().toUpperCase();
        String employeeFname = empfname.getText().toUpperCase();
        String employeeSurname = empsurname.getText().toUpperCase();
        String employeeGender = (String)empgender.getSelectedItem();
        String employeeDOB = fmt.format(this.empdob.getDate());
        String employeeAddress = empaddress.getText().toUpperCase();
        String employeeContactno = empcontactno.getText();
        String employeeBasicsalary = empsalary.getText();int basicSalary = Integer.parseInt(employeeBasicsalary);
        String employeeDesignation = empdesignation.getText().toUpperCase();
        String employeeDOJ = fmt.format(this.empdoj.getDate());
        String employeeMonthMedicalLeave = empmedicalleave.getText();int monthlyMedicalLeave = Integer.parseInt(employeeMonthMedicalLeave);
        String employeeMonthlyCasualLeave = empcasualleave.getText();int monthlyCasualLeave = Integer.parseInt(employeeMonthlyCasualLeave);
        String employeeConvanceAllowance = empconvenceallow.getText();int convanceAllowance = Integer.parseInt(employeeConvanceAllowance);
        String employeeMedicalAllowance = empmedical.getText();int medicalAllowance = Integer.parseInt(employeeMedicalAllowance);
        String employeeHomeRentAllowance = emphomrent.getText();int homeRentAllowance = Integer.parseInt(employeeHomeRentAllowance);
        String employeeColaAllowance = empcola.getText();int colaAllowance = Integer.parseInt(employeeColaAllowance);
        String employeeImagepath = imagepath.getText();
        String employeeNicNo = nicno.getText();
        
        String NicNo = DBM.getNicNo(employeeNicNo);
        String empId = DBM.getEmployeeId(employeeId);
        if(empId.equals(employeeId))JOptionPane.showMessageDialog(null,"Employee Id aready in Database");       
        
        else if (NicNo.equals(employeeNicNo))JOptionPane.showMessageDialog(null,"Employee is Already Save");
            else {
            int rows = DBM.addEmployee(employeeId, employeeName, employeeFname, employeeSurname, employeeGender, employeeDOB, employeeAddress, employeeContactno, employeeDOJ, basicSalary, medicalAllowance, convanceAllowance, homeRentAllowance,colaAllowance, employeeDesignation, monthlyMedicalLeave, monthlyCasualLeave, employeeImagepath,employeeNicNo);
        if(rows>0){
            JOptionPane.showMessageDialog(null,"Successfully Added");
            clear();
            
            }
                  }
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         NewEmployee.this.setVisible(false);
        try {
            new SearchEmployee().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       clear();
    }//GEN-LAST:event_clearActionPerformed

    private void empcontactnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empcontactnoKeyTyped
 eventclass.integerEvent(evt);
  if(empcontactno.getText().length() >=11)
        evt.consume();
    }//GEN-LAST:event_empcontactnoKeyTyped

    private void nicnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicnoKeyTyped
        eventclass.integerEvent(evt);
         if(nicno.getText().length() >=13)
        evt.consume();
    }//GEN-LAST:event_nicnoKeyTyped

    private void empsalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empsalaryKeyTyped
       eventclass.integerEvent(evt);
    }//GEN-LAST:event_empsalaryKeyTyped

    private void empmedicalleaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empmedicalleaveKeyTyped
        eventclass.integerEvent(evt);
    }//GEN-LAST:event_empmedicalleaveKeyTyped

    private void empcasualleaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empcasualleaveKeyTyped
       eventclass.integerEvent(evt);
    }//GEN-LAST:event_empcasualleaveKeyTyped

    private void empconvenceallowKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empconvenceallowKeyTyped
       eventclass.integerEvent(evt);
    }//GEN-LAST:event_empconvenceallowKeyTyped

    private void empmedicalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empmedicalKeyTyped
       eventclass.integerEvent(evt);
    }//GEN-LAST:event_empmedicalKeyTyped

    private void emphomrentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emphomrentKeyTyped
        eventclass.integerEvent(evt);
    }//GEN-LAST:event_emphomrentKeyTyped

    private void empcolaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empcolaKeyTyped
       eventclass.integerEvent(evt);
    }//GEN-LAST:event_empcolaKeyTyped

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEmployee().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton browseimage;
    private javax.swing.JButton clear;
    private javax.swing.JTextField empaddress;
    private javax.swing.JTextField empcasualleave;
    private javax.swing.JTextField empcola;
    private javax.swing.JTextField empcontactno;
    private javax.swing.JTextField empconvenceallow;
    private javax.swing.JTextField empdesignation;
    private com.toedter.calendar.JDateChooser empdob;
    private com.toedter.calendar.JDateChooser empdoj;
    private javax.swing.JTextField empfname;
    private javax.swing.JComboBox<String> empgender;
    private javax.swing.JTextField emphomrent;
    private javax.swing.JTextField empid;
    private javax.swing.JTextField empmedical;
    private javax.swing.JTextField empmedicalleave;
    private javax.swing.JTextField empnam;
    private javax.swing.JTextField empsalary;
    private javax.swing.JTextField empsurname;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JTextField imagepath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nicno;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
