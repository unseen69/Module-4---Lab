package lab1;

/**
 * Abstract superclass for all courses.
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    public Course(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.isBlank()) {
            throw new IllegalArgumentException("Course name is required");
        }
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.isBlank()) {
            throw new IllegalArgumentException("Course number is required");
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Credits must be between 0.5 and 4.0");
        }
        this.credits = credits;
    }

    public abstract String getPrerequisites();
}