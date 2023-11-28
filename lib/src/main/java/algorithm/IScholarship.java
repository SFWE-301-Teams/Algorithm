package algorithm;

import java.util.Date;

/**
 * Interface defining what information the matching engine requires about
 * a scholarship
 */
interface IScholarship {
    String getInterests();
    Double getGPA();
    String getMajor();
    String getMinor();
    Boolean getTransfer();
    Date getExpGradDate();
    String getAcademicYear();
    Integer getEnrolledUnits();
    String getGender();
    Boolean getUSCitizenship();
    Date getDeadline();
}
