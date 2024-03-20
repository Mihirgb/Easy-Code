import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class heap {
    public static void main(String[] args) {
        // Creating a Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(50);
        minHeap.add(40);

        System.out.println("Min-Heap (smallest element at front):");
        while (!minHeap.isEmpty()) {
            int min = minHeap.poll();
            System.out.print(min + " ");
        }

        System.out.println(); // Newline

        // Creating a Max-Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(50);
        maxHeap.add(40);
        while (!maxHeap.isEmpty()) {
            int max = maxHeap.poll();
            System.out.print(max + " ");
        }
    }
}
