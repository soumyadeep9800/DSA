//reverse satack using recusrion
import java.util.Stack;
public class xxx7 {
    public static void reverse(Stack<Integer> st){
        if (st.size()==1) {
            return;
        }
        int x=st.pop();
        reverse(st);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size()>0) {
            st.push(rt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(8);
        st.push(18);
        st.push(9);
        st.push(21);
        System.out.print("orginal :"+st);
        System.out.println();
        reverse(st);
        System.out.print("reverse :"+st); 
    }
}
