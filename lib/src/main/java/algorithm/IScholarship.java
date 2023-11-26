package algorithm;

import java.util.Date;

/**
 * Interface defining what information the matching engine requires about
 * a scholarship
 */
interface IScholarship {
    String[] getQualities();
    double getGPA();
    String getMajor();
    String getMinor();
    boolean getTransfer();
    Date getExpGradDate();
    String getAcademicYear();
    int getEnrolledUnits();
    String getGender();
    boolean getUSCitizenship();
    Date getDeadline();
}
