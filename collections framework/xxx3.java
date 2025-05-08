//Stack(list interface)
import java.util.*;
public class xxx3 {
    public static void StackEx(){
        Stack<String> st=new Stack<>();
        st.push("pw");
        st.push("soumya");
        st.push("hjdc");
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
    public static void main(String[] args) {
        StackEx();
    }
}