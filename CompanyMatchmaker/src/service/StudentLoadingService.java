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

    public LinkedList<StudentInfo> getStudents() {
        return csvReader.readCSV("Students.csv");
    }
}
