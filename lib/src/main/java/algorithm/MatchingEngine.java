package algorithm;

import java.util.ArrayList;

public class MatchingEngine {
    /**
     * Returns a list of scholarship that match the provided user
     *
     * @param user           The user to match scholarships with
     * @param scholarships   All of the possible active scholarships that the user could match with
     */
    public static ArrayList<IScholarship> match(IApplicant applicant, ArrayList<IScholarship> scholarships) {
        return null;
    }

    /**
     * Checks whether all of the fields of an applicant contain valid data
     * @param  applicant  The applicant to check
     * @return           True if applicant is valid
     */
    static boolean validateApplicant(IApplicant applicant) {
        return !(
            applicant.getUSCitizenship() == null ||
            applicant.getGPA() == null ||
            applicant.getTransfer() == null ||
            applicant.getStatement() == null ||
            applicant.getMinors() == null ||
            applicant.getMajors() == null ||
            applicant.getInterests() == null ||
            applicant.getExpGradDate() == null ||
            applicant.getEnrolledUnits() == null ||
            applicant.getGender() == null ||
            applicant.getAcademicYear() == null
        );
    }
}
