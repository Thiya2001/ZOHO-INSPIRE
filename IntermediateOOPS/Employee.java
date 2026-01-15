public class Employee {
    private String empName;
    private double empSal;
    private String hireDate;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getHireDate() {
        return hireDate;
    }
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpName("Hari");
        e.setEmpSal(35000);
        e.setHireDate("12-06-2023");

        System.out.println("Employee Name : " + e.getEmpName());
        System.out.println("Employee salary : " + e.getEmpSal());
        System.out.println("Hire Date : " + e.getHireDate());
    }
}
