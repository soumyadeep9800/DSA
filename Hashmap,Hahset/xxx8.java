//largest subarray with 0 sum
import java.util.*;
public class xxx8 {
    public static int maxLengthOfSubArray(int arr[]){
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0, -1);
        int n=arr.length;
        int maxLength=0;
        int prefix=0;
        for(int i=0;i<n;i++){
            prefix+=arr[i];
            if(mp.containsKey(prefix)){
                maxLength=Math.max(maxLength, i-mp.get(prefix));
            }else{
                mp.put(prefix, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23}; 
        System.out.println(maxLengthOfSubArray(arr));
    }
}
