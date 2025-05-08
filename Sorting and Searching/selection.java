//selection sort
//increasing order
public class selection {
    static void SelectionSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
       int minIndx=i;
       for(int j=i+1;j<n;j++){
        if (arr[j]<arr[minIndx]) {
            minIndx=j;
        }
       } 
       if (minIndx!=i) {
        int temp=arr[i];
       arr[i]=arr[minIndx];
       arr[minIndx]=temp;
       }
    }
}
    public static void main(String[] args) {
       // int arr[]={3,189,4,5,10};
        int arr[]={64,25,12,22,11};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
