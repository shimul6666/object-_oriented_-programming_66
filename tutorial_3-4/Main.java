public class Main {
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("EXPECTED OUTPUT");
        System.out.println("=====================");

        Person p0 = new Person("John Doe", "P001");
        Person p1 = new Student("Alice", "S123");
        Person p2 = new Lecturer("Bob", "L456");

        p0.introduce();
        p1.introduce();
        p2.introduce();
    }
}