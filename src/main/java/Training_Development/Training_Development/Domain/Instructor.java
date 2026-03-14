package Training_Development.Training_Development.Domain;

import java.time.LocalDate;

public class Instructor extends User{

    private String specialty;
    private int yearsOfExperience;
    private String certification;
    private String instructorType;
    private String educationLevel;
    private String trainingArea;
    private double hourlyRate;
    private String modality;

    public Instructor() {
    }

    public Instructor(int idUser, String firstName, String lastName, String email, String phone, String documentNumber, String password,
                      String role, boolean status, LocalDate createdAt, String specialty, int yearsOfExperience, String certification,
                      String instructorType, String educationLevel, String trainingArea, double hourlyRate, String modality) {
        super(idUser, firstName, lastName, email, phone, documentNumber, password, role, status, createdAt);
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
        this.certification = certification;
        this.instructorType = instructorType;
        this.educationLevel = educationLevel;
        this.trainingArea = trainingArea;
        this.hourlyRate = hourlyRate;
        this.modality = modality;
    }

    public String getSpecialty() {return specialty;}
    public void setSpecialty(String specialty) {this.specialty = specialty;}

    public int getYearsOfExperience() {return yearsOfExperience;}
    public void setYearsOfExperience(int yearsOfExperience) {this.yearsOfExperience = yearsOfExperience;}

    public String getCertification() {return certification;}
    public void setCertification(String certification) {this.certification = certification;}

    public String getInstructorType() {return instructorType;}
    public void setInstructorType(String instructorType) {this.instructorType = instructorType;}

    public String getEducationLevel() {return educationLevel;}
    public void setEducationLevel(String educationLevel) {this.educationLevel = educationLevel;}

    public String getTrainingArea() {return trainingArea;}
    public void setTrainingArea(String trainingArea) {this.trainingArea = trainingArea;}

    public double getHourlyRate() {return hourlyRate;}
    public void setHourlyRate(double hourlyRate) {this.hourlyRate = hourlyRate;}

    public String getModality() {return modality;}
    public void setModality(String modality) {this.modality = modality;}

    @Override
    public String toString() {
        return "Instructor{" +
                "specialty='" + specialty + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", certification='" + certification + '\'' +
                ", instructorType='" + instructorType + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", trainingArea='" + trainingArea + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", modality='" + modality + '\'' +
                '}';
    }
}