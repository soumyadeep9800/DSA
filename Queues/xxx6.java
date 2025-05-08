// reverse a queue using stack , we can not solve using queue.
import java.util.*;
public class xxx6 {
    public static void main(String[] args) {
       Queue<Integer> q=new LinkedList<>();
       q.add(4); 
       q.add(7); 
       q.add(3); 
       q.add(0); 
       q.add(8);
       System.out.println(q);
       Stack<Integer> st=new Stack<>();
       while (q.size()>0) {
        st.push(q.remove());
       } 
       while (st.size()>0) {
        q.add(st.pop());
       }
       System.out.println(q);
    }
}
