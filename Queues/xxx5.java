//deque stl
import java.util.*;
public class xxx5 {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        // dq.addLast(1);
        // dq.addLast(2);
        // dq.addLast(3);
        // dq.addLast(4);
        // dq.addLast(5);
        // dq.addFirst(6);
        // System.out.println(dq);
        // dq.removeLast();
        // dq.removeFirst();
        // System.out.println(dq);
        // System.out.println(dq.getFirst());
        // System.out.println(dq.getLast());


        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addFirst(4);
        dq.addFirst(2);
        dq.addFirst(1);
        System.out.println(dq);
        // dq.removeAll(dq);  //remove all
        // System.out.println(dq);
        dq.removeFirstOccurrence(2);
        dq.removeLastOccurrence(1);
        System.out.println(dq);
    }
}
