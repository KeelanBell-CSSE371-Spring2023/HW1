package service;

import java.util.LinkedList;

import domain.CompanyInfo;
import domain.RatingsInfo;
import domain.StudentInfo;

public class MatchmakingService {

    private CompanyLoadingService companyService;
    private StudentLoadingService studentService;
    private RatingsLoadingService ratingsService;

    // Add instance variables to store the data
    private LinkedList<StudentInfo> students;
    private LinkedList<CompanyInfo> companies;
    private LinkedList<RatingsInfo> ratings;

    public MatchmakingService() {
        this.companyService = new CompanyLoadingService();
        this.studentService = new StudentLoadingService();
        this.ratingsService = new RatingsLoadingService();
    }
    public MatchmakingService(CompanyLoadingService companyService, StudentLoadingService studentService, RatingsLoadingService ratingsService) {
        this.companyService = companyService;
        this.studentService = studentService;
        this.ratingsService = ratingsService;
    }

    public void uploadData(String studentPath, String companyPath, String ratingPath) {
        // Load data from files using modified loading services
        students = studentService.getStudents(studentPath);
        companies = companyService.getCompanies(companyPath);
        ratings = ratingsService.getRatings(ratingPath);
    
        // Update existing data with new data
        // Not implemented, not needed for proof of concept.
        // studentService.updateStudents(students);
        // companyService.updateCompanies(companies);
        // ratingsService.updateRatings(ratings);
    }
    
    // Add getter methods for the data
    public LinkedList<StudentInfo> getStudents() {
        return students;
    }

    public LinkedList<CompanyInfo> getCompanies() {
        return companies;
    }

    public LinkedList<RatingsInfo> getRatings() {
        return ratings;
    }

}

