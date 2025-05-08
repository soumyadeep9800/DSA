//binarysearch basi approch
public class aaa{
    static boolean binarysearch(int a[],int target){
        int n=a.length;
        int str=0,end=n-1;
        while (str<=end) {
            int mid=(str+end)/2;
            if (target==a[mid]) {
                return true;
            }else if(target<a[mid]){
                end=mid-1;
            }else{
                str=mid+1;
            }
        }
         return false;
    }
    public static void main(String[] args) {
       int a[]={4,5,21,7,8,45,98,2,45,70};
       int target=8;
       System.out.println(binarysearch(a, target));
    }
}