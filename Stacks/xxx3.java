//insert element in any index
import java.util.*;
public class xxx3 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(8);
        st.push(18);
        st.push(9);
        st.push(21);
        System.out.println(st);
        int indx=4;
        int x=34;
        Stack<Integer> rt=new Stack<>();
        while (st.size()>indx) {
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size()>0) {
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
