package Training_Development.Training_Development.Domain;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Training {

    private int trainingId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private int durationHours;
    private String modality;

    public Training() {
    }

    public Training(int trainingId, String name, String description, Date startDate, Date endDate, int durationHours, String modality) {
        this.trainingId = trainingId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.durationHours = durationHours;
        this.modality = modality;
    }

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(int durationHours) {
        this.durationHours = durationHours;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }
}