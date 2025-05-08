//reverse satack
import java.util.Stack;

public class xxx6 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(8);
        st.push(18);
        st.push(9);
        st.push(21);
        System.out.println(st);
        System.out.println(); 
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
        }
        Stack<Integer> gt=new Stack<>();
        while (rt.size()>0) {
            gt.push(rt.pop());
        }
        while (gt.size()>0) {
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
