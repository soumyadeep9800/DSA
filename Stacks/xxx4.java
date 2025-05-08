//display element using array and stack
import java.util.*;
public class xxx4 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(8);
        st.push(18);
        st.push(9);
        st.push(21);
       System.out.println(st);
        //using array
        int n=st.size();
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
      
    }
}
 //System.out.println(st);
        // Stack<Integer> rt=new Stack<>();
        // while (st.size()>0) {
        //     rt.push(st.pop());
        // }
        // while (rt.size()>0) {
        //     int x=rt.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }


          // System.out.println();
        // System.out.println(st);