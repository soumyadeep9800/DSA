//PRINT ARRAY
public class AAA17{
    static void printArray(int arr[],int indx){
        if (indx==arr.length) {
            return;
        }
        System.out.println(arr[indx]);
        printArray(arr, indx+1);
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8};
        printArray(arr, 0);
    }
}