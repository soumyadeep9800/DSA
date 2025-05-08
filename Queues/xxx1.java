//print queue element
import java.util.*;
public class xxx1 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> h=new LinkedList<>();
        //Queue<Integer> d=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while (q.size()>0) {
            int x=q.remove();
            System.out.print(x+" ");
            h.add(x);
        }
        System.out.println();
        while (h.size()>0) {
            q.add(h.remove());
        }
        System.out.println(q);
    }
}
