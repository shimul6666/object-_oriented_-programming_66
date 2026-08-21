public class Lecturer extends Employee {
    private String subject;
    private String department; // Added variable from Activity 2.1

    // Constructor
    public Lecturer(String id, String name, String subject, String department) {
        super(id, name); // Calls the parent constructor from Employee
        this.subject = subject;
        this.department = department;
    }

    // Method to display lecturer specific info
    public void displaySubject() {
        System.out.println("Subject     : " + subject);
        System.out.println("Department  : " + department);
    }
}