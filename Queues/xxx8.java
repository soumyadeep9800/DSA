//implement stack using queues(leetcode-225)
//push efficient
import java.util.*;
public class xxx8 {
    public static class queueSt {
        private Queue<Integer> q1=new LinkedList<>();
        public void push(int x){
            if (q1.size()==0) {
                q1.add(x);
            }else{
                q1.add(x);
                for(int i=0;i<q1.size()-1;i++){
                    q1.add(q1.remove());
                }
            }
        }
        public int peek(){
            return q1.peek();
        }
        public int pop(){
           return q1.remove();
        }
        public void display(){
            Queue<Integer> temp=new LinkedList<>();
            // Stack<Integer> st1=new Stack<>();
            // while (q1.size()>0) {
            //     st.push(q1.remove());
            // }
            // while (st.size()>0) {
            //     System.out.print(st.peek()+" ");
            //     st1.push(st.pop());
            // }
            // while (st1.size()>0) {
            //     q1.add(st.pop());
            // }
            // int size=q1.size();
            // for(int i=0;i<size;i++){
            //     System.out.println();
            // }

            // System.out.println();
        }
    }

    public static void main(String[] args) {
        queueSt q=new queueSt();
        q.push(5);
        q.push(3);
        q.push(9);
        q.push(3);
        q.push(8);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.pop());
    }
}
