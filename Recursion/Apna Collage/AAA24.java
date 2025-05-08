// check the array is sorted or not
public class AAA24{
    static boolean checkSorted(int arr[],int indx,int n){
        if (indx==n-1) return true;
        if (arr[indx]>arr[indx+1]) return false;
       return checkSorted(arr, indx+1, n);
    }
    public static void main(String[] args) {
     //int arr[]={5,4,7,1,9,3};
      int arr[]={1,2,3,4};
      int n=arr.length;
      if (checkSorted(arr, 0, n)) {
        System.out.println("sorted");
      }else{
        System.out.println("no baby");
      }
    }
}
