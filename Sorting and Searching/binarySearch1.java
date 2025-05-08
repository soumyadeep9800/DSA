//recursive binary Search implement
public class binarySearch1 {
    static  boolean Search(int a[],int target,int st,int end){
        if (st>end) return false;
        int mid=(st+end)/2;
        if (target==a[mid]) {
            return true;
        }else if(target<a[mid]){
            return Search(a, target, st, mid-1);
        }else{
            return Search(a, target, mid+1, end);
        }
    } 
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int target=0;
        int n=a.length;
        int st=0,end=n-1;
        //System.out.println(Search(a, target));
        while (target!=10) {
            System.out.println(Search(a, target,st,end));
            target++;
        }
    }
}

