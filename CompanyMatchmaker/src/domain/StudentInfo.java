package domain;
public class StudentInfo {
    private String firstName;
    private String lastName;
    private String major;
    private String year;

    public StudentInfo(String firstName, String lastName, String major, String year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getYear() {
        return year;
    }

}
