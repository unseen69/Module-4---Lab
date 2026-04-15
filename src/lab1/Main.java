package lab1;

public class Main {
    public static void main(String[] args) {

        // Good: common validation and shared fields live in Course, so subclasses stay small and focused.
        // Tradeoff: prerequisite rules vary by subclass, so behavior is split across classes.

        // Liskov substitution: declaring variables as Course lets us treat all course types uniformly
        // (set credits, print details) while still getting subtype-specific prerequisites.
        Course c1 = new AdvancedJavaCourse("Advanced Java", "JAVA-301");
        Course c2 = new IntroJavaCourse("Intro Java", "JAVA-201");
        Course c3 = new IntroToProgrammingCourse("Intro Programming", "JAVA-101");

        setCreditsSafely(c1, 3.0);
        setCreditsSafely(c2, 3.0);
        setCreditsSafely(c3, 3.0);

        printCourse(c1);
        printCourse(c2);
        printCourse(c3);
    }

    private static void setCreditsSafely(Course course, double credits) {
        try {
            course.setCredits(credits);
        } catch (IllegalArgumentException ex) {
            System.out.println("Unable to set credits for " + course.getCourseName() + ": " + ex.getMessage());
        }
    }

    private static void printCourse(Course course) {
        System.out.println(course.getCourseNumber() + " - " + course.getCourseName()
                + " | Credits: " + course.getCredits()
                + " | Prerequisites: " + course.getPrerequisites());
    }
}