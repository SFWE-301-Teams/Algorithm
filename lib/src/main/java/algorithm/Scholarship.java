package algorithm;

import java.util.Date;

/**
 * JavaBean including all scholarship information required by the matching engine
 */
public class Scholarship implements IScholarship {
    private String scholarshipName;
    private String[] qualities;
    private double GPA;
    private String major;
    private String minor;
    private boolean transfer;
    private Date expGradDate;
    private String academicYear;
    private int enrolledUnits;
    private String gender;
    private boolean USCitizenship;
    private Date deadline;

    // Constructor
    public Scholarship() {}

    // Getters/Setters
    public void setScholarshipName(String name) {
        this.scholarshipName = name;
    }
    public String getScholarshipName() {
        return scholarshipName;
    }
    public void setQualities(String[] qualities) {
        this.qualities = qualities;
    }
    public String[] getQualities() {
        return qualities;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public double getGPA() {
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
    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }
    public boolean getTransfer() {
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
    public void setEnrolledUnits(int enrolledUnits) {
        this.enrolledUnits = enrolledUnits;
    }
    public int getEnrolledUnits() {
        return enrolledUnits;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setUSCitizenship(boolean USCitizenship) {
        this.USCitizenship = USCitizenship;
    }
    public boolean getUSCitizenship() {
        return USCitizenship;
    }
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    public Date getDeadline() {
        return deadline;
    }
}
