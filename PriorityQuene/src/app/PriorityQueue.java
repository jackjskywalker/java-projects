package app;

import java.util.LinkedList;

public class PriorityQueue<E> {

    // Create a linked list for tasks
    private LinkedList<E> tasks;
    // Create a linked list for priorities
    private LinkedList<Integer> priorities;

    // Constructor to initialize the task and priority lists
    public PriorityQueue() {
        tasks = new LinkedList<>();
        priorities = new LinkedList<>();
    }

    // Method to enqueue an item given a priority number
    public void enqueue(E item, int priority) {
        // Initialize an index
        int index = 0;
        // Find the correct index based on priority
        while (index < priorities.size() && priority >= priorities.get(index)) {
            index++;
        }
        // Insert item and priority at the determined index
        tasks.add(index, item);
        priorities.add(index, priority);
    }

    // Method to dequeue the item with the highest priority
    public E dequeue() {
        // Exception handling for if the queue is empty
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        } // Remove and return the last item from tasks
        return tasks.removeLast();
    }

    // Method to get the size of the priority queue
    public int size() {
        return tasks.size();
    }

    // Method to clear the priority queue
    public void clear() {
        tasks.clear();
        priorities.clear();
    }

    // Method to check if the priority queue is empty
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
