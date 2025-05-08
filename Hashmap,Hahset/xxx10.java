//longestconsecutive in array
import java.util.*;
public class xxx10 {
    public static int longestConsecutive(int arr[]){
        HashSet<Integer> ht=new HashSet<>();
        for(int i:arr){
            ht.add(i);
        }
        int maxLength=0;
        for(int num:ht){
            if (!ht.contains(num-1)) {//num not starting point of sequences
                int currnum=num;
                int currlength=1;
                while (ht.contains(currnum+1)) {
                    currlength++;
                    currnum++;
                }
                maxLength=Math.max(maxLength, currlength);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={100,2,200,1,4,3};
        System.out.println(longestConsecutive(arr));
    }
}
