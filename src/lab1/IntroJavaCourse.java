package lab1;

public class IntroJavaCourse extends Course {
    private String prerequisites = "Intro to Programming";

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.isBlank()) {
            throw new IllegalArgumentException("Prerequisites are required");
        }
        this.prerequisites = prerequisites;
    }
}