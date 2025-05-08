//take stack input and reversely put another stack
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class xxx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        System.out.println("Eneter the element");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        //reverse order
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0) {
            // int x=st.peek();
            // rt.push(x);
            // st.pop();
            rt.push(st.pop());
        }
        System.out.println(rt);
    }
}
