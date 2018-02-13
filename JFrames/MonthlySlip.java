package JFrames;

import BeanClasses.EmployeeBean;
import DBManager.DBM;
import java.util.Vector;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.print.*;
import javax.swing.*;


/**
 *
 * @author Waseem
 */
public class MonthlySlip extends javax.swing.JFrame implements Printable{
  Vector v = null;
  Vector vv = null;
  MonthlySlip frameToPrint;
    /**
     * Creates new form MonthlySlip
     */
    static int employeeId;
    public MonthlySlip(int employeeId)throws Exception {
        initComponents();
        
        setBounds(0,0,625,635);
    
        v = DBM.getEmployee(employeeId);
    vv = DBM.getPayroll(employeeId);
         list.setListData(v);
         list.setSelectedIndex(0);
        if(list.getSelectedIndex()==0){
         EmployeeBean bean = (EmployeeBean)list.getSelectedValue();
         employeeid.setText(bean.getEmpId());
         name.setText(bean.getEmpName());
         doj.setText(bean.getEmpDoj());
         designation.setText(bean.getDesignation());
         String dateOfPay = vv.get(0)+"";
         String moP = dateOfPay.substring(5,7);int monthofPay = Integer.parseInt(moP);
         if(monthofPay==1)month.setText("JANUARY");
         if(monthofPay==2)month.setText("FEBRUARY");
         if(monthofPay==3)month.setText("MARCH");
         if(monthofPay==4)month.setText("APRIL");
         if(monthofPay==5)month.setText("MAY");
         if(monthofPay==6)month.setText("JUNE");
         if(monthofPay==7)month.setText("JULY");
         if(monthofPay==8)month.setText("AUGUST");
         if(monthofPay==9)month.setText("SEPTEMBER");
         if(monthofPay==10)month.setText("OCTUBER");
         if(monthofPay==11)month.setText("NOVEMBER");
         if(monthofPay==12)month.setText("DECEMBER");
         date.setText(vv.get(0)+"");
         basicsalary.setText(vv.get(1)+"");
         medicalallowance.setText(vv.get(2)+"");
         conveyanceallowance.setText(vv.get(3)+"");
         homrentallowance.setText(vv.get(4)+"");
         colaallowance.setText(vv.get(5)+"");
         loandeduction.setText(vv.get(6)+"");
         incometax.setText(vv.get(7)+"");
         netsalary.setText(vv.get(8)+"");
         medileave.setText(vv.get(9)+"");
         caslleave.setText(vv.get(10)+"");
         int workgdays=0;
         int totalWorkingdays=0;
         int medicalLeave = Integer.parseInt(medileave.getText());
         int casualLeave = Integer.parseInt(caslleave.getText());
         int totalLeaves = medicalLeave+casualLeave;
         if(monthofPay==1)workgdays=31;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==2)workgdays=28;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==3)workgdays=31;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==4)workgdays=30;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==5)workgdays=31;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==6)workgdays=30;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==7)workgdays=31;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==8)workgdays=31;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==9)workgdays=30;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==10)workgdays=31;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==11)workgdays=30;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         if(monthofPay==12)workgdays=31;totalWorkingdays=workgdays-totalLeaves;workingdays.setText(totalWorkingdays+"");
         
         
        }
    }
   public void FilePrintClicked(){
  
        PrinterJob job = PrinterJob.getPrinterJob();
     
        PageFormat format = job.defaultPage();
        format.setOrientation(PageFormat.PORTRAIT);
        job.setPrintable(this, format);
        
        try{
           job.print();
        }
        catch(Exception e){e.printStackTrace();}
         
    }
  
