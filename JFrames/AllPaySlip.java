package JFrames;

import DBManager.DBM;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AllPaySlip extends javax.swing.JFrame {

    public AllPaySlip()throws Exception {
        initComponents();
        setBounds(0,0,1455,555);
        showTable();
         }    
    
    void showTable()throws Exception{
        int loan=0;
        Vector v = DBM.getPayrollEmployee();
        DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-1");
            Date dateobj = new Date();
            String date = (fmt.format(dateobj));
        for(int a=0,b=1,c=2,d=3,e=4,f=5,g=6;a<v.size();){
            String empId = (String)v.get(a);
            int id = DBM.getEmployId(empId);
                int basicSalary = (int)v.get(c);
                int medicalAllow = (int)v.get(d);
                int conveyanceAllow = (int)v.get(e);
                int homerentAllow = (int)v.get(f);
                int colaAllow = (int)v.get(g);
                int totalSalary = basicSalary+medicalAllow+conveyanceAllow+homerentAllow+colaAllow;
               String dateOfbirth = DBM.getdob(id);
               
                double installment = DBM.getInstallment(id);  
               String dobb = dateOfbirth.substring(0,4);int dateOfBirth = Integer.parseInt(dobb);
            String yoP = date.substring(0,4);int yearofPay = Integer.parseInt(yoP);//only year
            int totalage=0;
            for(int i=dateOfBirth;i<yearofPay;i++){totalage++;}//System.out.println(totalage); //telling age
            //
           
            int yearlyIncome = basicSalary*12;
            int taxDeduction = 0;
            int taxx;
            ///////////////////////////////////////////////////////////////////// tax calculation
            if(totalage<60){
                
            taxx = DBM.getTax(0, yearlyIncome);
                if(taxx==0){
                taxDeduction=0;
                }
                else{
                taxDeduction=(basicSalary*taxx)/100;
                }
            }
            else
            {
            taxx = DBM.getTax(60, yearlyIncome);
            if(taxx==0){
                taxDeduction=0;
                }
                else{
                taxDeduction=(basicSalary*taxx)/100;
                }
            }//////////////////////////////////////////////////////////////////////
//            if((totalage<60) && (yearlyIncome<=250000)){
//            taxDeduction=0;
//            }
//            else  if((totalage<60) && (yearlyIncome>250000)||(yearlyIncome<=500000)){
//            taxDeduction= (basicSalary*5)/100;
//            }
//            else if ((totalage<60)&& (yearlyIncome>500000)||(yearlyIncome<=1000000)){
//            taxDeduction= (basicSalary*20)/100;
//            }
//            else if ((totalage<60)&&(yearlyIncome>1000000)){
//            taxDeduction= (basicSalary*30)/100;
//            }
//            else if((totalage>=60)&&(yearlyIncome<=300000)){
//            taxDeduction=0;
//            }
//            else if ((totalage>=60)&&(yearlyIncome>300000)||(yearlyIncome<=500000)){
//            taxDeduction= (basicSalary*5)/100;
//            }
//            else if ((totalage>=60)&&(yearlyIncome>500000)||(yearlyIncome<=1000000)){
//            taxDeduction= (basicSalary*20)/100;
//            }
//            else if ((totalage>=60)&&(yearlyIncome>1000000)||(yearlyIncome<=5000000)){
//            taxDeduction= (basicSalary*30)/100;
//            }
            
          
            double netIncome = totalSalary-0-taxDeduction;
             
               double abb = 0;
               
                double balance = DBM.getBalance(id);
                if(balance<=0){
                int emId = DBM.getLoanInfo(id);
                if(emId==0){}
               
                else{
                int deleteLoan = DBM.deleteLoan(emId);
                }
                
               // if(emId!=0)continue;
               //int deleteLoan = DBM.deleteLoan(emId);
               // System.out.println(emId);
                Object[] row = { v.get(a), v.get(b),date,v.get(c), v.get(d),v.get(e),v.get(f),v.get(g),0,0,abb,taxDeduction,netIncome};
         model1.addRow(row); 
                a+=7;
                b+=7;
                c+=7;
                d+=7;
                e+=7;
                f+=7;
                g+=7;
                }
                else{
                       netIncome = totalSalary-installment-taxDeduction;
        Object[] row = { v.get(a), v.get(b),date,v.get(c), v.get(d),v.get(e),v.get(f),v.get(g),0,0,installment,taxDeduction,netIncome};
         model1.addRow(row); 
                a+=7;
                b+=7;
                c+=7;
                d+=7;
                e+=7;
                f+=7;
                g+=7;
                }
             }
        
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payroll");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Date", "Basic Salary", "Medical Allowance", "Conveyance Allowance", "HomeRent Allowance", "Cola Allowance", "Casual Leave", "Medical Leave", "Loan Deduction", "Tax Deduction", "Net Income"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1450, 480);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 490, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1350, 490, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1450, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AllPaySlip.this.setVisible(false);
    try {
            new MainMenu().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int rows=jTable1.getRowCount();
         
        for(int row=0;row<rows;row++){
    String id = (String)jTable1.getValueAt(row, 0);
    String name = (String)jTable1.getValueAt(row, 1);
    String datee = (String)jTable1.getValueAt(row, 2);
    int basicSalary = (int)jTable1.getValueAt(row, 3);
    int medicalAllow = (int)jTable1.getValueAt(row, 4);
    int convlAllow = (int)jTable1.getValueAt(row, 5);
    int homerentAllow = (int)jTable1.getValueAt(row, 6);
    int colaAllow = (int)jTable1.getValueAt(row, 7);
    int casualLeave = (Integer)jTable1.getValueAt(row, 8);
    int medicalleave = (Integer)jTable1.getValueAt(row, 9);
    double loanDeduc = (double)jTable1.getValueAt(row, 10);  
    int taxDeduc = (int)jTable1.getValueAt(row, 11);
    double netIncome = (double)jTable1.getValueAt(row, 12);
             try {
                 PrintSlips ps = new PrintSlips(id, name, datee, basicSalary, medicalAllow, convlAllow, homerentAllow, colaAllow, casualLeave, medicalleave, loanDeduc, taxDeduc, netIncome);
               // Thread.sleep(1000);
                 ps.show();
                 ps.FilePrintClicked();
                 ps.setVisible(false);
               // Thread.sleep(1000);
                 // System.out.println(id + " " + name + " " + datee + " " + basicSalary + " " + medicalAllow);
             } catch (Exception ex) {
                ex.printStackTrace();
             }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
       AllPaySlip paySlip = new AllPaySlip();
       paySlip.show();
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
