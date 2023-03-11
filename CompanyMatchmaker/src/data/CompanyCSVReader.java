package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import domain.CompanyInfo;

public class CompanyCSVReader implements CSVReader<CompanyInfo> {

    private static final char CSV_DELIMITER = ',';
    private static final char CSV_QUOTE = '"';

    private List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null && !csvLine.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            boolean inQuotes = false;
            for (int i = 0; i < csvLine.length(); i++) {
                char c = csvLine.charAt(i);
                if (c == CSV_QUOTE) {
                    inQuotes = !inQuotes;
                } else if (c == CSV_DELIMITER && !inQuotes) {
                    result.add(sb.toString());
                    sb.setLength(0);
                } else {
                    sb.append(c);
                }
            }
            result.add(sb.toString());
        }
        return result;
    }

    @Override
    public LinkedList<CompanyInfo> readCSV(String filename) {
        LinkedList<CompanyInfo> companies = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine(); // Skip first line
            while ((line = br.readLine()) != null) {
                List<String> fields = parseCsvLine(line);
                String name = fields.get(0);
                LinkedList<String> majors = new LinkedList<>();
                majors.add(fields.get(1));
                Map<String, Integer> requirements = new HashMap<>();
                for (int i = 2; i <= 6; i++) {
                    String category = "Category" + (i - 1);
                    if (!fields.get(i).isEmpty()) {
                        int minimum = Integer.parseInt(fields.get(i));
                        requirements.put(category, minimum);
                    }
                    
                }
                String classStandingPreference = fields.get(7);
                CompanyInfo company = new CompanyInfo(name, majors, requirements, classStandingPreference);
                companies.add(company);
            }
        } catch (IOException e) {
            System.out.println("Error reading " + filename + ": " + e.getMessage());
            System.exit(1);
        }
        return companies;
    }
}
