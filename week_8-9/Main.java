import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        // 1. Create an ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // --- ACTIVITY 1: Taking Input and Displaying ---
        System.out.println("====== ADD TASKS ======");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = scanner.nextLine();
            tasks.add(task); // Add task to ArrayList
        }
        
        System.out.println("\n====== TASK LIST ======");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        
        // --- ACTIVITY 2: File Handling (Saving and Loading) ---
        // 2.1 Saving all tasks into task.txt
        try {
            FileWriter writer = new FileWriter("task.txt");
            for (String task : tasks) {
                writer.write(task + "\n");
            }
            writer.close();
            System.out.println("\nTasks saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving tasks.");
            e.printStackTrace();
        }
        
        // 2.2 & 2.3 Reading contents from task.txt and displaying them
        System.out.println("\n====== TASKS LOADED FROM FILE ======");
        try {
            File file = new File("task.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("The task.txt file was not found.");
        }
        
        scanner.close();
    }
}