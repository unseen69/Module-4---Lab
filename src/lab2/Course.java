package lab2;

/**
 * Common behavior contract for all course types in lab2.
 */
public interface Course {
    String getCourseName();

    void setCourseName(String courseName);

    String getCourseNumber();

    void setCourseNumber(String courseNumber);

    double getCredits();

    void setCredits(double credits);

    String getPrerequisites();

    void setPrerequisites(String prerequisites);
}

