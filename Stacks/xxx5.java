//display using recursion normal and reverse. 
import java.util.*;
public class xxx5 {
    public static void Displayreverse(Stack<Integer> st){
        if (st.size()==0) {
            return;
        }
       int top=st.pop();
       System.out.print(top+" ");
       Displayreverse(st);
       st.push(top);
    }
    public static void Display(Stack<Integer> st){
        if (st.size()==0) {
            return;
        }
        int top=st.pop();
        Display(st);
        System.out.print(top+" ");
        st.push(top);
        
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(8);
        st.push(18);
        st.push(9);
        st.push(21);
        Display(st);
        System.out.println();
        Displayreverse(st);
        // System.out.println(st);
    }
}



