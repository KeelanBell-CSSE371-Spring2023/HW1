import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Matchmaker {

    public static void main(String[] args) {
        LinkedList<CompanyInfo> companies = readCompanyCSV("companies.csv");
        // TODO: Do something with the list of companies

        LinkedList<StudentInfo> students = readStudentCSV("students.csv");
        // TODO: Do something with the list of students

        LinkedList<RatingsInfo> ratings = readRatingsCSV("ratings.csv");
        // TODO: Do something with the list of ratings
    }

    public static LinkedList<CompanyInfo> readCompanyCSV(String filename) {
        LinkedList<CompanyInfo> companies = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                LinkedList<String> majors = new LinkedList<>();
                for (String major : fields[1].split(";")) {
                    majors.add(major);
                }
                Map<String, Integer> requirements = new HashMap<>();
                for (int i = 2; i < fields.length; i += 2) {
                    String category = fields[i];
                    int minimum = Integer.parseInt(fields[i+1]);
                    requirements.put(category, minimum);
                }
                CompanyInfo company = new CompanyInfo(name, majors, requirements);
                companies.add(company);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading " + filename + ": " + e.getMessage());
            System.exit(1);
        }
        return companies;
    }

    public static LinkedList<StudentInfo> readStudentCSV(String filename) {
        LinkedList<StudentInfo> students = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String major = fields[1];
                String year = fields[2];
                StudentInfo student = new StudentInfo(name, major, year);
                students.add(student);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading " + filename + ": " + e.getMessage());
            System.exit(1);
        }
        return students;
    }

    public static LinkedList<RatingsInfo> readRatingsCSV(String filename) {
        LinkedList<RatingsInfo> ratings = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String studentName = fields[0];
                Map<String, Integer> ratingsMap = new HashMap<>();
                for (int i = 1; i < fields.length; i += 2) {
                    String category = fields[i];
                    int rating = Integer.parseInt(fields[i+1]);
                    ratingsMap.put(category, rating);
                }
                RatingsInfo rating = new RatingsInfo(studentName, ratingsMap);
                ratings.add(rating);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading " + filename + ": " + e.getMessage());
            System.exit(1);
        }
        return ratings;
    }
}
