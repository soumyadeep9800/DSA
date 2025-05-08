// using arraylist find target index number in arraylist form.
import java.util.ArrayList;
public class AAA22 {
    static ArrayList<Integer> allIndicies(int arr[],int target,int n,int indx){
         ArrayList<Integer> ans=new ArrayList<>();
         //base case
         if (indx>=n) return ans;
         //self-wark
         if(arr[indx]==target){
            ans.add(indx);
         }
         //recrsive work
         ArrayList<Integer> smallans=allIndicies(arr, target, n, indx+1);
         ans.addAll(smallans);
         return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,4,4,};
        int target=4;
        int n=arr.length;

        ArrayList<Integer> ans=allIndicies(arr, target, n, 0);
        System.out.println(ans);
    }
}
