package service;

import java.util.LinkedList;

import domain.CompanyInfo;
import domain.RatingsInfo;
import domain.StudentInfo;

public class MatchmakingService {

    private CompanyLoadingService companyService;
    private StudentLoadingService studentService;
    private RatingsLoadingService ratingsService;

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

    public LinkedList<CompanyInfo> getCompanies() {
        return companyService.getCompanies();
    }

    public LinkedList<StudentInfo> getStudents() {
        return studentService.getStudents();
    }

    public LinkedList<RatingsInfo> getRatings() {
        return ratingsService.getRatings();
    }
}

