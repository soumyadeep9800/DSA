//leetcode-239. sliding window maximum
//time complexity is O(k*n)
//next solution better
import java.util.*;
public class xxx30 {
    public static void main(String[] args) {
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int z=0;
        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max, nums[j]);
            }
            ans[z++]=max;
        }
        System.out.println("Final answer is: ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
