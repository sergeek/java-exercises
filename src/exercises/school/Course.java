package exercises.school;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private int courseId;
    private ArrayList<Student> students = new ArrayList<>();
    private double creditsPerCourse;


    public Course(String courseName, ArrayList<Student> students) {
        this.courseName = courseName;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }

    public double getCreditsPerCourse() {
        return creditsPerCourse;
    }

    public void setCreditsPerCourse(double creditsPerCourse) {
        this.creditsPerCourse = creditsPerCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return courseId == course.courseId;
    }

    @Override
    public int hashCode() {
        return courseId;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + "\n" +
                "Students: \n" + students;
    }
}
