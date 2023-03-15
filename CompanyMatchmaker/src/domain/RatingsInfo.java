package domain;
import java.util.Map;

public class RatingsInfo {
    private String studentName;
    private Map<String, Integer> ratings;
    private String studentEmail;

    public RatingsInfo(String studentName, Map<String, Integer> ratings, String studentEmail) {
        this.studentName = studentName;
        this.ratings = ratings;
        this.studentEmail = studentEmail;
    }

    public String getStudentName() {
        return studentName;
    }
    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Map<String, Integer> getRatings() {
        return ratings;
    }

    public void setRatings(Map<String, Integer> ratings) {
        this.ratings = ratings;
    }
}
