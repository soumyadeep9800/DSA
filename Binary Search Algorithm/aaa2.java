//find 1st occurrence.
public class aaa2 {
    static int findTarget(int a[],int x){
        int n=a.length;
        int str=0,end=n-1;
        int result=-1;
        while (str<=end) {
            int mid=str+(end-str)/2;
            if (x==a[mid]) {
                result=mid;
                end=mid-1;
            }else if(x<a[mid]){
                end=mid-1;
            }else{
                str=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int a[]={2,5,5,5,6,6,8,9,9,9};
        int x=5;//target
        System.out.println(findTarget(a, x));
    }
}
