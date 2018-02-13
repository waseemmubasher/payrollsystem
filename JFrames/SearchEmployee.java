package JFrames;

import BeanClasses.EmployeeBean;
import DBManager.DBM;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Waseem
 */
public class SearchEmployee extends javax.swing.JFrame {
Vector v = null;

    public SearchEmployee() throws Exception{
        initComponents();
        v = DBM.getEmployee();
        setBounds(0,0,1303,620);
         search.setText("<-- Select Option");
          search.setEnabled(false);
          updateemployee.setEnabled(false);
          payslip.setEnabled(false);
          loan.setEnabled(false);
        
    }

    class Test extends Thread{ 
        String searchType;
        String search;

        public Test(String searchType, String search) {
            this.searchType = searchType;
            this.search = search;
        }
        
  //  private void Search(String SearchType,String Search){
    public void run(){
    Vector ve = new Vector(v.size());
    
        for(int i=0;i<v.size();i++){
       EmployeeBean bean = (EmployeeBean)v.elementAt(i);
        if(bean==null)continue;

        
        String data = null;
        if(searchType.equals("Name"))data=bean.getEmpName();
        if(searchType.equals("Father Name"))data=bean.getEmpFname();
        if(searchType.equals("Employee ID"))data = bean.getEmpId();

        if(data==null)continue;
     if(data.contains(search)){
         ve.addElement(v.elementAt(i));
        
         list.setListData(ve);
         
        }
      }
   }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchby = new javax.swing.JComboBox();
        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        empnam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        empfname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        empsurname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contactno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        doj = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        empsalary = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        empgender = new javax.swing.JTextField();
        empdob = new javax.swing.JTextField();
        imagelabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ytdincome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ytdtaxpaid = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        ytdcasualleave = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ytdmedicalleave = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        casualleave = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        medicalleave = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        medical = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        conveyance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        homerent = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cola = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        addemployee = new javax.swing.JButton();
        updateemployee = new javax.swing.JButton();
        payslip = new javax.swing.JButton();
        loan = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        nicno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Employee");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
        jLabel1.setText("Search Employee By :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(75, 27, 139, 25);

        searchby.setFont(new java.awt.Font("Dialog", 0, 14));
        searchby.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Options", "Name", "Father Name", "Employee ID" }));
        searchby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbyActionPerformed(evt);
            }
        });
        jPanel1.add(searchby);
        searchby.setBounds(224, 25, 142, 28);

        search.setFont(new java.awt.Font("Dialog", 0, 14));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(512, 26, 219, 28);

        list.setFont(new java.awt.Font("Dialog", 0, 14));
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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1000, 20, 240, 490);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Employee ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 72, 113, 35);

        empid.setEditable(false);
        empid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empidActionPerformed(evt);
            }
        });
        jPanel1.add(empid);
        empid.setBounds(150, 80, 219, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 113, 113, 35);

        empnam.setEditable(false);
        empnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empnamActionPerformed(evt);
            }
        });
        jPanel1.add(empnam);
        empnam.setBounds(150, 120, 219, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Father Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 154, 113, 35);

        empfname.setEditable(false);
        empfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empfnameActionPerformed(evt);
            }
        });
        jPanel1.add(empfname);
        empfname.setBounds(150, 160, 219, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Surname");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 195, 113, 35);

        empsurname.setEditable(false);
        empsurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsurnameActionPerformed(evt);
            }
        });
        jPanel1.add(empsurname);
        empsurname.setBounds(150, 200, 219, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 236, 113, 35);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 277, 113, 35);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ContactNo");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 359, 113, 35);

        contactno.setEditable(false);
        contactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnoActionPerformed(evt);
            }
        });
        jPanel1.add(contactno);
        contactno.setBounds(150, 360, 219, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NIC No");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 440, 113, 35);

        doj.setEditable(false);
        doj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dojActionPerformed(evt);
            }
        });
        doj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dojKeyTyped(evt);
            }
        });
        jPanel1.add(doj);
        doj.setBounds(150, 400, 219, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Basic Salary");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(390, 250, 71, 35);

        empsalary.setEditable(false);
        empsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsalaryActionPerformed(evt);
            }
        });
        jPanel1.add(empsalary);
        empsalary.setBounds(510, 250, 219, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Address");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 318, 48, 35);

        address.setEditable(false);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(150, 320, 219, 30);

        empgender.setEditable(false);
        empgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empgenderActionPerformed(evt);
            }
        });
        jPanel1.add(empgender);
        empgender.setBounds(150, 240, 219, 30);

        empdob.setEditable(false);
        empdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empdobActionPerformed(evt);
            }
        });
        jPanel1.add(empdob);
        empdob.setBounds(150, 280, 219, 30);

        imagelabel.setBackground(new java.awt.Color(0, 0, 0));
        imagelabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Waseem\\Documents\\NetBeansProjects\\FYP\\x.png")); // NOI18N
        imagelabel.setText("jLabel17");
        jPanel1.add(imagelabel);
        imagelabel.setBounds(770, 110, 190, 250);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Clear");
        jPanel1.add(jButton1);
        jButton1.setBounds(1009, 550, 70, 31);

        back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(30, 550, 70, 31);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("YTD Income");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(390, 290, 113, 35);

        ytdincome.setEditable(false);
        ytdincome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ytdincomeActionPerformed(evt);
            }
        });
        jPanel1.add(ytdincome);
        ytdincome.setBounds(510, 290, 219, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("YTD Tax Paid");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(390, 330, 113, 35);

        ytdtaxpaid.setEditable(false);
        ytdtaxpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ytdtaxpaidActionPerformed(evt);
            }
        });
        jPanel1.add(ytdtaxpaid);
        ytdtaxpaid.setBounds(510, 330, 219, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Designation");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 480, 113, 35);

        designation.setEditable(false);
        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });
        jPanel1.add(designation);
        designation.setBounds(150, 480, 220, 30);

        ytdcasualleave.setEditable(false);
        ytdcasualleave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ytdcasualleaveActionPerformed(evt);
            }
        });
        jPanel1.add(ytdcasualleave);
        ytdcasualleave.setBounds(510, 490, 219, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("YTD Casual Leave");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(390, 490, 113, 35);

        ytdmedicalleave.setEditable(false);
        ytdmedicalleave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ytdmedicalleaveActionPerformed(evt);
            }
        });
        jPanel1.add(ytdmedicalleave);
        ytdmedicalleave.setBounds(510, 450, 219, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("YTD Medical Leave");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(390, 450, 113, 35);

        casualleave.setEditable(false);
        casualleave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casualleaveActionPerformed(evt);
            }
        });
        jPanel1.add(casualleave);
        casualleave.setBounds(510, 410, 219, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Casual Leaves Allow");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(380, 410, 119, 35);

        medicalleave.setEditable(false);
        medicalleave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalleaveActionPerformed(evt);
            }
        });
        jPanel1.add(medicalleave);
        medicalleave.setBounds(510, 370, 219, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Medical Leaves Allow");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(380, 370, 123, 35);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Medical");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(0, 10, 100, 30);

        medical.setEditable(false);
        medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalActionPerformed(evt);
            }
        });
        jPanel2.add(medical);
        medical.setBounds(120, 10, 220, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Conveyance");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 50, 113, 35);

        conveyance.setEditable(false);
        conveyance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conveyanceActionPerformed(evt);
            }
        });
        jPanel2.add(conveyance);
        conveyance.setBounds(120, 50, 219, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("HomeRent");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 90, 113, 35);

        homerent.setEditable(false);
        homerent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homerentActionPerformed(evt);
            }
        });
        jPanel2.add(homerent);
        homerent.setBounds(120, 90, 219, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("COLA");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(0, 130, 113, 35);

        cola.setEditable(false);
        cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaActionPerformed(evt);
            }
        });
        jPanel2.add(cola);
        cola.setBounds(120, 130, 219, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(390, 80, 340, 170);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Allowances");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(390, 50, 113, 35);

        addemployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addemployee.setText("Add Employee");
        addemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeeActionPerformed(evt);
            }
        });
        jPanel1.add(addemployee);
        addemployee.setBounds(150, 550, 120, 30);

        updateemployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        updateemployee.setText("Update Employee");
        updateemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateemployeeActionPerformed(evt);
            }
        });
        jPanel1.add(updateemployee);
        updateemployee.setBounds(300, 550, 130, 30);

        payslip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        payslip.setText("Print Last PaySlip");
        payslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payslipActionPerformed(evt);
            }
        });
        jPanel1.add(payslip);
        payslip.setBounds(470, 550, 130, 30);

        loan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loan.setText("Loan");
        loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanActionPerformed(evt);
            }
        });
        jPanel1.add(loan);
        loan.setBounds(620, 550, 110, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Date of Joining");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(30, 400, 113, 35);

        nicno.setEditable(false);
        jPanel1.add(nicno);
        nicno.setBounds(150, 440, 220, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

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
        ytdincome.setText(null);
        ytdtaxpaid.setText(null);
        designation.setText(null);
        medicalleave.setText(null);
        casualleave.setText(null);
        ytdmedicalleave.setText(null);
        ytdcasualleave.setText(null);
        nicno.setText(null);
    ImageIcon ic = new ImageIcon("x.png");
    imagelabel.setIcon(ic);
     //list.removeAll();
     }
     
    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        
        
        
        
    }//GEN-LAST:event_listValueChanged

    private void empidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empidActionPerformed

    private void searchbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbyActionPerformed
       String selectedItem = (String)searchby.getSelectedItem();
      if(selectedItem.equals("Options")){
          search.setText("<-- Select Option");
          search.setEnabled(false);
      }
       else if(selectedItem.equals("Name")){
       search.setText(null);
          search.setEnabled(true);
       }
       else if(selectedItem.equals("Father Name")){
       search.setText(null);
          search.setEnabled(true);
       }
      else if(selectedItem.equals("Employee ID")){
       search.setText(null);
          search.setEnabled(true);
       }
    }//GEN-LAST:event_searchbyActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         SearchEmployee.this.setVisible(false);
        try {
            new MainMenu().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
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
        ytdincome.setText(bean.getYearToDateIncome()+"");
        ytdtaxpaid.setText(bean.getYearToDateTaxPaid()+"");
        designation.setText(bean.getDesignation());
        medicalleave.setText(bean.getMaxMedicalleave()+"");
        casualleave.setText(bean.getMaxCasualLeave()+"");
        ytdmedicalleave.setText(bean.getYearToDateMedicalLeave()+"");
        ytdcasualleave.setText(bean.getYearToDateCasualLeave()+"");
        nicno.setText(bean.getNicNo());
        ImageIcon image = bean.getImg();
        Image im = image.getImage();
        Image myImg=im.getScaledInstance(imagelabel.getWidth(),imagelabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImg);
        imagelabel.setIcon(newImage);
        updateemployee.setEnabled(true);
        payslip.setEnabled(true);
        loan.setEnabled(true);
    }//GEN-LAST:event_listMouseClicked

    private void addemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeeActionPerformed
         SearchEmployee.this.setVisible(false);
        try {
            new NewEmployee().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addemployeeActionPerformed

    private void updateemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateemployeeActionPerformed
       try{
       EmployeeBean bean = (EmployeeBean)list.getSelectedValue();
       int employeeId = bean.getEmployeeId();
       UpdateEmployee updateEmployee = new UpdateEmployee(employeeId);
       SearchEmployee.this.setVisible(false);
       new UpdateEmployee(employeeId).setVisible(true);
       }catch(Exception e){e.printStackTrace();}
      
    }//GEN-LAST:event_updateemployeeActionPerformed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped

        String SearchType= (String)searchby.getSelectedItem();
        String Search = search.getText().toUpperCase();
        Test t = new Test(SearchType, Search);
        t.start();
        clear();
    }//GEN-LAST:event_searchKeyTyped

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed

    }//GEN-LAST:event_searchKeyPressed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked

    }//GEN-LAST:event_searchMouseClicked

    private void payslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payslipActionPerformed
         try{
       EmployeeBean bean = (EmployeeBean)list.getSelectedValue();
       int employeeId = bean.getEmployeeId();
       Vector vv = DBM.getPayroll(employeeId);
       if(vv.isEmpty()){JOptionPane.showMessageDialog(null,"Payroll Is Not Availabel");}
       else{
       MonthlySlip monthSlip = new MonthlySlip(employeeId);
       SearchEmployee.this.setVisible(false);
       new MonthlySlip(employeeId).setVisible(true);}
       }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_payslipActionPerformed

    private void loanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanActionPerformed
        try{
       EmployeeBean bean = (EmployeeBean)list.getSelectedValue();
       int employeeId = bean.getEmployeeId();
       EmployeeLoan empLoan = new EmployeeLoan(employeeId);
       SearchEmployee.this.setVisible(false);
       new EmployeeLoan(employeeId).setVisible(true);
       }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_loanActionPerformed

    private void ytdcasualleaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ytdcasualleaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ytdcasualleaveActionPerformed

    private void ytdmedicalleaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ytdmedicalleaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ytdmedicalleaveActionPerformed

    private void casualleaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casualleaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casualleaveActionPerformed

    private void medicalleaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalleaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalleaveActionPerformed

    private void ytdtaxpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ytdtaxpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ytdtaxpaidActionPerformed

    private void ytdincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ytdincomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ytdincomeActionPerformed

    private void empsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empsalaryActionPerformed

    private void colaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colaActionPerformed

    private void homerentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homerentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homerentActionPerformed

    private void conveyanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conveyanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conveyanceActionPerformed

    private void medicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalActionPerformed

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationActionPerformed

    private void dojKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dojKeyTyped

    }//GEN-LAST:event_dojKeyTyped

    private void dojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dojActionPerformed

    }//GEN-LAST:event_dojActionPerformed

    private void contactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void empdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empdobActionPerformed

    private void empgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empgenderActionPerformed

    private void empsurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empsurnameActionPerformed

    private void empfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empfnameActionPerformed

    private void empnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empnamActionPerformed

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
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SearchEmployee().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(SearchEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addemployee;
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
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JButton loan;
    private javax.swing.JTextField medical;
    private javax.swing.JTextField medicalleave;
    private javax.swing.JTextField nicno;
    private javax.swing.JButton payslip;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox searchby;
    private javax.swing.JButton updateemployee;
    private javax.swing.JTextField ytdcasualleave;
    private javax.swing.JTextField ytdincome;
    private javax.swing.JTextField ytdmedicalleave;
    private javax.swing.JTextField ytdtaxpaid;
    // End of variables declaration//GEN-END:variables
}
