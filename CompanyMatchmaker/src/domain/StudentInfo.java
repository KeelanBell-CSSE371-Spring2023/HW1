package domain;
public class StudentInfo {
    private String firstName;
    private String lastName;
    private String major;
    private String year;
    private String classStanding;
    private String email;

    public StudentInfo(String firstName, String lastName, String major, String year, String classStanding, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.classStanding = classStanding;
        this.email = email;
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

    public String getStanding() {
        return classStanding;
    }

    public String getEmail() {
        return email;
    }

}
