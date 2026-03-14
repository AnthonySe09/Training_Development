package Training_Development.Training_Development.Domain;



public class Department {

    private int idDepartment;
    private String departmentName;
    private String description;
    private String location;


    public Department() {
    }

    public Department(int idDepartment, String departmentName, String description, String location) {
        this.idDepartment = idDepartment;
        this.departmentName = departmentName;
        this.description = description;
        this.location = location;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

