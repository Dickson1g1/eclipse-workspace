import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static TaskList taskList = new TaskList();
    private static final String FILE_NAME = "C:\\Users\\bdick\\eclipse-workspace\\Project1\\tasks.csv";

    public static void main(String[] args) {
        loadTasks();
        Scanner inp = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. View Tasks by Status");
            System.out.println("4. View Tasks by Priority");
            System.out.println("5. Remove Task");
            System.out.println("6. Save Tasks");
            System.out.println("7. Load Tasks");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();
            inp.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask(inp);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    viewTasksByStatus(inp);
                    break;
                case 4:
                    viewTasksByPriority(inp);
                    break;
                case 5:
                    removeTask(inp);
                    break;
                case 6:
                    saveTasks();
                    break;
                case 7:
                    loadTasks();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.out.print("Thank you for using. ");      
                    inp.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again by choosing one of the options.");
            }
        } 
    }

    private static void addTask(Scanner inp) {
        System.out.print("Enter task title: ");
        String title = inp.nextLine();
        System.out.print("Enter task status (PEND/DONE): ");
        String status = inp.nextLine();
        System.out.print("Enter task priority (LOW/MED/HIGH/CRIT): ");
        String priority = inp.nextLine();
        Task task = new Task(title, status, priority);
        taskList.addTask(task);
        System.out.println("Task added successfully.");
    }

    private static void viewTasks() {
        ArrayList<Task> tasks = taskList.getTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private static void viewTasksByStatus(Scanner inp) {
        System.out.print("Enter status to filter (PEND/DONE): ");
        String status = inp.nextLine();
        ArrayList<Task> tasks = taskList.getTasksByStatus(status);
        if (tasks.isEmpty()) {
            System.out.println("No tasks found with status: " + status);
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private static void viewTasksByPriority(Scanner inp) {
        System.out.print("Enter priority to filter (LOW/MED/HIGH/CRIT): ");
        String priority = inp.nextLine();
        ArrayList<Task> tasks = taskList.getTasksByPriority(priority);
        if (tasks.isEmpty()) {
            System.out.println("No tasks found with priority: " + priority);
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private static void removeTask(Scanner inp) {
        System.out.print("Enter task title to remove: ");
        String title = inp.nextLine();
        taskList.removeTask(title);
        System.out.println("Task removed successfully.");
    }

    private static void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : taskList.getTasks()) {
                writer.write(task.toString());
                writer.newLine();
            }
            System.out.println("Tasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    private static void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Task task = new Task(parts[1], parts[2], parts[3]);
                    taskList.addTask(task);
                }
            }
            System.out.println("Tasks loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }
}