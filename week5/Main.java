public class Main {
    public static void main(String[] args) {
        // Instantiate the Student object
        Student student = new Student();

        // Set values using setter methods
        student.setStudentID("CU12345");
        student.setName("Ali");
        student.setCGPA(3.75);
        student.setProgramme("BIT");

        // Display the details using getter methods
        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme  : " + student.getProgramme());
    }
}