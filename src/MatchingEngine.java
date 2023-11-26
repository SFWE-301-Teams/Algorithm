import java.util.ArrayList;

public class MatchingEngine {

    private Boolean checkApplicant(Applicant person) {
        Boolean empty = false;

        if (person.getCitizenship() == null) {
            empty = true;
        }
        else if (person.getEmail() == null) {
            empty = true;
        }
        else if (person.getGPA() == null) {
            empty = true;
        }
        else if (person.getMajor() == null) {
            empty = true;
        }
        else if (person.getName() == null) {
            empty = true;
        }
        else if (person.getStudentID() == null) {
            empty = true;
        }
        else if (person.getTransfer() == null) {
            empty = true;
        }
        else if (person.expGradDate() == null) {
            empty = true;
        }
        else if (person.getAcademicYear() == null) {
            empty = true;
        }
        else if (person.enrolledUnits() == null) {
            empty = true;
        }

        return empty;
    }

    private Boolean checkScholarship(Scholarship scholar) {
        Boolean empty = false;

        if (scholar.getCitizenship() == null) {
            empty = true;
        }
        else if (scholar.getQualities() == null) {
            empty = true;
        }
        else if (scholar.getGPA() == null) {
            empty = true;
        }
        else if (scholar.getScholarshipName() == null) {
            empty = true;
        }
        else if (scholar.getTransfer() == null) {
            empty = true;
        }
        else if (scholar.getExcpectedGradDate() == null) {
            empty = true;
        }
        else if (scholar.getEnrolledUnits() == null) {
            empty = true;
        }
        else if (scholar.getCitizenship() == null) {
            empty = true;
        }
        else if (scholar.getGender() == null) {
            empty = true;
        }
        else if (scholar.getPayout() == null) {
            empty = true;
        }
        else if (scholar.getDeadline() == null) {
            empty = true;
        }
        else if (scholar.getPreferedMajors() == null) {
            empty = true;
        }

        return empty;
    }
}