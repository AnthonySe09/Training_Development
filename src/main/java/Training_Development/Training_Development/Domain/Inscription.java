package Training_Development.Training_Development.Domain;

import java.util.Date;

public class Inscription {

    private int registrationId;
    private int employeeId;
    private int courseId;
    private Date registrationDate;
    private String status;

    public Inscription() {}

    public Inscription(int registrationId, int employeeId, int courseId, Date registrationDate, String status){
        this.registrationId = registrationId;
        this.employeeId = employeeId;
        this.courseId = courseId;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void cancelRegistration(){}

    public void confirmRegistration(){}

    @Override
    public String toString() {
        return "Registration{" +
                "registrationId=" + registrationId +
                ", employeeId=" + employeeId +
                ", courseId=" + courseId +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                '}';
    }
}
