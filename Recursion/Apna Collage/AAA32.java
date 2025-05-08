//frog jump
public class AAA32 {
    public static int best(int arr[],int n,int indx){
        if (indx==n-1) return 0;
        int opt1=best(arr, n, indx+1)+Math.abs(arr[indx+1]-arr[indx]);
        if(indx==n-2) return opt1;
        int opt2=best(arr, n, indx+2)+Math.abs(arr[indx+2]-arr[indx]);
        return Math.min(opt1, opt2);
        }
    public static void main(String[] args) {
        int arr[]={10,30,40,20};
        System.out.println(best(arr, arr.length, 0));
    }
}
