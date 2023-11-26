public class Applicant {
    private String name;
    private Boolean citizenship;
    private String gender;
    private String statement;
    private Integer studentID;
    private String email;
    private String[] Interests;
    
    private Double GPA;
    private String major;
    private String minor;
    private Boolean transfer;
    private String expGradDate;
    private String academicYear;
    private Integer enrolledUnits;

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

    public void setStudentID(Integer ID) {
        this.studentID = ID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setInterests(String[] Interests) {
        // IMPLEMENT
    }

    public String[] getIntegererests() {
        return Interests;
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

    public void setTransfer(Boolean transfer) {
        this.transfer = transfer;
    }

    public Boolean getTransfer() {
        return transfer;
    }
}