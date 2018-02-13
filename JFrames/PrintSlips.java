
package JFrames;

import BeanClasses.EmployeeBean;
import DBManager.DBM;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrintSlips extends javax.swing.JFrame  implements Printable{
static String empId;
static String empName;
static String payDate;
static int basicSalary;
static int medicalAllow;
static int conveyanceAllow;
static int homerentAllow;
static int colaAllow;
static int casualLeave;
static int medicalLeave;
static double loanDeduction;
static int taxDeduction;
static double netIncome;
    public PrintSlips(String empId1, String empName1, String date1, int basicSalary1, int medicalAllow1, int conveyanceAllow1, int homerentAllow1, int colaAllow1, int casualLeave1, int medicalLeave1, double loanDeduction1, int taxDeduction1, double netIncome1)throws Exception {
       this.empId = empId1;
       this.empName = empName1;
       this.payDate=date1;
       this.basicSalary = basicSalary1;
       this.medicalAllow = medicalAllow1;
       this.conveyanceAllow = conveyanceAllow1;
       this.homerentAllow = homerentAllow1;
       this.colaAllow = colaAllow1;
       this.casualLeave = casualLeave1;
       this.medicalLeave  = medicalLeave1;
       this.loanDeduction = loanDeduction1;
       this.taxDeduction = taxDeduction1;
       this.netIncome = netIncome1;
      
       initComponents();
       setBounds(0, 0, 640,610);
       
       addData();      
       
    }
    
    void addData()throws Exception{
         employeeid.setText(empId);
         name.setText(empName);
         String dateOfPay = payDate;
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
         printSLipDate.setText(payDate);
         basicsalary.setText(basicSalary+"");
         medicalallowance.setText(medicalAllow+"");
         conveyanceallowance.setText(conveyanceAllow+"");
         homrentallowance.setText(homerentAllow+"");
         colaallowance.setText(colaAllow+"");
         caslleave.setText(casualLeave+"");
         medileave.setText(medicalLeave+"");
         loandeduction.setText(loanDeduction+"");
         incometax.setText(taxDeduction+"");
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
         
         int percentage = 3;
         double remainingSalary=0.0;
         double salaryPercentage=0.0;
            
         
            int yearlyMedicalLeaveAllow = DBM.getMaxMedicalleave(empId);    //how much leaves are allowed      20
            int yearlyCasualLeaveAllow = DBM.getMaxCasualleave(empId);       //how much leaves are allowed      20
            
            int YTDmedicalLeave = DBM.getYearToDateMedicalLeave(empId);     //how many leaves he/she already taken  20
            int YTDcasualLeave = DBM.getYearToDateCasualLeave(empId);        //how many leaves he/she already taken  20
            
            int requiredMedicalLeaves = medicalLeave+YTDmedicalLeave;    //calculating already taken leaves and did this month  25
            int requiredCasualLeaved = casualLeave+YTDcasualLeave;       //calculating already taken leaves and did this month  25
           int employeeId = DBM.getEmployId(empId);
           double oldYTDIncome = DBM.getYearToDateIncome(empId);
           int oldYTDTax = DBM.getYearToDateTax(empId);
            if((requiredMedicalLeaves>yearlyMedicalLeaveAllow) ||(requiredCasualLeaved>yearlyCasualLeaveAllow)){  
                int extraMLeavesRequired = requiredMedicalLeaves-yearlyMedicalLeaveAllow;//25-20 = 5
                int extraCLeavedRequired = requiredCasualLeaved-yearlyCasualLeaveAllow;  //25-20 = 5
                int extraTotalLeaves = extraMLeavesRequired+extraCLeavedRequired;        //5+5 = 10
                int deducSalary= (extraTotalLeaves*percentage);                          // 30 =10*3;
                salaryPercentage = (netIncome*deducSalary)/100;                    // 10500 =35000*30/100
                remainingSalary = (netIncome - salaryPercentage);                      // 24500 = 35000-10500;
                                               //24500
               netsalary.setText(remainingSalary+"");
            double salry = oldYTDIncome+remainingSalary;
            int taxs = oldYTDTax+taxDeduction;   
            DBM.updateYTDs(employeeId, salry, taxs, requiredMedicalLeaves,requiredCasualLeaved);
            DBM.addPayroll(employeeId, payDate, medicalLeave, casualLeave, basicSalary, medicalAllow, conveyanceAllow, homerentAllow, colaAllow, loanDeduction, taxDeduction, remainingSalary);
           
            double oldBalance = DBM.getBalance(employeeId);
            double remainingBalance = oldBalance-loanDeduction;
            DBM.updateLoanBalance(employeeId,dateOfPay,remainingBalance);
            }
            else  
                 
            netsalary.setText(netIncome+"");
            double salry = oldYTDIncome+netIncome;
            int taxs = oldYTDTax+taxDeduction; 
            DBM.updateYTDs(employeeId, salry, taxs, requiredMedicalLeaves,requiredCasualLeaved);
            DBM.addPayroll(employeeId, payDate, medicalLeave, casualLeave, basicSalary, medicalAllow, conveyanceAllow, homerentAllow, colaAllow, loanDeduction, taxDeduction, netIncome);
           
            double oldBalance = DBM.getBalance(employeeId);
            
            double remainingBalance = oldBalance-loanDeduction;
            //System.out.println("oldBalance "+ oldBalance + "loanDeduction "+loanDeduction + "remainingBalance " + remainingBalance);
            DBM.updateLoanBalance(employeeId,dateOfPay,remainingBalance);

            
           
    }
    
 public void FilePrintClicked(){
  
        PrinterJob job = PrinterJob.getPrinterJob();
     
        PageFormat format = job.defaultPage();
        format.setOrientation(PageFormat.PORTRAIT);
        job.setPrintable(this, format);
        
        try{
         //  if(job.printDialog())
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
        
        BufferedImage canvas = new BufferedImage( 620,  585, BufferedImage.BITMASK);//increas size
       Graphics2D gg = canvas.createGraphics();
       this.paint( gg );  
       Image img = canvas ;
  
       g.drawImage(img, 0, 0, scaledWidth, scaledHeight, null );
  
       return Printable.PAGE_EXISTS;
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        loandeduction = new javax.swing.JTextField();
        incometax = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        netsalary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        colaallowance = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        homrentallowance = new javax.swing.JTextField();
        conveyanceallowance = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        medicalallowance = new javax.swing.JTextField();
        basicsalary = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        printSLipDate = new javax.swing.JTextField();
        medileave = new javax.swing.JTextField();
        caslleave = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        workingdays = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monthly Slip");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("PAYSLIP FOR THE MONTH OF ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(80, 100, 330, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Employee ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 80, 30);

        employeeid.setEditable(false);
        employeeid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(employeeid);
        employeeid.setBounds(130, 140, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 180, 80, 30);

        name.setEditable(false);
        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(name);
        name.setBounds(130, 180, 190, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Date");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 220, 80, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Software House PaySlip");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 10, 300, 60);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Rs.");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(480, 300, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Deduction");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 300, 80, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Loan Deduction");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(330, 330, 130, 30);

        loandeduction.setEditable(false);
        loandeduction.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(loandeduction);
        loandeduction.setBounds(430, 330, 140, 30);

        incometax.setEditable(false);
        incometax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(incometax);
        incometax.setBounds(430, 370, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Worked Days");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(330, 450, 90, 30);

        netsalary.setEditable(false);
        netsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(netsalary);
        netsalary.setBounds(260, 530, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Net Salary");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 530, 80, 30);

        colaallowance.setEditable(false);
        colaallowance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(colaallowance);
        colaallowance.setBounds(180, 490, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("COLA Allowance");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 490, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("HomeRent Allowance");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 450, 140, 30);

        homrentallowance.setEditable(false);
        homrentallowance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(homrentallowance);
        homrentallowance.setBounds(180, 450, 140, 30);

        conveyanceallowance.setEditable(false);
        conveyanceallowance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(conveyanceallowance);
        conveyanceallowance.setBounds(180, 410, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Conveyance Allowance");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 410, 140, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Medical Allowance");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 370, 130, 30);

        medicalallowance.setEditable(false);
        medicalallowance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(medicalallowance);
        medicalallowance.setBounds(180, 370, 140, 30);

        basicsalary.setEditable(false);
        basicsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(basicsalary);
        basicsalary.setBounds(180, 330, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Basic Salary");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 330, 80, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Earnings");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(70, 300, 80, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Rs.");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(210, 300, 80, 30);

        month.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(month);
        month.setBounds(410, 100, 140, 30);

        printSLipDate.setEditable(false);
        printSLipDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(printSLipDate);
        printSLipDate.setBounds(130, 220, 190, 30);

        medileave.setEditable(false);
        medileave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(medileave);
        medileave.setBounds(570, 410, 50, 30);

        caslleave.setEditable(false);
        caslleave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(caslleave);
        caslleave.setBounds(420, 410, 50, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Income Tax");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(330, 370, 130, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Casual Leave");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(330, 410, 80, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Medical Leave");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(480, 410, 90, 30);

        workingdays.setEditable(false);
        workingdays.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(workingdays);
        workingdays.setBounds(420, 450, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])throws Exception {
  PrintSlips ps = new PrintSlips(empId,empName,payDate,basicSalary,medicalAllow,conveyanceAllow,homerentAllow,colaAllow,casualLeave,medicalLeave,loanDeduction,taxDeduction,netIncome);
       ps.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField basicsalary;
    private javax.swing.JTextField caslleave;
    private javax.swing.JTextField colaallowance;
    private javax.swing.JTextField conveyanceallowance;
    private javax.swing.JTextField employeeid;
    private javax.swing.JTextField homrentallowance;
    private javax.swing.JTextField incometax;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loandeduction;
    private javax.swing.JTextField medicalallowance;
    private javax.swing.JTextField medileave;
    private javax.swing.JLabel month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField netsalary;
    private javax.swing.JTextField printSLipDate;
    private javax.swing.JTextField workingdays;
    // End of variables declaration//GEN-END:variables
}
