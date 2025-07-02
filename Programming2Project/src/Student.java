import java.util.ArrayList;

public class Student extends Person {
    private String major;
    private ArrayList<Course> courses;

    public Student(String first, String last, int id, String major) {
        super(first, last, id);
        this.major = major;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

 
    @Override
    public String toString() {
        StringBuilder courseList = new StringBuilder();
        for (Course course : courses) {
            courseList.append(course.toString()).append(", "); // Append each course to the list
        }
        // Remove the last comma and space if there are courses
        if (courseList.length() > 0) {
            courseList.setLength(courseList.length() - 2);
        }
        return String.format("%s | Major: %s | Courses: %s", 
                             super.toString(), major, courseList.toString()); // Returns personal info, major, and courses
    }
}