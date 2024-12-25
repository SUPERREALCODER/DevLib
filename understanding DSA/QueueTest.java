import java.util.*;

public class QueueTest {

    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        System.out.println("Adding elements to the queue:");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        printQueue(queue);

        // Removing elements from the queue
        System.out.println("\nRemoving elements from the queue:");
        while (!queue.isEmpty()) {
            Integer removedElement = queue.poll(); // Remove the element from the front of the queue
            System.out.println("Removed: " + removedElement);
            printQueue(queue); // Print the queue after each removal
        }
    }

    // Function to print the current state of the queue
    public static void printQueue(Queue<Integer> queue) {
        System.out.print("Queue contents: ");
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
        System.out.println(); // New line for clarity
    }
}
