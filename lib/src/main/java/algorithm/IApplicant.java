package algorithm;

import java.util.Date;

/**
 * Interface defining what information the matching engine requires about
 * an applicant
 */
interface IApplicant {
    boolean getUSCitizenship();
    String getGender();
    String getStatement();
    String[] getInterests();
    double getGPA();
    String[] getMajors();
    String[] getMinors();
    boolean getTransfer();
    Date getExpGradDate();
    String getAcademicYear();
    int getEnrolledUnits();
}
