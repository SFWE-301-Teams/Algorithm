package Algorithm;

import java.util.Date;

/**
 * JavaBean including all applicant information required by the matching engine
 */
public class Applicant extends IApplicant {
    private boolean USCitizenship;
    private String gender;
    private String statement;
    private String[] interests;
    private double GPA;
    private String[] majors;
    private String[] minors;
    private boolean transfer;
    private String expGradDate;
    private String academicYear;
    private int enrolledUnits;

    // Constructor
    public Applicant() {}

    // Getters/Setters
    public void setUSCitizenship(boolean USCitizenship) {
        this.USCitizenship = USCitizenship;
    }
    public boolean getUSCitizenship() {
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
    public void setInterests(String[] interests) {
        this.interests = interests;
    }
    public String[] getInterests() {
        return interests;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public double getGPA() {
        return GPA;
    }
    public void setMajors(String[] majors) {
        this.majors = majors;
    }
    public String[] getMajors() {
        return majors;
    }
    public void setMinors(String[] minors) {
        this.minors = minors;
    }
    public String[] getMinors() {
        return minors;
    }
    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }
    public boolean getTransfer() {
        return transfer;
    }
    public void setExpGradDate(String expGradDate) {
        this.expGradDate = expGradDate;
    }
    public String getExpGradDate() {
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
}
