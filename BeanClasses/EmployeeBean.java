 package BeanClasses;

import javax.swing.ImageIcon;

/**
 *
 * @author Waseem
 */
public class EmployeeBean {
    private String dateOfSlip;
    private int employeeId;
  private  String empId;
  private  String empName;
  private String empFname;
  private  String empSurname;
  private  String empGender;
  private  String empDob;
  private  String empAddress;
  private  String empContactno;
  private  String empDoj;
  private  int basicSalary;
  private  int allowMedical;
  private  int allowConvance;
  private  int allowHomerent;
  private  int allowCola;
  private  int yearToDateIncome;
  private  int yearToDateTaxPaid;
  private  String designation;
  private  int maxMedicalleave;
  private  int maxCasualLeave;
  private  int yearToDateMedicalLeave;
  private  int yearToDateCasualLeave;
  private int netIncome;
  private  ImageIcon img;
  private int loanDeduction;
  private int taxDeduction;
  private String nicNo;

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

   

    public int getLoanDeduction() {
        return loanDeduction;
    }

    public void setLoanDeduction(int loanDeduction) {
        this.loanDeduction = loanDeduction;
    }

    public int getTaxDeduction() {
        return taxDeduction;
    }

    public void setTaxDeduction(int taxDeduction) {
        this.taxDeduction = taxDeduction;
    }
  

    public String getDateOfSlip() {
        return dateOfSlip;
    }

    public void setDateOfSlip(String dateOfSlip) {
        this.dateOfSlip = dateOfSlip;
    }

  
    public int getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(int netIncome) {
        this.netIncome = netIncome;
    }
  
   public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpFname() {
        return empFname;
    }

    public void setEmpFname(String empFname) {
        this.empFname = empFname;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpDob() {
        return empDob;
    }

    public void setEmpDob(String empDob) {
        this.empDob = empDob;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpContactno() {
        return empContactno;
    }

    public void setEmpContactno(String empContactno) {
        this.empContactno = empContactno;
    }

    public String getEmpDoj() {
        return empDoj;
    }

    public void setEmpDoj(String empDoj) {
        this.empDoj = empDoj;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getAllowMedical() {
        return allowMedical;
    }

    public void setAllowMedical(int allowMedical) {
        this.allowMedical = allowMedical;
    }

    public int getAllowConvance() {
        return allowConvance;
    }

    public void setAllowConvance(int allowConvance) {
        this.allowConvance = allowConvance;
    }

    public int getAllowHomerent() {
        return allowHomerent;
    }

    public void setAllowHomerent(int allowHomerent) {
        this.allowHomerent = allowHomerent;
    }

    public int getAllowCola() {
        return allowCola;
    }

    public void setAllowCola(int allowCola) {
        this.allowCola = allowCola;
    }

    public int getYearToDateIncome() {
        return yearToDateIncome;
    }

    public void setYearToDateIncome(int yearToDateIncome) {
        this.yearToDateIncome = yearToDateIncome;
    }

    public int getYearToDateTaxPaid() {
        return yearToDateTaxPaid;
    }

    public void setYearToDateTaxPaid(int yearToDateTaxPaid) {
        this.yearToDateTaxPaid = yearToDateTaxPaid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getMaxMedicalleave() {
        return maxMedicalleave;
    }

    public void setMaxMedicalleave(int maxMedicalleave) {
        this.maxMedicalleave = maxMedicalleave;
    }

    public int getMaxCasualLeave() {
        return maxCasualLeave;
    }

    public void setMaxCasualLeave(int maxCasualLeave) {
        this.maxCasualLeave = maxCasualLeave;
    }

    public int getYearToDateMedicalLeave() {
        return yearToDateMedicalLeave;
    }

    public void setYearToDateMedicalLeave(int yearToDateMedicalLeave) {
        this.yearToDateMedicalLeave = yearToDateMedicalLeave;
    }

    public int getYearToDateCasualLeave() {
        return yearToDateCasualLeave;
    }

    public void setYearToDateCasualLeave(int yearToDateCasualLeave) {
        this.yearToDateCasualLeave = yearToDateCasualLeave;
    }

   

    @Override
    public String toString() {
        return empName;
    }
  
  
    
}
