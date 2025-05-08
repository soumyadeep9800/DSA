//Next gretter element using stack.
import java.util.Stack;
public class xxx15 {
    public static void main(String[] args) {
        int arr[]={1,5,3,2,1,6,3,4};
        int n=arr.length;
        int res[]=new int[n];
        res[n-1]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while (st.size()>0 && st.peek()<=arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("Final array is: ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
