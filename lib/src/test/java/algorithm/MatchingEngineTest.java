/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package algorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;


// import org.junit.jupiter.api.MethodSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;


class MatchingEngineTest {
    private static final int NUM_SCHOLARSHIPS = 13;
    private static final int NUM_APPLICANTS = 13;

    private Scholarship[] scholarships;
    private Applicant[] applicants;

    MatchingEngineTest() throws Exception {
        scholarships = new Scholarship[NUM_SCHOLARSHIPS];
        applicants = new Applicant[NUM_APPLICANTS];

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            File file = new File(this.getClass().getClassLoader().getResource("ScholarshipTest.csv").toURI());
            Scanner scnr = new Scanner(file);
            String tempLine =  scnr.nextLine();
            int i = 0;

            while (scnr.hasNextLine()) {
                tempLine = scnr.nextLine();
                String[] inputs = tempLine.split(",");

                scholarships[i] = new Scholarship();
                scholarships[i].setName(inputs[0]);
                scholarships[i].setGPA(Double.valueOf(inputs[1]));
                scholarships[i].setMajor(inputs[2]);
                scholarships[i].setMinor(inputs[3]);
                scholarships[i].setTransfer(Boolean.parseBoolean(inputs[4]));
                scholarships[i].setGender(inputs[5]);
                scholarships[i].setUSCitizenship(Boolean.parseBoolean(inputs[6]));
                scholarships[i].setAcademicYear(inputs[7]);
                scholarships[i].setEnrolledUnits(Integer.parseInt(inputs[8]));
                scholarships[i].setExpGradDate(df.parse(inputs[9]));
                scholarships[i].setDescription(inputs[10]);
                scholarships[i].setAmount(Integer.valueOf(inputs[11]));
                scholarships[i].setDeadline(df.parse(inputs[12]));
                scholarships[i].setInterests(inputs[13]);

                ++i;
            }

            scnr.close();

        }
        catch (FileNotFoundException excpt) {
            System.out.println("Error: Scholarship File Not Found");
        }

        try {
            File file = new File(this.getClass().getClassLoader().getResource("StudentTest.csv").toURI());
            Scanner scnr = new Scanner(file);
            String tempLine = scnr.nextLine();
            int i = 0;

            while (scnr.hasNextLine()) {
                tempLine = scnr.nextLine();
                String[] inputs = tempLine.split(",");

                applicants[i] = new Applicant();
                applicants[i].setStudentID(inputs[0]);
                applicants[i].setGPA(Double.parseDouble(inputs[1]));
                applicants[i].setMajor(inputs[2]);
                applicants[i].setMinor(inputs[3]);
                applicants[i].setTransfer(Boolean.parseBoolean(inputs[4]));
                applicants[i].setGender(inputs[5]);
                applicants[i].setUSCitizenship(Boolean.parseBoolean(inputs[6]));
                applicants[i].setAcademicYear(inputs[7]);
                applicants[i].setEnrolledUnits(Integer.valueOf(inputs[8]));
                applicants[i].setExpGradDate(df.parse(inputs[9]));
                applicants[i].setStatement(inputs[10]);
                applicants[i].setInterests(inputs[11]);


                ++i;
            }

            scnr.close();
        }
        catch (FileNotFoundException excpt) {
            System.out.println("Error Student File Not Found");
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources="/expectedMatching.csv", numLinesToSkip=1)
    void testApplicant(int i, long expected_bitfield) {
        // Run matching algorithm
        ArrayList<Scholarship> matches = MatchingEngine.match(applicants[i], scholarships);
        // C-like int of flags showing which scholarships the matching algorithm spits out
        // 000010001001 -> the 1st, 4th, and 8th scholarships are matches
        long bitfield = 0;

        // Verifying matches are as expected
        for (Scholarship match : matches) {
            for (int j = 0; j < scholarships.length; j++) {
                if (match == scholarships[j]) {
                    // System.out.println(");
                    bitfield |= 1 << j;
                    break;
                }
            }
        }
        assertEquals(bitfield, expected_bitfield);
    }
}
