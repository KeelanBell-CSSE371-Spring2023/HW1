package domain;

import java.util.Map;

// Define a class to hold student info and their 5 ratings
public class StudentRatingsInfo {
    private StudentInfo student;
    private int[] ratings;

    public StudentRatingsInfo(StudentInfo student,  Map<String, Integer> newRatings) {
        this.student = student;
        this.ratings = addRatings(newRatings);
    }

    public String getEmail() {
        return student.getEmail();
    }

    public int[] getRatings() {
        return ratings;
    }

    public int[] addRatings(Map<String, Integer> newRatings) {
        for (Map.Entry<String, Integer> entry : newRatings.entrySet()) {
            String ratingType = entry.getKey();
            int ratingValue = entry.getValue();
            for (int i = 0; i < 5; i++) {
                String category = "Category " + (i + 1);
                if (ratingType.equals(category)) {
                    ratings[i] = ratingValue;
                }
            }
        } 
        return ratings;       
    }

    public boolean compareRatings(Map<String, Integer> companyRatings) {
        for (Map.Entry<String, Integer> entry : companyRatings.entrySet()) {
            String category = entry.getKey();
            int companyRating = entry.getValue();
            for (int i = 0; i < 5; i++) {
                String studentCategory = "Category " + (i + 1);
                if (category.equals(studentCategory)) {
                    int studentRating = ratings[i];
                    if (studentRating < companyRating) {
                        return false;
                    }
                }
            }
        }
        return true;
    }  
}