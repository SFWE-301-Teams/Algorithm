package algorithm;

import java.util.Date;

/**
 * JavaBean including all scholarship information required by the matching engine
 */
public class Scholarship implements IScholarship {
    private String name;
    private String description;
    private Integer amount;
    private String interests;
    private Double GPA;
    private String major;
    private String minor;
    private Boolean transfer;
    private Date expGradDate;
    private String academicYear;
    private Integer enrolledUnits;
    private String gender;
    private Boolean USCitizenship;
    private Date deadline;

    // Constructor
    public Scholarship() {}

    // Getters/Setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer getAmount() {
        return amount;
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
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setUSCitizenship(Boolean USCitizenship) {
        this.USCitizenship = USCitizenship;
    }
    public Boolean getUSCitizenship() {
        return USCitizenship;
    }
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    public Date getDeadline() {
        return deadline;
    }
}
