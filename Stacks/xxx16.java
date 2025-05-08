//Next previous element and gfg(stock span problem)
import java.util.*;
public class xxx16 {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        res[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0) {
                res[i]=i+1;
            }else{
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.print("final array: ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
