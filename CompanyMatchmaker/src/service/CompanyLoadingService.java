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

    public LinkedList<CompanyInfo> getCompanies(String companyPath) {
        return csvReader.readCSV(companyPath);
    }

    public void updateCompanies(LinkedList<CompanyInfo> companies) {
        // Unimplemented: Update existing data with new data
        System.out.println("Update functionality not implemented.");
    }
}
