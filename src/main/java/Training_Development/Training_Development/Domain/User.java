package Training_Development.Training_Development.Domain;

import java.time.LocalDate;

public class User {

    private int idUser;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String documentNumber;
    private String password;
    private String role;
    private boolean status;
    private LocalDate createdAt;

    public User() {
    }

    public User(int idUser, String firstName, String lastName, String email, String phone, String documentNumber, String password,
                String role, boolean status, LocalDate createdAt) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.documentNumber = documentNumber;
        this.password = password;
        this.role = role;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getIdUser() {return idUser;}
    public void setIdUser(int idUser) {this.idUser = idUser;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getDocumentNumber() {return documentNumber;}
    public void setDocumentNumber(String documentNumber) {this.documentNumber = documentNumber;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getRole() {return role;}
    public void setRole(String role) {this.role = role;}

    public boolean isStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}

    public LocalDate getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDate createdAt) {this.createdAt = createdAt;}

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                '}';
    }
}