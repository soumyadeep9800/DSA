 //find last index of target value        
public class AAA23{
    static void lastIndex(int arr[],int n,int target,int indx){
       if (indx<0) return;
      
       if (target==arr[indx]){
        System.out.println(indx);
        return;
       }
       lastIndex(arr, n, target, indx-1);
    }
    public static void main(String[] args) {
      int arr[]={2,9,6,8,5};
      int n=arr.length;
      int target=2;
      lastIndex(arr, n, target, n-1);
    }
}
              
// public class ZZZ1{
//   static int lastIndex(int arr[],int n,int target,int indx){
//      if (n-1==indx) return indx; 
//      int smallProblem=lastIndex(arr, n, target, indx+1);
//      if (target==arr[smallProblem]) return smallProblem;
//     return indx;
//   }
//   public static void main(String[] args) {
//     int arr[]={1,2,2,5,7};
//     int n=arr.length;
//     int target=2;
//     System.out.println(lastIndex(arr, n, target, 0));
//   }
// }