//ArrayDeque(queue interface)
import java.util.*;
public class xxx6 {
    public static void PriorityQueueEx(){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.addFirst(4);
        q.addFirst(5);
        q.addLast(7);
        q.addFirst(8);
        System.out.println(q);
        System.out.println(q.peekLast());
        System.out.println(q.peekFirst());
        q.removeFirst();
        System.out.println(q);
    }
    public static void main(String[] args) {
        PriorityQueueEx();
    }
}