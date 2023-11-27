package algorithm;

import java.util.ArrayList;
import java.util.Objects;

public class MatchingEngine {
    /**
     * Returns a list of scholarship that match the provided user
     *
     * @param user           The user to match scholarships with
     * @param scholarships   All of the possible active scholarships that the user could match with
     */
    public static <T extends IScholarship> ArrayList<T> match(IApplicant applicant, T[] scholarships) {
        if (!validateApplicant(applicant)) return null;

        ArrayList<T> matches = new ArrayList<>();

        for (T scholarship : scholarships) {
            if (checkCitizenship(applicant, scholarship) &&
                checkTransfer(applicant, scholarship) &&
                checkGPA(applicant, scholarship) &&
                checkMinor(applicant, scholarship) &&
                checkMajor(applicant, scholarship) &&
                checkExpGradDate(applicant, scholarship) &&
                checkEnrolledUnits(applicant, scholarship) &&
                checkGender(applicant, scholarship) &&
                checkAcademicYear(applicant, scholarship)) {
                matches.add(scholarship);
            }
        }
        return matches;
    }

    /**
     * Checks whether all of the fields of an applicant contain valid data
     * @param  applicant  The applicant to check
     * @return           True if applicant is valid
     */
    static boolean validateApplicant(IApplicant applicant) {
        return (
            (Objects.nonNull(applicant.getUSCitizenship())) &&
            (Objects.nonNull(applicant.getGPA())) &&
            (Objects.nonNull(applicant.getTransfer())) &&
            (Objects.nonNull(applicant.getStatement())) &&
            (Objects.nonNull(applicant.getMinors())) &&
            (Objects.nonNull(applicant.getMajors())) &&
            (Objects.nonNull(applicant.getInterests())) &&
            (Objects.nonNull(applicant.getExpGradDate())) &&
            (Objects.nonNull(applicant.getEnrolledUnits())) &&
            (Objects.nonNull(applicant.getGender())) &&
            (Objects.nonNull(applicant.getAcademicYear()))
        );
    }

    static <T extends IScholarship> boolean checkCitizenship(IApplicant a, T s) {
        return true;
    }
    static <T extends IScholarship>boolean checkTransfer(IApplicant a, T s) {
        return true;
    }
    static <T extends IScholarship>boolean checkGPA(IApplicant a, T s) {
        return true;
    }
    static <T extends IScholarship>boolean checkMinor(IApplicant a, T s) {
        return true;
    }
    static <T extends IScholarship>boolean checkMajor(IApplicant a, T s) {
        return true;
    }
    static <T extends IScholarship>boolean checkExpGradDate(IApplicant a, T s) {
        return true;
    }
    static <T extends IScholarship>boolean checkEnrolledUnits(IApplicant a, T s) {
        return true;
    }
    static <T extends IScholarship>boolean checkGender(IApplicant a, T s) {
        return true;
    }
    static <T extends IScholarship> boolean checkAcademicYear(IApplicant a, T s) {
        return true;
    }
}
