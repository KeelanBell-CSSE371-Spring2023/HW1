package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import domain.StudentInfo;

public class StudentCSVReader implements CSVReader<StudentInfo> {

    @Override
    public LinkedList<StudentInfo> readCSV(String filename) {
        LinkedList<StudentInfo> students = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine(); // Skip first line
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String firstName = fields[0];
                String lastName = fields[1];
                String major = fields[2];
                String yearCode = fields[3];
                String year;
                // At the time of implementing this, I didn't have time to ask the client for a new dataset.
                // Whoops #lessonslearned
                switch (yearCode) {
                    case "Y1":
                        year = "FR";
                        break;
                    case "Y2":
                        year = "SO";
                        break;
                    case "Y3":
                        year = "JR";
                        break;
                    default:
                        year = "SR";
                        break;
                }
                StudentInfo student = new StudentInfo(firstName, lastName, major, year);
                students.add(student);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading " + filename + ": " + e.getMessage());
            System.exit(1);
        }
        return students;
    }
}
