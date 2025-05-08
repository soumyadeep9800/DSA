//Next greter element using stack (Method-2)
import java.util.Stack;
public class xxx17 {
    public static void main(String[] args) {
        int arr[]={1,5,3,2,1,6,3,4};
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        for(int i=0;i<n;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                res[st.peek()]=arr[i];
                st.pop();
            }
                st.push(i);
        }

        System.out.print("Final array is: ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
