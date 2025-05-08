//sum of array
public class AAA19{
    static int sumArray(int arr[],int indx){
        if (indx==arr.length-1) {
            return arr[indx];
        }
        int smallsum=sumArray(arr, indx+1);
        //self work
        return smallsum+arr[indx];
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8};
        System.out.println(sumArray(arr, 0));
    }
}

