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
            String line = br.readLine(); // Skips first line
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String firstName = fields[0];
                String lastName = fields[1];
                Map<String, Integer> requirements = new HashMap<>();
                for (int i = 2; i < fields.length - 1; i++) {
                    if(!fields[i].isEmpty()) {
                        int rating = Integer.parseInt(fields[i]);
                        String category = "Category" + (i - 1);
                        requirements.put(category, rating);
                    }
                    else {
                        int rating = 1; 
                        String category = "Category" + (i - 1);
                        requirements.put(category, rating);
                    }
                }
                String email = fields[fields.length - 1];
                RatingsInfo ratingInfo = new RatingsInfo(firstName + " " + lastName, requirements, email);
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
