package CollectionsFramework;

import java.util.PriorityQueue;

public class PriorityQueueUseAddRemovePeek {
    public static void main(String[] args) {
        PriorityQueue<String> task = new PriorityQueue<>();

        task.offer("Exam");
        task.offer("Gaming");
        task.offer("Study");
        task.offer("Project");
        System.out.println("Tasks in PriorityQueue : " + task);

        System.out.println("Peek Task : " + task.peek());
        
        System.out.println("Removed Task : " + task.poll());

        System.out.println("After Removed : " + task);
    }
}
