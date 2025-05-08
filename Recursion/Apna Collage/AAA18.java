//finad maximum in array
public class AAA18{
    static int highestArray(int arr[],int indx){
        if (indx==arr.length-1) {
            return arr[indx];
        }
        int smallproblem=highestArray(arr, indx+1);
        //self work
        return Math.max(arr[indx],smallproblem);
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,1};
        System.out.println(highestArray(arr, 0));
    }
}
