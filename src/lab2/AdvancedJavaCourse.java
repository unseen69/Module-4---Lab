package lab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse implements Course {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites = "Intro Java";

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.isBlank()) {
            throw new IllegalArgumentException("Course name is required");
        }
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.isBlank()) {
            throw new IllegalArgumentException("Course number is required");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Credits must be between 0.5 and 4.0");
        }
        this.credits = credits;
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.isBlank()) {
            throw new IllegalArgumentException("Prerequisites are required");
        }
        this.prerequisites = prerequisites;
    }

}
