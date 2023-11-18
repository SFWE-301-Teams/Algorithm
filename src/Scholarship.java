public class Scholarship {
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
    private String scholarshipName;
    private int payout;
    private String deadline;
    private String customRequiredInfo;
    private String preferedMajors;

    //CONSTRUCTOR
    public Scholarship(){
        scholarshipName = null;
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
        payout = -1;
        deadline = null;
        customRequiredInfo = null;
        preferedMajors = null;
    }


    //ACCESSORS
    public String getScholarshipName(){ return this.scholarshipName; }

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

    public int getPayout(){ return this.payout; }
    
    public String getDeadline(){ return this.deadline; }

    public String getCustomRequiredInfo(){ return this.customRequiredInfo; }

    public String getPreferedMajors(){ return this.preferedMajors; }

    //MUTATORS
    public void setScholarshipName(String name){ this.scholarshipName = name;}

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

    public void setPayout(int payout){ this.payout = payout; }
    
    public void setDeadline(String deadline){ this.deadline = deadline; }

    public void setCustomRequiredInfo(String customRequiredinfo){ this.customRequiredInfo = customRequiredinfo; }

    public void setPreferedMajors(String preferedMajors){ this.preferedMajors = preferedMajors; }
}
