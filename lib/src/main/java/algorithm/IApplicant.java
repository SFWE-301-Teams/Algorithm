package algorithm;

import java.util.Date;

/**
 * Interface defining what information the matching engine requires about
 * an applicant
 */
interface IApplicant {
    Boolean getUSCitizenship();
    String getGender();
    String getStatement();
    String getInterests();
    Double getGPA();
    String getMajor();
    String getMinor();
    Boolean getTransfer();
    Date getExpGradDate();
    String getAcademicYear();
    Integer getEnrolledUnits();
}
