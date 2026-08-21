public class Main {
    public static void main(String[] args) {
        // Create a Lecturer object with the expected output values
        Lecturer lecturer = new Lecturer(
            "L100", 
            "Dr Ahmed", 
            "Java Programming", 
            "Faculty of Information Technology"
        );

        // Display all the collected details
        lecturer.displayInfo();
        lecturer.displaySubject();
    }
}