public class insertion {
    static void Insertion(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while (j>0&&arr[j]<arr[j-1]) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            } 
            // for(int x:arr){
            //     System.out.print(x+" ");
            // }
            //    System.out.println();
        } 
    }
    public static void main(String[] args) {
        int arr[]={23,1,10,5,2};
        Insertion(arr); 
        for(int x:arr){
            System.out.print(x+" ");
        }  
    }
}




