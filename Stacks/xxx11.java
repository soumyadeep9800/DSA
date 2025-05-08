//given asequences of number . 
//remove all the consecutive subsequences of the length greter the or equal to 2 that contains same element
import java.util.Stack;
public class xxx11 {
    public static int[] remove(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if (st.size()==0 || st.peek()!=arr[i]) {
                st.push(arr[i]);
            }else if(st.peek()==arr[i]){
                if( i==n-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int res[]=new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,10,10,4,4,4,5,7,7,4,3,1,1,1};
        int res[]=remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
