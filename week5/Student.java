public class Student {
    // Private variables to prevent direct access
    private String studentID;
    private String name;
    private double cgpa;
    private String programme; // Added from Activity 3

    // Setter for Student ID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Setter for Programme (Activity 3)
    public void setProgramme(String programme) {
        this.programme = programme;
    }

    // Getter for Student ID
    public String getStudentID() {
        return this.studentID;
    }

    // Getter for Name
    public String getName() {
        return this.name;
    }

    // Getter for CGPA
    public double getCGPA() {
        return this.cgpa;
    }

    // Getter for Programme (Activity 3)
    public String getProgramme() {
        return this.programme;
    }
}