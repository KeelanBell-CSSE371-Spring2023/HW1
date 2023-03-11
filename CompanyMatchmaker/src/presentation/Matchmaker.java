package presentation;

import domain.CompanyInfo;
// import domain.RatingsInfo;
import domain.StudentInfo;
import service.MatchmakingService;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Matchmaker {

    public static void main(String[] args) {
        System.out.println("Welcome to the Matchmaking App!");
        MatchmakingService matchmakingService = new MatchmakingService();

        LinkedList<CompanyInfo> companies = matchmakingService.getCompanies();
        LinkedList<StudentInfo> students = matchmakingService.getStudents();
        // LinkedList<RatingsInfo> ratings = matchmakingService.getRatings();

        compareStudentToCompany(companies, students);

    }

    private static void compareStudentToCompany(LinkedList<CompanyInfo> companies, LinkedList<StudentInfo> students) {
        // Match students to companies by major and year in school
        for (CompanyInfo company : companies) {
            String major = company.getMajors().get(0);
            String year = company.getClassStandingPref();
            System.out.println("Company: " + company.getName());
            boolean studentsMatched = false;
            Iterator<StudentInfo> iter = students.iterator();
            LinkedList<StudentInfo> matchedStudents = new LinkedList<>();
            while (iter.hasNext()) {
                StudentInfo student = iter.next();
                if (student.getMajor().equals(major) && student.getYear().equals(year)) {
                    System.out.println("  Student: " + student.getName() + " (" + student.getMajor() + ", " + student.getYear() + ")");
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
                            return s1.getYear().compareTo(s2.getYear());
                        }
                    });
                    // Match at most 5 students with the company
                    int matchedCount = 0;
                    for (StudentInfo student : otherYearStudents) {
                        if (matchedCount >= 5) {
                            break;
                        }
                        System.out.println("  Student: " + student.getName() + " (" + student.getMajor() + ", " + student.getYear() + ")");
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
