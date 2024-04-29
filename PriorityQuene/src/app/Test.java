package app;

public class Test {
    public static void main(String[] args) {

        // Create an instance of PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        System.out.println("Queueing:");

        // Enqueueing tasks with random priorities
        for (int i = 0; i < 10; i++) {
            int priority = (int) (Math.random() * 100);
            String task = "Task With Priority " + priority;
            priorityQueue.enqueue(task, priority);
            System.out.println("Queued: " + task);
        }

        System.out.println("\nDe-Queueing:");
        
        // Dequeue and print tasks until the priority queue is empty
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.dequeue());
        }
    }
}
