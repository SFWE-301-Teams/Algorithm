public class Applicant {
    private String name;
    private Boolean citizenship;
    private String gender;
    private String statement;
    private int studentID;
    private String email;
    private String[] interests;
    
    private double GPA;
    private String major;
    private String minor;
    private Boolean transfer;
    private String expGradDate;
    private String academicYear;
    private int enrolledUnits;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void setStudentID(int ID) {
        this.studentID = ID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setInterests(String interest) {
        // IMPLEMENT
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