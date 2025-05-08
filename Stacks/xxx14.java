//next gretter element in array
public class xxx14 {
    public static void main(String[] args) {
        int arr[]={1,3,2,1,8,6,3,4};
        int n=arr.length;
        int res[]=new int[n];

        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=i+1;j<n;j++){
                if (arr[i]<arr[j]) {
                    res[i]=arr[j];
                    break;
                }
            }
        }
        System.out.print("Input array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("result array: ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
