import java.util.Map;

public class RatingsInfo {
    private String studentName;
    private Map<String, Integer> ratings;

    public RatingsInfo(String studentName, Map<String, Integer> ratings) {
        this.studentName = studentName;
        this.ratings = ratings;
    }

    public String getStudentName() {
        return studentName;
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
