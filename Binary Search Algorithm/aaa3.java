public class aaa3 {
    static int findNearsquare(int x){
        int str=0,end=x-1;
        int result=-1;
        while (str<=end) {
            int mid=str+(end-str)/2;
            int val=mid*mid;
            if (val==x) {
               return mid;
            }else if(val>x){
                end=mid-1;
            }else{
                str=mid+1;
                result=mid;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int x=24;
        System.out.println(findNearsquare(x));
    }
}
