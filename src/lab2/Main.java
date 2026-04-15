package lab2;

public class Main {
    public static void main(String[] args) {
        // Good: using an interface lets the driver work with all course implementations uniformly.
        // Tradeoff: shared validation code is repeated in each class because interfaces do not hold instance fields.

        // Liskov is useful when we use the interface type (Course) for objects that support the same contract.
        // It is not possible to call subclass-only behavior through Course references without casting.
        Course c1 = new AdvancedJavaCourse("Advanced Java", "JAVA-301");
        Course c2 = new IntroJavaCourse("Intro Java", "JAVA-201");
        Course c3 = new IntroToProgrammingCourse("Intro Programming", "JAVA-101");

        setCourseData(c1, 3.0, "Intro Java");
        setCourseData(c2, 3.0, "Intro to Programming");
        setCourseData(c3, 3.0, null);

        printCourse(c1);
        printCourse(c2);
        printCourse(c3);
    }

    private static void setCourseData(Course course, double credits, String prerequisites) {
        try {
            course.setCredits(credits);
            course.setPrerequisites(prerequisites);
        } catch (IllegalArgumentException ex) {
            System.out.println("Input error for " + course.getCourseName() + ": " + ex.getMessage());
        }
    }

    private static void printCourse(Course course) {
        System.out.println(course.getCourseNumber() + " - " + course.getCourseName()
                + " | Credits: " + course.getCredits()
                + " | Prerequisites: " + course.getPrerequisites());
    }
}

