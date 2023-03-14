package service;

import java.util.LinkedList;

import data.RatingsCSVReader;
import domain.RatingsInfo;

public class RatingsLoadingService {

    private RatingsCSVReader csvReader;

    public RatingsLoadingService() {
        this.csvReader = new RatingsCSVReader();
    }

    public RatingsLoadingService(RatingsCSVReader csvReader) {
        this.csvReader = csvReader;
    }

    public LinkedList<RatingsInfo> getRatings() {
        return csvReader.readCSV("data/SMEs.csv");
    }
}

