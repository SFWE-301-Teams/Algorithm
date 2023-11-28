package algorithm;

import java.util.Date;

/**
 * JavaBean including all applicant information required by the matching engine
 */
public class Applicant implements IApplicant {
    private Boolean USCitizenship;
    private String gender;
    private String statement;
    private String interests;
    private Double GPA;
    private String major;
    private String minor;
    private Boolean transfer;
    private Date expGradDate;
    private String academicYear;
    private Integer enrolledUnits;
    private String email;
    private String studentID;

    // Constructor
    public Applicant() {}

    // Getters/Setters
    public void setUSCitizenship(Boolean USCitizenship) {
        this.USCitizenship = USCitizenship;
    }
    public Boolean getUSCitizenship() {
        return USCitizenship;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setStatement(String statement) {
        this.statement = statement;
    }
    public String getStatement() {
        return statement;
    }
    public void setInterests(String interests) {
        this.interests = interests;
    }
    public String getInterests() {
        return interests;
    }
    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }
    public Double getGPA() {
        return GPA;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public void setMinor(String minor) {
        this.minor = minor;
    }
    public String getMinor() {
        return minor;
    }
    public void setTransfer(Boolean transfer) {
        this.transfer = transfer;
    }
    public Boolean getTransfer() {
        return transfer;
    }
    public void setExpGradDate(Date expGradDate) {
        this.expGradDate = expGradDate;
    }
    public Date getExpGradDate() {
        return expGradDate;
    }
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }
    public String getAcademicYear() {
        return academicYear;
    }
    public void setEnrolledUnits(Integer enrolledUnits) {
        this.enrolledUnits = enrolledUnits;
    }
    public Integer getEnrolledUnits() {
        return enrolledUnits;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getStudentID() {
        return studentID;
    }
}
