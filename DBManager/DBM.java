package DBManager;

import BeanClasses.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Vector;
import javax.swing.ImageIcon;

/**
 *
 * @author Waseem
 */
public class DBM {
    
    static Connection con=null;
    static{
        try{
            init();
        }catch(Exception e){e.printStackTrace();}
    }
    public static void init() throws Exception{
         Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql:///payrolsystem", "root", "root");
        //System.out.println("Connection Established");
    }//init closed
    
        public static String getNicNo(String nicNo)throws Exception{
            String query="select NicNo from employee where NicNo like '"+nicNo+"'";
           // System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Vector v = new Vector();
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                String nicNO = "";
           if(rs.next())
               nicNO = rs.getString(1);
           return nicNO;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
    
        public static String getEmployeeId(String employeeId)throws Exception{
            String query="select EmpID from employee where EmpID like '"+employeeId+"'";
            //System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                String employeId = "";
           if(rs.next())
               employeId = rs.getString(1);
           return employeId;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
        
         public static int getEmployId(String employeeId)throws Exception{
            String query="select ID from employee where EmpID like '"+employeeId+"'";
            //System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                int employeId = 0;
           if(rs.next())
               employeId = rs.getInt(1);
           return employeId;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
        
          public static int getMaxMedicalleave(String employeeId)throws Exception{
            String query="select MaxMedicalLeave from employee where EmpID like '"+employeeId+"'";
            //System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                int maxMedicalLeave = -1;
           if(rs.next())
               maxMedicalLeave = rs.getInt(1);
           return maxMedicalLeave;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
          public static int getMaxCasualleave(String employeeId)throws Exception{
            String query="select MaxCasualLeave from employee where EmpID like '"+employeeId+"'";
            //System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                int maxCasualLeave = -1;
           if(rs.next())
               maxCasualLeave = rs.getInt(1);
           return maxCasualLeave;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        } 
          public static int getYearToDateMedicalLeave(String employeeId)throws Exception{
            String query="select YTDMedicalLeave from employee where EmpID like '"+employeeId+"'";
            //System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                int YearToDateMedicalLeave = -1;
           if(rs.next())
               YearToDateMedicalLeave = rs.getInt(1);
           return YearToDateMedicalLeave;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        } 
           public static int getYearToDateCasualLeave(String employeeId)throws Exception{
            String query="select YTDCasualLeave from employee where EmpID like '"+employeeId+"'";
            //System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                int YearToDateCasualLeave = -1;
           if(rs.next())
               YearToDateCasualLeave = rs.getInt(1);
           return YearToDateCasualLeave;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        } 
          
         
         
        public static Vector getAdminLogin(String adminName,String adminPass)throws Exception{
            String query="SELECT AdminName,PASSWORD FROM login WHERE AdminName='"+adminName+"' AND PASSWORD='"+adminPass+"'";
           // System.out.println(query);
            Vector v = new Vector();
            ResultSet rs = null;
            PreparedStatement ps = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while(rs.next()){
                    String admnName = rs.getString("AdminName");
                    String adminPassword = rs.getString("Password");
                    v.add(admnName);
                    v.add(adminPassword);
                  
                }
                return v;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
    
    
        public static Vector getEmployee()throws Exception{
            String query="Select * from employee";
            Vector v = new Vector();
            ResultSet rs = null;
            PreparedStatement ps = null;
            try{
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                int employeeId = rs.getInt("ID");
                String empId = rs.getString("EmpID");
                String empName = rs.getString("EmpName");
                String empFname = rs.getString("EmpFName");
                String empSurname = rs.getString("EmpSurname");
                String empGender = rs.getString("EmpGender");
                String empDob = rs.getString("EmpDOB");
                String empAddress = rs.getString("EmpAddress");
                String empContactno = rs.getString("EmpContactNo");
                String empDoj = rs.getString("EmpDateOfJoining");
                int empSalary = rs.getInt("BasicSalary");
                int empMedical = rs.getInt("AllowMedical");
                int empConveyance = rs.getInt("AllowConvance");
                int empHomerent = rs.getInt("AllowHomeRent");
                int empCola = rs.getInt("AllowCOLA");
                int empYearlyIncone = rs.getInt("YTDIncome");
                int empYearlyTaxPaid = rs.getInt("YTDTaxPaid");
                String empDesignation = rs.getString("Designation");
                int empMedicalLeave = rs.getInt("MaxMedicalLeave");
                int empCasualLeave = rs.getInt("MaxCasualLeave");
                int empYearlyMedicalLeave = rs.getInt("YTDMedicalLeave");
                int empYearlyCasualLeave = rs.getInt("YTDCasualLeave");
                String empNicno = rs.getString("NicNo");
                byte[] img = rs.getBytes("empImage");
                ImageIcon image = new ImageIcon(img);
                EmployeeBean bean = new EmployeeBean();
                bean.setEmployeeId(employeeId);
                bean.setEmpId(empId);
                bean.setEmpName(empName);
                bean.setEmpFname(empFname);
                bean.setEmpSurname(empSurname);
                bean.setEmpGender(empGender);
                bean.setEmpDob(empDob);
                bean.setEmpAddress(empAddress);
                bean.setEmpContactno(empContactno);
                bean.setEmpDoj(empDoj);
                bean.setBasicSalary(empSalary);
                bean.setAllowMedical(empMedical);
                bean.setAllowConvance(empConveyance);
                bean.setAllowHomerent(empHomerent);
                bean.setAllowCola(empCola);
                bean.setYearToDateIncome(empYearlyIncone);
                bean.setYearToDateTaxPaid(empYearlyTaxPaid);
                bean.setDesignation(empDesignation);
                bean.setMaxMedicalleave(empMedicalLeave);
                bean.setMaxCasualLeave(empCasualLeave);
                bean.setYearToDateMedicalLeave(empYearlyMedicalLeave);
                bean.setYearToDateCasualLeave(empYearlyCasualLeave);
                bean.setNicNo(empNicno);
                bean.setImg(image);
                v.addElement(bean);
            }
            return v;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
            
        }//getEmployee
        
                public static Vector getEmployee(int employeeId)throws Exception{
            String query="Select * from employee where ID="+employeeId;
            Vector v = new Vector();
            ResultSet rs = null;
            PreparedStatement ps = null;
            try{
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
               
                String empId = rs.getString("EmpID");
                String empName = rs.getString("EmpName");
                String empFname = rs.getString("EmpFName");
                String empSurname = rs.getString("EmpSurname");
                String empGender = rs.getString("EmpGender");
                String empDob = rs.getString("EmpDOB");
                String empAddress = rs.getString("EmpAddress");
                String empContactno = rs.getString("EmpContactNo");
                String empDoj = rs.getString("EmpDateOfJoining");
                int empSalary = rs.getInt("BasicSalary");
                int empMedical = rs.getInt("AllowMedical");
                int empConveyance = rs.getInt("AllowConvance");
                int empHomerent = rs.getInt("AllowHomeRent");
                int empCola = rs.getInt("AllowCOLA");
                int empYearlyIncone = rs.getInt("YTDIncome");
                int empYearlyTaxPaid = rs.getInt("YTDTaxPaid");
                String empDesignation = rs.getString("Designation");
                int empMedicalLeave = rs.getInt("MaxMedicalLeave");
                int empCasualLeave = rs.getInt("MaxCasualLeave");
                int empYearlyMedicalLeave = rs.getInt("YTDMedicalLeave");
                int empYearlyCasualLeave = rs.getInt("YTDCasualLeave");
                byte[] img = rs.getBytes("empImage");
                ImageIcon image = new ImageIcon(img);
                
              
                 EmployeeBean bean = new EmployeeBean();
                bean.setEmployeeId(employeeId);
                bean.setEmpId(empId);
                bean.setEmpName(empName);
                bean.setEmpFname(empFname);
                bean.setEmpSurname(empSurname);
                bean.setEmpGender(empGender);
                bean.setEmpDob(empDob);
                bean.setEmpAddress(empAddress);
                bean.setEmpContactno(empContactno);
                bean.setEmpDoj(empDoj);
                bean.setBasicSalary(empSalary);
                bean.setAllowMedical(empMedical);
                bean.setAllowConvance(empConveyance);
                bean.setAllowHomerent(empHomerent);
                bean.setAllowCola(empCola);
                bean.setYearToDateIncome(empYearlyIncone);
                bean.setYearToDateTaxPaid(empYearlyTaxPaid);
                bean.setDesignation(empDesignation);
                bean.setMaxMedicalleave(empMedicalLeave);
                bean.setMaxCasualLeave(empCasualLeave);
                bean.setYearToDateMedicalLeave(empYearlyMedicalLeave);
                bean.setYearToDateCasualLeave(empYearlyCasualLeave);
                bean.setImg(image);
                v.addElement(bean);
            }
            return v;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
            
        }//getEmployee
    
        public static int updateLoanBalance(int EmpId,String date,double balance)throws Exception{//mate to it update
            String query = "Update loan set Balance="+balance+" where EmployeeID="+EmpId;
            PreparedStatement ps = null;
            try{
                ps = con.prepareStatement(query);
                int rows = ps.executeUpdate();
                return rows;
            }finally{
            if(ps!=null)ps.close();
            }
        }
        
        public static int addPayroll(int empId,String date,int medicalLeave,int casualLeave,int basicSalary,int medicalAllow,int convyanceAllowance,int homerentAllowance,int COLAallowance,double deducLoan,int deducTax,double netSalary)throws Exception{
            String query="INSERT into payroll(EmployeeID,Date,MedicalLeaved,CasualLeaves,BasicPay,AllowMedical,AllowConvance,AllowHomeRent,AllowCOLA,DedLoan,DedTax,NetSalary) values("+empId+",'"+date+"',"+medicalLeave+","+casualLeave+","+basicSalary+","+medicalAllow+","+convyanceAllowance+","+homerentAllowance+","+COLAallowance+","+deducLoan+","+deducTax+","+netSalary+")";
           // System.out.println(query);
            PreparedStatement ps = null;
            try{
                ps= con.prepareStatement(query);
                int rows = ps.executeUpdate();
                return rows;
            }finally{
            if(ps!=null)ps.close();
            }
        }
        
        public static int addEmployee(String empId,String empName,String empFname,String empSurname,String empGender,String empDob,String empAddress,String empContactno,String empDoj,int basicSalary,int allowMedical,int allowConvance,int allowHomerent,int allowCola,String designation,int maxMedicalleave,int maxCasualLeave,String imageUrl,String nicNo)throws Exception{
        String query="INSERT into employee(EmpID,EmpName,EmpFName,EmpSurname,EmpGender,EmpDOB,EmpAddress,EmpContactNo,EmpDateOfJoining,BasicSalary,AllowMedical,AllowConvance,AllowHomeRent,AllowCOLA,Designation,MaxMedicalLeave,MaxCasualLeave,empImage,NicNo) values('"+empId+"','"+empName+"','"+empFname+"','"+empSurname+"','"+empGender+"','"+empDob+"','"+empAddress+"','"+empContactno+"','"+empDoj+"',"+basicSalary+","+allowMedical+","+allowConvance+","+allowHomerent+","+allowCola+",'"+designation+"',"+maxMedicalleave+","+maxCasualLeave+",?,'"+nicNo+"')";
      //  System.out.println(query);
        PreparedStatement ps = null;
        File image = new File(imageUrl);
        FileInputStream fis = new FileInputStream ( image );  
        try{
        ps = con.prepareStatement(query);
        ps.setBinaryStream(1, fis,(int) image.length() );
        int rows=ps.executeUpdate();
        return rows;
        }finally{
        if(ps!=null)ps.close();
       }
        }//addemployee
        
        public static int addLoan(int employeeId,String date,int amount,double balance,double installment)throws Exception{
            String query="INSERT into loan(EmployeeID,Date,Amount,Balance,Installment) values ("+employeeId+",'"+date+"',"+amount+","+balance+","+installment+")";
           // System.out.println(query);
            PreparedStatement ps = null;
            try{
            ps = con.prepareStatement(query);
            int rows = ps.executeUpdate();
            return rows;
            }finally{
            if(ps!=null)ps.close();
            }
        }//addloan
        
       public static double getInstallment(int emplId)throws Exception{
           String query="SELECT SUM(Installment) from loan where EmployeeID="+emplId;
           //System.out.println(query);
           PreparedStatement ps = null;
           ResultSet rs = null;
           try{
           ps = con.prepareStatement(query);
           rs = ps.executeQuery();
           double amount = -1;
           if(rs.next())
               amount = rs.getDouble(1);
           return amount;
           }finally{
               if(rs!=null)rs.close();
               if(ps!=null)ps.close();
           }
      }//getInstallment
       
        public static String getdob(int emplId)throws Exception{
           String query="SELECT EmpDOB from employee where ID="+emplId;
           //System.out.println(query);
           PreparedStatement ps = null;
           ResultSet rs = null;
           try{
           ps = con.prepareStatement(query);
           rs = ps.executeQuery();
           String dob = "";
           if(rs.next())
               dob = rs.getString(1);
           return dob;
           }finally{
               if(rs!=null)rs.close();
               if(ps!=null)ps.close();
           }
      }//getInstallment
       
       public static int getAmount(int emplId)throws Exception{
           String query="SELECT SUM(Amount) from loan where EmployeeID="+emplId;
          // System.out.println(query);
           PreparedStatement ps = null;
           ResultSet rs = null;
           try{
           ps = con.prepareStatement(query);
           rs = ps.executeQuery();
           int amount = -1;
           if(rs.next())
               amount = rs.getInt(1);
           return amount;
           }finally{
               if(rs!=null)rs.close();
               if(ps!=null)ps.close();
           }
      }//getAmount
      
        public static double getBalance(int emplId)throws Exception{
           String query="SELECT SUM(Balance) from loan where EmployeeID="+emplId;
           //System.out.println(query);
           PreparedStatement ps = null;
           ResultSet rs = null;
           try{
           ps = con.prepareStatement(query);
           rs = ps.executeQuery();
           double amount = -1;
           if(rs.next())
               amount = rs.getDouble(1);
           return amount;
           }finally{
               if(rs!=null)rs.close();
               if(ps!=null)ps.close();
           }
      }//getBalance
        
        public static int getLoanInfo(int empId)throws Exception{
            String query="SELECT ID FROM loan WHERE Balance<=0 AND EmployeeID="+empId;
            PreparedStatement ps = null;
           ResultSet rs = null;
           try{
           ps = con.prepareStatement(query);
           rs = ps.executeQuery();
           int id = 0;
           if(rs.next())
               id = rs.getInt(1);
           return id;
           }finally{
               if(rs!=null)rs.close();
               if(ps!=null)ps.close();
           }
        }
        public static int deleteLoan (int id)throws Exception{
              String query = "Delete  from loan where ID="+id;
              System.out.println(query);
              Statement st = null;
              try{
                  st=con.createStatement();
                  int rows =st.executeUpdate(query);
                  return rows;
              }finally{
                  if(st!=null) st.close();
              }
          } 
        
      //"Update employee_detail set BASIC_SALARY="+Salary+" where EMPLOYEE_ID="+empId;
        
        public static int updateYTDs(int employeeId,double yearTDIncome,int yearTDTaxPaid,int yearTDMedicalLeave,int yearTDCasualLeave)throws Exception{
            String query="UPDATE employee set YTDIncome="+yearTDIncome+",YTDTaxPaid="+yearTDTaxPaid+",YTDMedicalLeave="+yearTDMedicalLeave+",YTDCasualLeave="+yearTDCasualLeave+" where ID="+employeeId;
           // System.out.println(query);
            PreparedStatement ps = null;
            try{
                ps=con.prepareStatement(query);
                int rows = ps.executeUpdate();
                return rows;
            }finally{
            if(ps!=null)ps.close();
            }
        }
     
        public static int updateEmployee(int employeeId,String empName,String empFname,String surname,String address,String contactNo,String designation,int medicalLeave,int casualLeave,int basicSalary,int medicalAllow,int conveyncAllow,int homeRentAllow,int colaAllow)throws Exception{
            String query="UPDATE employee set EmpName='"+empName+"',EmpFName='"+empFname+"',EmpSurname='"+surname+"',EmpAddress='"+address+"',EmpContactNo='"+contactNo+"',MaxMedicalLeave="+medicalLeave+",MaxCasualLeave="+casualLeave+",BasicSalary="+basicSalary+",AllowMedical="+medicalAllow+",AllowConvance="+conveyncAllow+",AllowHomeRent="+homeRentAllow+",AllowCOLA="+colaAllow+" where ID="+employeeId;
          //  System.out.println(query);
            PreparedStatement ps = null;
            
            try{
                ps=con.prepareStatement(query);
              
                int rows = ps.executeUpdate();
                return rows;
            }finally{
            if(ps!=null)ps.close();
            }
            
            
        }
        public static Vector getPayroll(int employeeId)throws Exception{
            String query="SELECT * FROM payroll WHERE EmployeeID="+employeeId+" ORDER BY DATE DESC LIMIT 1;";
            //System.out.println(query);
            Vector v = new Vector();
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while(rs.next()){
                    String dateOfSlip = rs.getString("Date");
                    int basicSalary = rs.getInt("BasicPay");
                    int medicalAllow= rs.getInt("AllowMedical");
                    int conveyanceAllow= rs.getInt("AllowConvance");
                    int homeRentAllow = rs.getInt("AllowHomeRent");
                    int colaAllow = rs.getInt("AllowCOLA");
                    int loanDeduction = rs.getInt("DedLoan");
                    int taxDeduction = rs.getInt("DedTax");
                    int netSalary = rs.getInt("NetSalary");
                    int medicalLeave = rs.getInt("MedicalLeaved");
                    int casualLeave = rs.getInt("CasualLeaves");
                    
                    v.add(0,dateOfSlip);
                    v.add(1,basicSalary);
                    v.add(2,medicalAllow);
                    v.add(3,conveyanceAllow);
                    v.add(4,homeRentAllow);
                    v.add(5,colaAllow);
                    v.add(6,loanDeduction);
                    v.add(7,taxDeduction);
                    v.add(8,netSalary);
                    v.add(9,medicalLeave);
                    v.add(10,casualLeave);
                    }
                return v;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
        
        public static Vector getPayrollEmployee()throws Exception{
            String query="Select  * from employee";
            Vector v = new Vector();
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while(rs.next()){
                    String empId = rs.getString("EmpID");
                    String empName = rs.getString("EmpName");
                    int basicSalary = rs.getInt("BasicSalary");
                    int medicalAllow = rs.getInt("AllowMedical");
                    int conveyanceAllow = rs.getInt("AllowConvance");
                    int homerentAllow = rs.getInt("AllowHomeRent");
                    int colaAllow = rs.getInt("AllowCOLA");
                    v.add(0, empId);
                    v.add(1, empName);
                    v.add(2,basicSalary);
                    v.add(3,medicalAllow);
                    v.add(4,conveyanceAllow);
                    v.add(5,homerentAllow);
                    v.add(6,colaAllow);
                }
                return v;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
        
        public static EmpBean getEmp(String empId)throws Exception{
            String query="Select * from employee where EmpID like '"+empId+"' ";
            Vector v = new Vector();
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs=ps.executeQuery();
                EmpBean bean = new EmpBean();
                while(rs.next()){
                    String name = rs.getString("EmpName");
                    String fName = rs.getString("EmpFName");
                    String gender = rs.getString("EmpGender");
                    String surname = rs.getString("EmpSurname");
                    
                    
                    bean.setName(name);
                    bean.setFname(fName);
                    bean.setGender(gender);
                    bean.setSurname(surname);
                    }
              return bean;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
       
        }
        
         public static int getTax(int empAge,int yearlyIncome)throws Exception{
            String query="SELECT Percentage FROM taxsetup WHERE AgeAbove >="+empAge+" AND YearlyIncomeSlab >="+yearlyIncome+" LIMIT 1";
            
            PreparedStatement ps = null;
           ResultSet rs = null;
           try{
           ps = con.prepareStatement(query);
           rs = ps.executeQuery();
           int percntage = -1;
           if(rs.next())
               percntage = rs.getInt(1);
           return percntage;
           }finally{
               if(rs!=null)rs.close();
               if(ps!=null)ps.close();
           }
        }
         
         
         public static int loanInfo(int emplId)throws Exception{
           String query="SELECT ID from loan where EmployeeID="+emplId;
           //System.out.println(query);
           PreparedStatement ps = null;
           ResultSet rs = null;
           try{
           ps = con.prepareStatement(query);
           rs = ps.executeQuery();
           int id = 0;
           if(rs.next())
               id = rs.getInt(1);
           return id;
           }finally{
               if(rs!=null)rs.close();
               if(ps!=null)ps.close();
           }
      }//getInstallment
         
         public static double getYearToDateIncome(String employeeId)throws Exception{
            String query="select YTDIncome from employee where EmpID like '"+employeeId+"'";
            //System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                double YearToDateIncome = 0.0;
           if(rs.next())
               YearToDateIncome = rs.getDouble(1);
           return YearToDateIncome;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
        public static int getYearToDateTax(String employeeId)throws Exception{
            String query="select YTDTaxPaid from employee where EmpID like '"+employeeId+"'";
            //System.out.println(query);
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                int YearToDateTax = 0;
           if(rs.next())
               YearToDateTax = rs.getInt(1);
           return YearToDateTax;
            }finally{
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
            }
        }
}
