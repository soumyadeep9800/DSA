//Linked list(queue interface)
import java.util.*;
public class xxx4 {
    public static void QueueEx(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
    public static void main(String[] args) {
        QueueEx();
    }
}