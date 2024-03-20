
//priority queue adds elements in a way that the smallest element is in the top of the queue.
//It implements a min heap logic by which the heap arranges itself.
import java.util.PriorityQueue;

public class pque {
    public static void main(String[] args) {
        PriorityQueue p=new PriorityQueue<>();
        p.add(30);
        p.add(7);
        p.add(10);
        p.add(20);
        p.add(5);

        System.out.println(p);
        System.out.println(p.poll());

        System.out.println(p);
        System.out.println(p.poll());

        System.out.println(p);
        
    }
}
