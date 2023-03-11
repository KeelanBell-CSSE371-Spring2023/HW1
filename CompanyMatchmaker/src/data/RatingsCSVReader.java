package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import domain.RatingsInfo;

public class RatingsCSVReader implements CSVReader<RatingsInfo> {

    @Override
    public LinkedList<RatingsInfo> readCSV(String filename) {
        LinkedList<RatingsInfo> ratings = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String studentName = fields[0];
                Map<String, Integer> requirements = new HashMap<>();
                for (int i = 1; i < fields.length; i += 2) {
                    String category = fields[i];
                    int rating = Integer.parseInt(fields[i+1]);
                    requirements.put(category, rating);
                }
                RatingsInfo ratingInfo = new RatingsInfo(studentName, requirements);
                ratings.add(ratingInfo);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading " + filename + ": " + e.getMessage());
            System.exit(1);
        }
        return ratings;
    }
}

