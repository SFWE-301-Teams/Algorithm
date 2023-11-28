package algorithm;

import java.util.ArrayList;
import java.util.Objects;
import java.util.ArrayList;

public class MatchingEngine {
  private IScholarship[] scholarships;
  private IApplicant applicant;
  private ArrayList<IScholarship> matchedList = new ArrayList<>();

  /**
   * Returns a list of Ischolarship that match the provided user
   *
   * @param user         The user to match scholarships with
   * @param scholarships All of the possible active scholarships that the user
   *                     could match with
   */
  public ArrayList<IScholarship> match(IApplicant applicant, IScholarship[] scholarships) {

    if (!validateApplicant(applicant)) {
      // throw new RuntimeException("Invalid applicant");
      return matchedList;
    } 
    else {
      setVars(applicant, scholarships);
    }

    startMatching();
  //NOTE In
    return matchedList;
  }

  /**
   * Checks whether all of the fields of an applicant contain valid data
   * 
   * @param applicant The applicant to check
   * @return True if applicant is valid
   */
  static boolean validateApplicant(IApplicant applicant) {
    return ((Objects.nonNull(applicant.getUSCitizenship())) &&
        (Objects.nonNull(applicant.getGPA())) &&
        (Objects.nonNull(applicant.getTransfer())) &&
        (Objects.nonNull(applicant.getStatement())) &&
        (Objects.nonNull(applicant.getMinors())) &&
        (Objects.nonNull(applicant.getMajors())) &&
        (Objects.nonNull(applicant.getInterests())) &&
        (Objects.nonNull(applicant.getExpGradDate())) &&
        (Objects.nonNull(applicant.getEnrolledUnits())) &&
        (Objects.nonNull(applicant.getGender())) &&
        (Objects.nonNull(applicant.getAcademicYear())));
  }

  public void startMatching() {
    for (IScholarship newScholarship : this.scholarships) {

      if (callChecks(newScholarship)) {
        matchedList.add(newScholarship);
      }

    }
  }

  public boolean callChecks(IScholarship newScholarship) {
        return(
                validateCitizenship(newScholarship) &&
                validateTransferStudent(newScholarship) &&
                validateGPA(newScholarship) &&
                validateMinor(newScholarship) &&
                validateMajor(newScholarship) &&
                // validateInterests(newScholarship) &&  WE WILL FIGURE OUT SOON
                validateExpGradDate(newScholarship) &&
                validateEnrolledUnits(newScholarship) &&
                validateGender(newScholarship) &&
                validateAcademicYear(newScholarship)
            );
  }

    public void setApplicant(IApplicant applicant){
        this.applicant = applicant;
    }

    public void setScholarships(IScholarship[] scholarships){
        this.scholarships = scholarships;
    }

    public void setVars(IApplicant applicant, IScholarship[] scholarships){
      setApplicant(applicant);
      setScholarships(scholarships);
    }

    public boolean validateCitizenship(IScholarship checkScholarship) {
        if (!checkScholarship.getUSCitizenship()) { // checks if the Ischolarship doesn't care if USCitizen
        return true;
        } 
        else {
        return this.applicant.getUSCitizenship();
        }
    }

  public boolean validateTransferStudent(IScholarship checkScholarship) {

    if (!checkScholarship.getTransfer()) { // checks if the Ischolarship doesn't care if the transfer student status                          
      return true;
    } 
    else {
      return this.applicant.getTransfer();
    } 
  }

  public boolean validateGPA(IScholarship checkScholarship) {
    return this.applicant.getGPA() >= checkScholarship.getGPA();
  }

  public boolean validateMajor(IScholarship checkScholarship) {

    if (checkScholarship.getMajor().equalsIgnoreCase("none")) { // checks if the Ischolarship doesn't care about the major
      return true;
    }
    
    for(String major : this.applicant.getMajors()) {
       if (major.equalsIgnoreCase(checkScholarship.getMajor())) {
          return true;
        }
    }
    return false;

  }

  public boolean validateMinor(IScholarship checkScholarship) { 

    if (checkScholarship.getMinor().equalsIgnoreCase("none")) { // checks if the Ischolarship doesn't care about the minor
      return true;
    }
    
    for(String minor : this.applicant.getMinors()) {
        if( minor.equals(checkScholarship.getMinor())) {
          return true;
        }
    }
      return false;
  }

  public boolean validateExpGradDate(IScholarship checkScholarship) {
    return this.applicant.getExpGradDate().compareTo(checkScholarship.getExpGradDate()) <= 0;
  }

  public boolean validateAcademicYear(IScholarship checkScholarship) {
    return this.applicant.getAcademicYear().equalsIgnoreCase(checkScholarship.getAcademicYear());
  }

  public boolean validateEnrolledUnits(IScholarship checkScholarship) {
    return this.applicant.getEnrolledUnits() >= checkScholarship.getEnrolledUnits();
  }

  public boolean validateGender(IScholarship checkScholarship) {

    if (checkScholarship.getGender().toLowerCase().equalsIgnoreCase("none")) { // checks if the Ischolarship doesn't care about the Gender
      return true;
    }
    return this.applicant.getGender().equalsIgnoreCase(checkScholarship.getGender());
  }
}
