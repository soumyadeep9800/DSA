//implement stack using queues(leetcode-225)
//pop efficient
import java.util.*;
public class xxx7 {
    public static class queueSt {
        private Queue<Integer> q1=new LinkedList<>();
        public void push(int x){
           q1.add(x);
        }
        public int peek(){
            for(int i=0;i<q1.size()-1;i++){
                q1.add(q1.remove());
            }
            int x=q1.remove();
            q1.add(x);
            return x;
        }
        public int pop(){
            for(int i=0;i<q1.size()-1;i++){
                q1.add(q1.remove());
            }
            int x=q1.remove();
            return x;
        }
        public void display(){
            Queue<Integer> q2=new LinkedList<>();
            while (q1.size()>0) {
                System.out.print(q1.peek()+" ");
                q2.add(q1.remove());
            }
            while (q2.size()>0) {
                q1.add(q2.remove());
            }
            System.out.println();
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
