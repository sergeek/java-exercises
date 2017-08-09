package exercises.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    private double totalQualityScore;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        numberOfCredits += courseCredits;

        double qualityScore = courseCredits * grade;
        totalQualityScore += qualityScore;
        //totalQualityScore = gpa * numberOfCredits;

        this.gpa = totalQualityScore / numberOfCredits;

    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on the number of credits
        String gradeLevel;

        if (numberOfCredits < 30){
            gradeLevel = "Freshman";
        } else if (numberOfCredits < 60) {
            gradeLevel = "Sophomore";
        } else if (numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else if (numberOfCredits >= 90) {
            gradeLevel = "Senior";
        } else {
            gradeLevel = "None";
        }

        return gradeLevel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    public String toString() {
        return "\nStudent name: " + name + "\n" +
                "Student Id: " + studentId  +"\n" +
                "numberOfCredits: " + numberOfCredits + "\n" +
                "GPA: " + gpa;
    }
}
