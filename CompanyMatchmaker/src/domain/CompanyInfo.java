package domain;
import java.util.List;
import java.util.Map;

public class CompanyInfo {

    private String name;
    private List<String> majors;
    private Map<String, Integer> minimumRequirements;
    private String classStandingPreference;

    public CompanyInfo(String name, List<String> majors, Map<String, Integer> minimumRequirements, String classStandingPreference) {
        this.name = name;
        this.majors = majors;
        this.minimumRequirements = minimumRequirements;
        this.classStandingPreference = classStandingPreference;
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

    public String getClassStandingPref() {
        return classStandingPreference;
    }

    public String getYear() {
        return null;
    }
}
