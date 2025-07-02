public class Main {
    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course("Programming II", "SP1-25-INFT-223");
        Course course2 = new Course("Data Structures", "SP1-25-INFT-224");
        Course course3 = new Course("Database Systems", "SP1-25-INFT-225");

        // Create Student objects
        Student student1 = new Student("John", "Doe", 1234, "Computer Science");
        Student student2 = new Student("Jane", "Smith", 5678, "Information Technology");

        // Assign courses to students
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course2);
        student2.addCourse(course3);

        // Print student information
        System.out.println(student1);
        System.out.println(student2);
    }
}


//Explanation
//Person Class: This is the superclass that contains common attributes for both students and teachers.
//
//Student Class: Inherits from Person and includes a list of courses. It has methods to add courses and to return a formatted string representation.
//
//Teacher Class: Inherits from Person and includes an area of expertise. It overrides the toString() method to include this information.
//
//Course Class: Represents a course with a name and code, along with getters and a toString() method.
//
//Main Class: Demonstrates the functionality by creating instances of Student and Course, assigning courses to students, and printing their information.
//
//This implementation adheres to core object-oriented principles such as inheritance, encapsulation, and composition. You can further expand the functionality as needed.