package Training_Development.Training_Development.Domain;

import java.time.LocalDate;
import java.util.Objects;

public class Induction {
    private Long inductionId;
    private Long employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String instructor;
    private String status;
    private String remarks;
    private Object o;


    public Induction() {}


    public Induction(Long inductionId, Long employeeId, LocalDate startDate,
                     LocalDate endDate, String instructor, String status,
                     String remarks) {
        this.inductionId = inductionId;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.instructor = instructor;
        this.status = status;
        this.remarks = remarks;
    }

    // Getters and Setters
    public Long getInductionId() { return inductionId; }
    public void setInductionId(Long inductionId) { this.inductionId = inductionId; }

    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }


    @Override
    public int hashCode() {
        return Objects.hash(inductionId, employeeId);
    }


    @Override
    public String toString() {
        return "Induccion{" +
                "inductionId=" + inductionId +
                ", employeeId=" + employeeId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", instructor='" + instructor + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}