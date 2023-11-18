public class student extends user {
    private Boolean citizenship; 
    private String gender;
    private String statement;
    private String studentID; 
    private String[] interests; 
    
    private double gpa; 
    private String major; 
    private String minor;
    private Boolean transfer;
    private String expectedGraduation; 
    private String academicYear;
    private int unitsEnrolled; 

    public student() {//This is the default constructor for the student class
        this.major = "None";
        this.minor = "None";
        this.gpa = -1;
        this.studentID = "None";
        this.citizenship = false;
        this.unitsEnrolled = -1;
        this.expectedGraduation = "None";
        this.gender = "None";
        this.statement = "None";
        this.transfer = false;
        this.academicYear = "None";
        
    }

    public void setCitizenship(Boolean citizenship) {
        this.citizenship = citizenship;
    }

    public Boolean getCitizenship() {
        return citizenship;
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

    public void setStudentID(String ID) {
        this.studentID = ID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setInterests(String interest) {
        // IMPLEMENT
    }

    public String[] getInterests() {
        return interests;
    }

    public void setGpa(double GPA) {
        this.gpa = GPA;
    }

    public double getGpa() {
        return gpa;
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

    public void setExpectedGraduation(String expectedGraduation) {
        this.expectedGraduation = expectedGraduation;
    }

    public String getExpectedGraduation() {
        return expectedGraduation;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setUnitsEnrolled(int unitsEnrolled) {
        this.unitsEnrolled = unitsEnrolled;
    }

    public int getUnitsEnrolled() {
        return unitsEnrolled;
    }
}