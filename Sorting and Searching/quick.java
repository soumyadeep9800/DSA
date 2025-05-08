public class quick {
    public static void printMyArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void Swip(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void quickSort(int arr[],int str,int end){
         if (str>=end) return;
         int pi=partition(arr,str,end);
         quickSort(arr, str, pi-1);
         quickSort(arr, pi+1, end);
    }
    static int partition(int arr[],int str,int end){
          int pivit=arr[str];   
          int cnt=0;
          for(int i=str+1;i<=end;i++){
            if(arr[i]<=pivit) cnt++;
          }
          int pivitindx=str+cnt;
          Swip(arr, str, pivitindx);
          int i=str;
          int j=end;
          while (i<pivitindx&&j>pivitindx) {
            while (arr[i]<=pivit) i++;
            while(arr[j]>pivit) j--;
            if (i<pivitindx&&j>pivitindx) {
                Swip(arr, i, j);
                i++;
                j--;
            }
          }
          return pivitindx;
    }
    public static void main(String[] args) {
        int arr[]={8,4,2,20,5,1};
        quickSort(arr, 0, arr.length-1);
        printMyArray(arr);
    }
}
