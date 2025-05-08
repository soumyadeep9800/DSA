//implement queue using stack
//push efficient
import java.util.*;

public class xxx9 {

    public static class stackq {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        public void add(int x) {
            st.push(x);
        }

        public int pop() {
            while (st.size() > 1) {
                temp.push(st.pop());
            }
            int x = st.pop();
            while (temp.size() > 0) {
                st.push(temp.pop());
            }
            return x;
        }

        public int peek() {
            while (st.size() > 1) {
                temp.push(st.pop());
            }
            int x = st.peek();
            while (temp.size() > 0) {
                st.push(temp.pop());
            }
            return x;
        }

        public void display() {
            while (st.size()>0) {
                temp.push(st.pop());
            }
            while (temp.size()>0) {
                System.out.print(temp.peek()+" ");
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