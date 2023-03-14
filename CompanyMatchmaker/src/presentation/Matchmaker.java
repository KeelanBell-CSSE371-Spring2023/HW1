package presentation;

import domain.CompanyInfo;
// import domain.RatingsInfo;
import domain.StudentInfo;
import service.MatchmakingService;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Matchmaker {

    public static void main(String[] args) {
        System.out.println("Welcome to the Matchmaking App!");
        System.out.println("How can I help you today?");
        System.out.println(" - (M)atch Companies\n - (U)pload matchmaking data\n - (Q)uit the program");
        MatchmakingService matchmakingService = new MatchmakingService();

        LinkedList<CompanyInfo> companies = matchmakingService.getCompanies();
        LinkedList<StudentInfo> students = matchmakingService.getStudents();
        // LinkedList<RatingsInfo> ratings = matchmakingService.getRatings();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine().toUpperCase();
                if (input.equals("M")) {
                    // TODO: Implement comparison here, as well if checking if all necessary CSVs are uploaded.
                    compareStudentToCompany(companies, students);
                } else if (input.equals("U")) {
                    // TODO: Code to upload matchmaking data goes here. Unimplemented.
                    System.out.println("Functionality to upload data is not yet implemented.");
                } else if (input.equals("Q")) {
                    System.out.println("Goodbye!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }

    }

    private static void compareStudentToCompany(LinkedList<CompanyInfo> companies, LinkedList<StudentInfo> students) {
        // Match students to companies by major and year in school
        for (CompanyInfo company : companies) {
            String major = company.getMajors().get(0);
            String classStanding = company.getClassStandingPref();
            System.out.println("Company: " + company.getName());
            boolean studentsMatched = false;
            Iterator<StudentInfo> iter = students.iterator();
            LinkedList<StudentInfo> matchedStudents = new LinkedList<>();
            while (iter.hasNext()) {
                StudentInfo student = iter.next();
                if (student.getMajor().equals(major) && student.getStanding().equals(classStanding)) {
                    System.out.println("  Student: " + student.getName() + " (" + student.getMajor() + ", " + student.getStanding() + ")");
                    iter.remove();
                    matchedStudents.add(student);
                    if (matchedStudents.size() >= 5) {
                        studentsMatched = true;
                        break;
                    }
                }
            }
            if (!matchedStudents.isEmpty()) {
                studentsMatched = true;
                // Process matched students
                processMatchedStudents(company, matchedStudents);
            }
            if (!studentsMatched) {
                // Look for students with the same major and a different year
                LinkedList<StudentInfo> otherYearStudents = new LinkedList<>();
                iter = students.iterator();
                while (iter.hasNext()) {
                    StudentInfo student = iter.next();
                    if (student.getMajor().equals(major)) {
                        otherYearStudents.add(student);
                    }
                }
                if (!otherYearStudents.isEmpty()) {
                    System.out.println("  No students available for this year, looking for other years...");
                    // Sort the otherYearStudents by year (freshman, sophomore, junior, senior)
                    Collections.sort(otherYearStudents, new Comparator<StudentInfo>() {
                        @Override
                        public int compare(StudentInfo s1, StudentInfo s2) {
                            return s1.getStanding().compareTo(s2.getStanding());
                        }
                    });
                    // Match at most 5 students with the company
                    int matchedCount = 0;
                    for (StudentInfo student : otherYearStudents) {
                        if (matchedCount >= 5) {
                            break;
                        }
                        System.out.println("  Student: " + student.getName() + " (" + student.getMajor() + ", " + student.getStanding() + ")");
                        matchedCount++;
                        matchedStudents.add(student);
                    }
                    // Process matched students
                    if (!matchedStudents.isEmpty()) {
                        studentsMatched = true;
                        processMatchedStudents(company, matchedStudents);
                    }
                }
                if (!studentsMatched) {
                    System.out.println("  No students available for this major and year.");
                }
            }
        }
    }
    
    private static void processMatchedStudents(CompanyInfo company, LinkedList<StudentInfo> students) {
        // Do something with the matched students (e.g., interview them)
        System.out.println("  Interviewing " + students.size() + " students for " + company.getName() + "...");
    }
            
}
