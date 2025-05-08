//permutations
import java.util.ArrayList;
import java.util.List;
public class aaa8{
    public static void helper(int arr[],int idx,List<List<Integer>> ans){
        if(idx==arr.length-1){
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ll.add(arr[i]);
            }
            ans.add(ll);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            helper(arr, idx+1, ans);
            swap(i,idx,arr);
        }
    }
    public static void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static List<List<Integer>> permute(int arr[]){
        int idx=0;
        List<List<Integer>> ans=new ArrayList<>();
        helper(arr,idx,ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> print=permute(arr);
        System.out.println(print);   
    }
}
