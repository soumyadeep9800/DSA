//binarysearch using recursion
public class aaa1 {
    static boolean binarysearch(int a[],int target,int str,int end){
        if (str>end) {
            return false;
        }
        int mid=(str+end)/2;//int mid=str+(end-str)/2
        if (target==a[mid]) {
            return true;
        }else if(target<a[mid]){
           return binarysearch(a, target, str, mid-1);
        }else{
           return binarysearch(a, target, mid+1, end);
        }
    }
    public static void main(String[] args) {
        int a[]={5,7,20,15,69,1};
        int target=7;
        System.out.println(binarysearch(a, target, 0, a.length-1));
    }
}
