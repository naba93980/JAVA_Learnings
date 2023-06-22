package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        System.out.println(q.peek());

        // try {
        // int e = q.element();
        // System.out.println(e);
        // } catch (Exception e) {
        // System.out.println(e);
        // System.out.println("Bye");
        // System.exit(1);
        // }

        for (int i = 20; i <= 30; i++) {
            q.offer(i);
        }
        System.out.println(q);

 
        // once an element is removed, order is not guranteed, so we should use treesort if we are to maintain order
        System.out.println(q.poll());

        System.out.println(q);

        try {
        int e = q.remove();
        System.out.println(e);
        } catch (Exception e) {
        System.out.println(e);
        System.out.println("Bye");
        System.exit(1);
        }

        System.out.println(q);

    }
}