//actual printing function
    public int print(Graphics g, PageFormat format, int pagenum) {
         
       if (pagenum > 0){
           return Printable.NO_SUCH_PAGE;
       }
        
       g.translate((int)format.getImageableX(), (int)format.getImageableY());
               
       float pageWidth = (float)format.getImageableWidth();
       float pageHeight = (float)format.getImageableHeight();
        
       float imageHeight = (float)this.getHeight();
       float imageWidth = (float)this.getWidth();
        
       float scaleFactor = Math.min((float)pageWidth/(float)imageWidth, (float)pageHeight/(float)imageHeight);
  
       int scaledWidth = (int)(((float)imageWidth)*scaleFactor);
     
       int scaledHeight = (int)(((float)imageHeight)*scaleFactor);  
        
       BufferedImage canvas = new BufferedImage( 620,  585, BufferedImage.BITMASK);//increas size TYPE_INT_RGB
       Graphics2D gg = canvas.createGraphics();
       this.paint( gg );  
       Image img = canvas ;
  
       g.drawImage(img, 0,0 , scaledWidth, scaledHeight, null );
  
       return Printable.PAGE_EXISTS;
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        employeeid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        incometax = new javax.swing.JTextField();
        doj = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        basicsalary = new javax.swing.JTextField();
        medicalallowance = new javax.swing.JTextField();
        conveyanceallowance = new javax.swing.JTextField();
        homrentallowance = new javax.swing.JTextField();
        netsalary = new javax.swing.JTextField();
        loandeduction = new javax.swing.JTextField();
        colaallowance = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        caslleave = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        medileave = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        workingdays = new javax.swing.JTextField();

        jScrollPane2.setViewportView(list);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monthly Slip");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(515, 570, 80, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Software House PaySlip");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 10, 300, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Employee ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 140, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 180, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date of Joining");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 140, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Deduction");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 300, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Medical Allowance");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 370, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Conveyance Allowance");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 410, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("HomeRent Allowance");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 450, 150, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("COLA Allowance");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 490, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Loan Deduction");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(330, 330, 130, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Income Tax");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(330, 370, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Net Salary");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 530, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Date");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 220, 80, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Designation");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(330, 180, 80, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Basic Salary");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 330, 80, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Rs.");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(480, 300, 80, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("PAYSLIP FOR THE MONTH OF ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(80, 100, 330, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Rs.");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(210, 300, 80, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Earnings");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(70, 300, 80, 30);

        month.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(month);
        month.setBounds(410, 100, 140, 30);

        designation.setEditable(false);
        designation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(designation);
        designation.setBounds(440, 180, 170, 30);

        employeeid.setEditable(false);
        employeeid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(employeeid);
        employeeid.setBounds(130, 140, 190, 30);

        name.setEditable(false);
        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(name);
        name.setBounds(130, 180, 190, 30);

        incometax.setEditable(false);
        incometax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(incometax);
        incometax.setBounds(440, 370, 170, 30);

        doj.setEditable(false);
        doj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(doj);
        doj.setBounds(440, 140, 170, 30);

        date.setEditable(false);
        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(date);
        date.setBounds(130, 220, 190, 30);

        basicsalary.setEditable(false);
        basicsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(basicsalary);
        basicsalary.setBounds(180, 330, 140, 30);

        medicalallowance.setEditable(false);
        medicalallowance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(medicalallowance);
        medicalallowance.setBounds(180, 370, 140, 30);

        conveyanceallowance.setEditable(false);
        conveyanceallowance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(conveyanceallowance);
        conveyanceallowance.setBounds(180, 410, 140, 30);

        homrentallowance.setEditable(false);
        homrentallowance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(homrentallowance);
        homrentallowance.setBounds(180, 450, 140, 30);

        netsalary.setEditable(false);
        netsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(netsalary);
        netsalary.setBounds(260, 530, 170, 30);

        loandeduction.setEditable(false);
        loandeduction.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(loandeduction);
        loandeduction.setBounds(440, 330, 170, 30);

        colaallowance.setEditable(false);
        colaallowance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(colaallowance);
        colaallowance.setBounds(180, 490, 140, 30);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 563, 90, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Casual Leave");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(330, 410, 80, 30);

        caslleave.setEditable(false);
        caslleave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(caslleave);
        caslleave.setBounds(420, 410, 40, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Medical Leave");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(470, 410, 90, 30);

        medileave.setEditable(false);
        medileave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(medileave);
        medileave.setBounds(570, 410, 40, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Worked Days");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(330, 450, 90, 30);

        workingdays.setEditable(false);
        workingdays.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(workingdays);
        workingdays.setBounds(420, 450, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         MonthlySlip.this.setVisible(false);
        try {
            new SearchEmployee().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
  
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   FilePrintClicked();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
        MonthlySlip ms = new MonthlySlip(employeeId);
       ms.setVisible(true);
                
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField basicsalary;
    private javax.swing.JTextField caslleave;
    private javax.swing.JTextField colaallowance;
    private javax.swing.JTextField conveyanceallowance;
    private javax.swing.JTextField date;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField doj;
    private javax.swing.JTextField employeeid;
    private javax.swing.JTextField homrentallowance;
    private javax.swing.JTextField incometax;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Object> list;
    private javax.swing.JTextField loandeduction;
    private javax.swing.JTextField medicalallowance;
    private javax.swing.JTextField medileave;
    private javax.swing.JLabel month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField netsalary;
    private javax.swing.JTextField workingdays;
    // End of variables declaration//GEN-END:variables

 

   
}
