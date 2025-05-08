//reorder queue using stack GFG
import java.util.*;
public class xxx12 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int x=q.size()/2;
        for(int i=0;i<x;i++){
            st.push(q.remove());
        }
        for(int i=0;i<x;i++){
            q.add(st.pop());
        }
        for(int i=0;i<x;i++){
            st.push(q.remove());
        }
        for(int i=0;i<x;i++){
            q.add(st.pop());
            q.add(q.remove());
        }
        while (q.size()>0) {
            st.push(q.remove());
        }
        while (st.size()>0) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
