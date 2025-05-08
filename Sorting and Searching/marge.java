public class marge{
    public static void printMyArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    } 
    public static void marge1(int arr[],int l,int r,int mid){
         int n1=mid-l+1;
         int n2=r-mid;
         int left[]=new int[n1];
         int right[]=new int[n2];
         for(int i=0;i<n1;i++) left[i]=arr[l+i];
         for(int j=0;j<n2;j++) right[j]=arr[mid+1+j];
         int i=0;
         int j=0;
         int k=l;
         while (i<n1&&j<n2) {
            if (left[i]<=right[j]) {
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            } 
         }
         while (i<n1) {
            arr[k++]=left[i++];
         }
         while (j<n2) {
            arr[k++]=right[j++];
         }
    }
    public static void margeSort(int arr[],int l,int r){
        if (l>=r) return;
        int mid=l+(r-l)/2;
        margeSort(arr, l, mid);
        margeSort(arr, mid+1, r); 
        marge1(arr, l, r, mid); 
    }
    public static void main(String[] args) {
        int arr[]={4,1,3,5,2};
        System.out.println("final soted array");
        margeSort(arr, 0, arr.length-1);
        printMyArray(arr);
    }
}
