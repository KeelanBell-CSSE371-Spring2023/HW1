package service;

import java.util.LinkedList;

import data.CompanyCSVReader;
import domain.CompanyInfo;

public class CompanyLoadingService {

    private CompanyCSVReader csvReader;

    public CompanyLoadingService() {
        this.csvReader = new CompanyCSVReader();
    }

    public CompanyLoadingService(CompanyCSVReader csvReader) {
        this.csvReader = csvReader;
    }

    public LinkedList<CompanyInfo> getCompanies() {
        return csvReader.readCSV("CompaniesWithStanding.csv");
    }
}
