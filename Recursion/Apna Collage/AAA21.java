// find all the indx wher target is there
public class AAA21 {
    public static void findIndex(int arr[],int n,int target,int indx){
        if(indx>=n) return;

        if (target==arr[indx]) System.out.println(indx);

        findIndex(arr, n, target, indx+1);
    }
    public static void main(String[] args) {
        int arr[]={5,4,8,5,4,4};
        int target=4;
        int n=arr.length;
        findIndex(arr, n, target, 0);
    }
}
