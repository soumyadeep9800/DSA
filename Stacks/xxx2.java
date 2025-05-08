//copy stack to one to anothe stack in same order
import java.util.Stack;
public class xxx2 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(18);
        st.push(4);
        st.push(15);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
        }
        Stack<Integer> ft=new Stack<>();
        while (rt.size()>0) {
           ft.push(rt.pop()); 
        }
        System.out.println(ft);
    }
}
