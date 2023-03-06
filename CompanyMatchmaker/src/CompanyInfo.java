import java.util.List;
import java.util.Map;

public class CompanyInfo {

    private String name;
    private List<String> majors;
    private Map<String, Integer> minimumRequirements;

    public CompanyInfo(String name, List<String> majors, Map<String, Integer> minimumRequirements) {
        this.name = name;
        this.majors = majors;
        this.minimumRequirements = minimumRequirements;
    }

    public String getName() {
        return name;
    }

    public List<String> getMajors() {
        return majors;
    }

    public Map<String, Integer> getMinimumRequirements() {
        return minimumRequirements;
    }
}
