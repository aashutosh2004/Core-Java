import java.util.LinkedList;
import java.util.Queue;

public class taskQueue {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();

        taskQueue.add("Download File");
        taskQueue.add("Process File");
        taskQueue.add("Upload File");
        System.out.println("Queue: " + taskQueue);

        System.out.println("\nPeeking at the first task:");
        String firstTask = taskQueue.peek();
        System.out.println("First task: " + firstTask);
        System.out.println("Queue after peek: " + taskQueue);
        
        System.out.println("\nProcessing the first task:");
        String processedTask = taskQueue.poll();
        System.out.println("Processed task: " + processedTask);
        System.out.println("Queue after processing: " + taskQueue);

        // Check if the queue is empty after each operation
        System.out.println("\nChecking if the queue is empty:");
        boolean isQueueEmpty = taskQueue.isEmpty();
        System.out.println("Is the queue empty? " + isQueueEmpty);

        // Process remaining tasks
        while (!taskQueue.isEmpty()) {
            System.out.println("\nProcessing next task:");
            String nextTask = taskQueue.poll();
            System.out.println("Processed task: " + nextTask);
            System.out.println("Queue after processing: " + taskQueue);
        }

        // Final check if the queue is empty
        System.out.println("\nFinal check if the queue is empty:");
        System.out.println("Is the queue empty? " + taskQueue.isEmpty());
    }
}
