package Training_Development.Training_Development.Domain;

import java.time.LocalDate;
import java.util.Objects;

public class Certificate {
    private Long certificateId;
    private Long employeeId;
    private Long trainingId;
    private LocalDate issueDate;
    private String verificationCode;
    private String status;
    private String digitalSignature;
    private String documentUrl;


    public Certificate() {}


    public Certificate(Long certificateId, Long employeeId, Long trainingId,
                       LocalDate issueDate, String verificationCode,
                       String status, String digitalSignature, String documentUrl) {
        this.certificateId = certificateId;
        this.employeeId = employeeId;
        this.trainingId = trainingId;
        this.issueDate = issueDate;
        this.verificationCode = verificationCode;
        this.status = status;
        this.digitalSignature = digitalSignature;
        this.documentUrl = documentUrl;
    }

    public Long getCertificateId() { return certificateId; }
    public void setCertificateId(Long certificateId) { this.certificateId = certificateId; }

    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }

    public Long getTrainingId() { return trainingId; }
    public void setTrainingId(Long trainingId) { this.trainingId = trainingId; }

    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }

    public String getVerificationCode() { return verificationCode; }
    public void setVerificationCode(String verificationCode) { this.verificationCode = verificationCode; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDigitalSignature() { return digitalSignature; }
    public void setDigitalSignature(String digitalSignature) { this.digitalSignature = digitalSignature; }

    public String getDocumentUrl() { return documentUrl; }
    public void setDocumentUrl(String documentUrl) { this.documentUrl = documentUrl; }


    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(certificateId, verificationCode);
    }

    // toString
    @Override
    public String toString() {
        return "Certificado{" +
                "certificateId=" + certificateId +
                ", employeeId=" + employeeId +
                ", trainingId=" + trainingId +
                ", issueDate=" + issueDate +
                ", verificationCode='" + verificationCode + '\'' +
                ", status='" + status + '\'' +
                ", digitalSignature='" + digitalSignature + '\'' +
                ", documentUrl='" + documentUrl + '\'' +
                '}';
    }

}