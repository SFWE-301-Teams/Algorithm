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
        if (!validateApplicant(applicant)) {
            System.out.println("Invalid applicant");
            return null;
        }

        ArrayList<T> matches = new ArrayList<>();

        for (T scholarship : scholarships) {
            if (!validateScholarship(scholarship)) {
                System.out.println("Invalid scholarship");
                continue;
            }
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
            (Objects.nonNull(applicant.getMinor())) &&
            (Objects.nonNull(applicant.getMajor())) &&
            // (Objects.nonNull(applicant.getInterests())) &&
            (Objects.nonNull(applicant.getExpGradDate())) &&
            (Objects.nonNull(applicant.getEnrolledUnits())) &&
            (Objects.nonNull(applicant.getGender())) &&
            (Objects.nonNull(applicant.getAcademicYear()))
        );
    }


    /**
     * Checks whether all of the fields of an scholarship contain valid data
     * @param  scholarship  The scholarship to check
     * @return           True if scholarship is valid
     */
    static boolean validateScholarship(IScholarship scholarship) {
        return (
            (Objects.nonNull(scholarship.getGPA())) &&
            (Objects.nonNull(scholarship.getTransfer())) &&
            (Objects.nonNull(scholarship.getMinor())) &&
            (Objects.nonNull(scholarship.getMajor())) &&
            (Objects.nonNull(scholarship.getDeadline())) &&
            (Objects.nonNull(scholarship.getExpGradDate())) &&
            (Objects.nonNull(scholarship.getEnrolledUnits())) &&
            (Objects.nonNull(scholarship.getGender())) &&
            (Objects.nonNull(scholarship.getUSCitizenship())) &&
            (Objects.nonNull(scholarship.getAcademicYear()))
        );
    }

    static <T extends IScholarship> boolean checkCitizenship(IApplicant a, T s) {
        return !s.getUSCitizenship() || a.getUSCitizenship();
    }
    static <T extends IScholarship>boolean checkTransfer(IApplicant a, T s) {
        return !s.getTransfer() || a.getTransfer();
    }
    static <T extends IScholarship>boolean checkGPA(IApplicant a, T s) {
        return a.getGPA() >= s.getGPA();
    }
    static <T extends IScholarship>boolean checkMinor(IApplicant a, T s) {
        if (s.getMinor().equalsIgnoreCase("none")) return true;
        return s.getMinor().equalsIgnoreCase(a.getMinor());
    }
    static <T extends IScholarship>boolean checkMajor(IApplicant a, T s) {
        if (s.getMajor().equalsIgnoreCase("none")) return true;
        return s.getMajor().equalsIgnoreCase(a.getMajor());
    }
    static <T extends IScholarship>boolean checkExpGradDate(IApplicant a, T s) {
        return !a.getExpGradDate().after(s.getExpGradDate());
    }
    static <T extends IScholarship>boolean checkEnrolledUnits(IApplicant a, T s) {
        return a.getEnrolledUnits() >= s.getEnrolledUnits();
    }
    static <T extends IScholarship>boolean checkGender(IApplicant a, T s) {
        if (s.getGender().equalsIgnoreCase("none")) return true;
        return s.getGender().equalsIgnoreCase(a.getGender());
    }
    static <T extends IScholarship> boolean checkAcademicYear(IApplicant a, T s) {
        if (s.getAcademicYear().equalsIgnoreCase("none")) return true;
        return s.getAcademicYear().equalsIgnoreCase(a.getAcademicYear());
    }
}
