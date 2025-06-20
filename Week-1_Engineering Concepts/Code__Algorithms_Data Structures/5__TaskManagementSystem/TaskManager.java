import java.util.Scanner;

public class TaskManager {
    private TaskNode head = null;
    private Scanner sc = new Scanner(System.in);

    
    public void addTask() {
        System.out.print("Enter Task ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Status: ");
        String status = sc.nextLine();

        Task newTask = new Task(id, name, status);
        TaskNode newNode = new TaskNode(newTask);

        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added successfully.");
    }

    
    public void searchTask() {
        System.out.print("Enter Task ID to search: ");
        int id = sc.nextInt();

        TaskNode temp = head;
        while (temp != null) {
            if (temp.task.taskId == id) {
                temp.task.display();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found.");
    }

    
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        while (temp != null) {
            temp.task.display();
            temp = temp.next;
        }
    }

   
    public void deleteTask() {
        System.out.print("Enter Task ID to delete: ");
        int id = sc.nextInt();

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        TaskNode prev = head;
        TaskNode curr = head.next;

        while (curr != null) {
            if (curr.task.taskId == id) {
                prev.next = curr.next;
                System.out.println("Task deleted.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Task not found.");
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n== Task Management System ==");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> manager.addTask();
                case 2 -> manager.searchTask();
                case 3 -> manager.displayTasks();
                case 4 -> manager.deleteTask();
                case 5 -> System.out.println("Exiting.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}

   