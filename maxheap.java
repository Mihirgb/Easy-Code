import java.util.Collections;
import java.util.PriorityQueue;

public class maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        maxheap.add(2);
        maxheap.add(3);
        maxheap.add(4);

        System.out.println(maxheap);

    }
}
