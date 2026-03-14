package Training_Development.Training_Development.Domain;

import java.time.LocalDate;

public class Employee extends User{

    private LocalDate hireDate;
    private String position;
    private double salary;
    private Department department;
    private String contractType;
    private String educationLevel;
    private int yearsOfService;
    private Employee manager;

    public Employee() {
    }

    public Employee(int idUser, String firstName, String lastName, String email, String phone,
                    String documentNumber, String password, String role, boolean status,
                    LocalDate createdAt, LocalDate hireDate, String position,
                    double salary, Department department, String contractType,
                    String educationLevel, int yearsOfService, Employee manager) {
        super(idUser, firstName, lastName, email, phone, documentNumber, password, role, status, createdAt);
        this.hireDate = hireDate;
        this.position = position;
        this.salary = salary;
        this.department = department;
        this.contractType = contractType;
        this.educationLevel = educationLevel;
        this.yearsOfService = yearsOfService;
        this.manager = manager;
    }

    public LocalDate getHireDate() {return hireDate;}
    public void setHireDate(LocalDate hireDate) {this.hireDate = hireDate;}

    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position;}

    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    public Department getDepartment() {return department;}
    public void setDepartment(Department department) {this.department = department;}

    public String getContractType() {return contractType;}
    public void setContractType(String contractType) {this.contractType = contractType;}

    public String getEducationLevel() {return educationLevel;}
    public void setEducationLevel(String educationLevel) {this.educationLevel = educationLevel;}

    public int getYearsOfService() {return yearsOfService;}
    public void setYearsOfService(int yearsOfService) {this.yearsOfService = yearsOfService;}

    public Employee getManager() {return manager;}
    public void setManager(Employee manager) {this.manager = manager;}

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", contractType='" + contractType + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", yearsOfService=" + yearsOfService +
                ", manager=" + manager +
                '}';
    }
}