import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    private Scholarship[] scholarships;
    private student[] students;

    public Test() {

        scholarships = new Scholarship[50];
        students = new student[5];

        try {
            File file = new File("../ScholarshipTest.csv");
            Scanner scnr = new Scanner(file);
            int i = 0;

            while (scnr.hasNextLine()) {
                String tempLine = scnr.nextLine();
                String[] inputs = tempLine.split(",");
                
                // scholarships[i].setQualities(inputs[0]); // WEIRD
                scholarships[i].setGPA(Double.parseDouble(inputs[1]));
                scholarships[i].setMajor(inputs[2]);
                scholarships[i].setMinor(inputs[3]);
                scholarships[i].setTransfer(Boolean.parseBoolean(inputs[4]));
                scholarships[i].setExpectedGradDate(Integer.parseInt(inputs[5]));
                scholarships[i].setAcademicYear(inputs[6]);
                scholarships[i].setEnrolledUnits(Integer.parseInt(inputs[7]));
                scholarships[i].setGender(inputs[8]);
                scholarships[i].setCitizenship(Boolean.parseBoolean(inputs[9]));
                scholarships[i].setScholarshipName(inputs[10]);
                scholarships[i].setPayout(Integer.parseInt(inputs[11]));
                scholarships[i].setDeadline(inputs[12]);
                scholarships[i].setCustomRequiredInfo(inputs[13]);
                scholarships[i].setPreferedMajors(inputs[14]); // DELETE MAYBE?

                ++i;
            }

        }
        catch (FileNotFoundException excpt) {
            System.out.println("Error: Scholarship File Not Found");
        }

        try {
            File file = new File("../StudentTest.csv");
            Scanner scnr = new Scanner(file);
            int i = 0;

            while (scnr.hasNextLine()) {
                String tempLine = scnr.nextLine();
                String[] inputs = tempLine.split(",");

                students[i].setCitizenship(Boolean.parseBoolean(inputs[0]));
                students[i].setGender(inputs[1]);
                students[i].setStatement(inputs[2]);
                students[i].setStudentID(inputs[3]);
                // students[i].setInterests(inputs[4]);
                students[i].setGpa(Double.parseDouble(inputs[5]));
                students[i].setMajor(inputs[6]);
                students[i].setMinor(inputs[7]);
                students[i].setTransfer(Boolean.parseBoolean(inputs[8]));
                students[i].setExpectedGraduation(inputs[9]);
                students[i].setAcademicYear(inputs[10]);
                students[i].setUnitsEnrolled(Integer.parseInt(inputs[11]));

                ++i;
            }
        }
        catch (FileNotFoundException excpt) {
            System.out.println("Error Student File Not Found");
        }
    }

    public void test1() {

    }

    public void test2() {

    }
}
