//Priority Queue(queue interface)
import java.util.*;
public class xxx5 {
    public static void PriorityQueueEx(){
        //PriorityQueue<Integer> q=new PriorityQueue<>();//min q
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());//max q
        q.offer(150);
        q.offer(20);
        q.offer(13);
        q.offer(40);
        System.out.println(q);
        System.out.println(q.peek());//13- the smallest elt hast the highest priority
        q.poll();
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
    public static void main(String[] args) {
        PriorityQueueEx();
    }
}