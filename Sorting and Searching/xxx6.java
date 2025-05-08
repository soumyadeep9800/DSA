public class xxx6 {
    static void ptintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int arr[]){
        int x=-1;
        int y=-1;
        if (arr.length<=1) {
            return;
        }
        for(int i=1;i<arr.length;i++){
            if (arr[i-1]>arr[i]) {
                if (x==-1) {
                    x=i-1;
                    y=i; 
                }else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int arr[]={3,8,6,7,5,9,10};
        sort(arr);
        ptintArray(arr);
    }
}
