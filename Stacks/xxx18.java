//leetcode-84(largest rectangle in histogram)
import java.util.*;
public class xxx18 {
    public static int largestRectangleArea(int heights[]){
        int n=heights.length;
        Stack<Integer> st =new Stack<>();
        int nse[]=new int[n];
        int pse[]=new int[n];
        // calculate nse
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while (st.size()>0 && heights[st.peek()]>=heights[i])  {
                st.pop();
            }
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        //stack emptying
        while (st.size()>0) st.pop();
        //calculate pse
        st.push(0);
        pse[0]=-1;
        for(int i=1;i<n;i++){
            while (st.size()>0 && heights[st.peek()]>=heights[i])  {
                st.pop();
            }
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        //final ans calculate
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            max=Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
