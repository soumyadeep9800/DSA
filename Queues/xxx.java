import java.util.*;
public class xxx {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //Queue<Integer> d=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.remove());
        //q.poll();
        // System.out.println(q);
        // System.out.println(q.element());
        // System.out.println(q.peek());
    }
}