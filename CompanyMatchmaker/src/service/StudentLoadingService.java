package service;

import java.util.LinkedList;

import data.StudentCSVReader;
import domain.StudentInfo;

public class StudentLoadingService {

    private StudentCSVReader csvReader;

    public StudentLoadingService() {
        this.csvReader = new StudentCSVReader();
    }

    public StudentLoadingService(StudentCSVReader csvReader) {
        this.csvReader = csvReader;
    }

    public LinkedList<StudentInfo> getStudents(String studentPath) {
        return csvReader.readCSV(studentPath);
    }

    public void updateStudents(LinkedList<StudentInfo> students) {
        // TODO: Update existing data with new data
        System.out.println("Update functionality not implemented.");

    }
}
