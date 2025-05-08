//permutations
import java.util.ArrayList;
import java.util.List;
public class aaa7 {
    public static void helper(int arr[],List <Integer> ds,boolean isVisited[],List<List<Integer>> ans){
        if(ds.size()==arr.length){ //ans er modde ds dokabo but java te direct hoy na so ..ayvabe 
            // List <Integer> list=new ArrayList<>();
            // for(int i=0;i<ds.size();i++){
            //     list.add(ds.get(i));
            // }
            // ans.add(list);
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(isVisited[i]==false){
                ds.add(arr[i]);
                isVisited[i]=true;
                helper(arr, ds, isVisited, ans);
                isVisited[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public static List<List<Integer>> permute(int arr[]){
        List<List<Integer>> ans=new ArrayList<>();
        List <Integer> ds=new ArrayList<>();
        boolean isVisited[]=new boolean[arr.length];
        helper(arr,ds,isVisited,ans);
        return ans;
    }
        public static void main(String[] args) {
            int arr[]={1,2,3};
            List<List<Integer>> print=permute(arr);
            System.out.println(print);   
    }
}
