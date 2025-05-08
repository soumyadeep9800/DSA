//implement queue using stack
//pop efficient
import java.util.*;

public class xxx10 {

    public static class stackq {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        public void add(int x) {
            if (st.size()==0) {
                st.push(x);
            }else{
                while (st.size()>0) {
                    temp.push(st.pop());
                }
                st.push(x);
                while (temp.size()>0) {
                    st.push(temp.pop());
                }
            }
        }
        public int pop() { 
            int x = st.pop();
            return x;
        }

        public int peek() {
            int x = st.peek();
            return x;
        }
        public void display() {
            while (st.size()>0) {
                System.out.print(st.peek()+" ");
                temp.push(st.pop());
            }
            while (temp.size()>0) {
                st.push(temp.pop());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stackq st=new stackq();
        st.add(1);
        st.add(5);
        st.add(3);
        st.add(7);
        st.add(9);
        st.display();
        st.pop();
        st.display();
    }
}