//fibonacchi till nth term
public class AAA7 {
    public static int printFibonacchi(int n){
         if (n==0||n==1) {
            return n;
         }
         int pre=printFibonacchi(n-1);
         int prepre=printFibonacchi(n-2);

         int ans=pre+prepre;
         return ans;
    }
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
        int x=printFibonacchi(i);
        System.out.println(x);
        }
    }
}
