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

    public LinkedList<RatingsInfo> getRatings(String ratingPath) {
        return csvReader.readCSV(ratingPath);
    }

    public void updateRatings(LinkedList<RatingsInfo> ratings) {
        // Unimplemented: Update existing data with new data
        System.out.println("Update functionality not implemented.");
    }
}

