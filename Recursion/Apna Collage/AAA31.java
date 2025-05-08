//sub-set sum of array.
public class AAA31 {
    static void subSetSum(int arr[],int n,int indx,int sum){
        if (indx>=n) {
            System.out.println(sum);
            return;
        }
        subSetSum(arr,n,indx+1,sum);
        subSetSum(arr, n, indx+1, sum+arr[indx]);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
       subSetSum(arr, arr.length, 0, 0);
    }
}

