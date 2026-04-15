package lab1;

public class IntroToProgrammingCourse extends Course {

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    @Override
    public String getPrerequisites() {
        return "None";
    }
}