package Training_Development.Training_Development.Domain;


public class DevelopmentPlan {

    private int idPlan;
    private Date startDate;
    private String objective;
    private String status;


    public DevelopmentPlan() {
    }


    public DevelopmentPlan(int idPlan, Date startDate, String objective, String status) {
        this.idPlan = idPlan;
        this.startDate = startDate;
        this.objective = objective;
        this.status = status;
    }


    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}