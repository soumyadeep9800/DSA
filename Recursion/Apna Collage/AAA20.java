// check the element present in array or not
// 2nd part print index if not present print -1;
public class AAA20 {
    // public static boolean Search(int arr[],int n,int target,int indx){
    //    if (indx>=n) return false;

    //    if (arr[indx]==target) return true;

    //    return Search(arr, n, target, indx+1);
    // }
    public static int Search(int arr[],int n,int target,int indx){
        if (indx>=n) return -1;
 
        if (arr[indx]==target) return indx;
 
        return Search(arr, n, target, indx+1);
     }
    public static void main(String[] args) {
        int arr[]={5,4,8,5};
        int target=8;
        int n=arr.length;
        // if (Search(arr, n, target, 0)) {
        //     System.out.println("i found");
        // }else{
        //     System.out.println("NO BABY---->");
        // }
        System.out.println(Search(arr, n, target, 0));
    }
}
