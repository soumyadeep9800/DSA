
import java.util.*;
public class xxx11 {
    public static int maxnumberOnTable(int arr[]){
        HashSet<Integer> ht=new HashSet<>();
        int maxLength=0;
        for(int num:arr){
            if (ht.contains(num)) {
                ht.remove(num);
            }else{
                ht.add(num);
                maxLength=Math.max(maxLength, ht.size());
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={2,1,1,3,2,3};
        System.out.println(maxnumberOnTable(arr));
    }
}
