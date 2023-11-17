public class Scholarship {
    private String name;
    private String[] qualities;
    private double GPA;
    private String major;
    private String minor;
    private Boolean transfer;
    private String expGradDate;
    private String academicYear;
    private int enrolledUnits;
    private String gender;
    private Boolean citizenship;

    //CONSTRUCTOR
    Scholarship(){
        name = null;
        qualities = null;
        GPA = -1;
        major = null;
        minor = null;
        transfer = null;
        expGradDate = null;
        academicYear = null;
        enrolledUnits = -1;
        gender = null;
        citizenship = null;
    }


    //ACCESSORS
    public String getName(){ return this.name; }

    public String[] getQualities(){ return this.qualities; }

    public double getGPA(){ return this.GPA; }

    public String getMajor(){ return this.major; }

    public String getMinor(){ return this.minor; }

    public Boolean getTransfer(){ return this.transfer; }

    public String getExcpectedGradDate(){ return this.expGradDate; }

    public String getAcademicYear(){ return this.academicYear; }

    public int getEnrolledUnits(){ return this.enrolledUnits; }

    public boolean getCitizenship(){ return this.citizenship; }

    public String getGender(){ return this.gender; }

    //MUTATORS
    public void setName(String name){ this.name = name;}

    public void setQualities(String[] qualities){ this.qualities = qualities; }

    public void setGPA(double gpa){ this.GPA = gpa; }

    public void setMajor(String major){ this.major = major; }

    public void setMinor(String minor){ this.minor = minor; }

    public void setTransfer(Boolean transfer){ this.transfer = transfer; }

    public void setExcpectedGradDate(String expgradDate){ this.expGradDate = expgradDate; }

    public void setAcademicYear(String academicYear){ this.academicYear = academicYear; }

    public void setEnrolledUnits(int enrolledUnits){ this.enrolledUnits = enrolledUnits; }

    public void setCitizenship(Boolean citizenship){ this.citizenship = citizenship; }

    public void setGender(String gender){ this.gender = gender; }
}
