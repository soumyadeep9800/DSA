// factorial of n number in this case n=5;
public class AAA3 {
    public static int printFictorial(int n){
        if (n==1||n==0) {  
            return 1;
        }
        int factorial_nm=printFictorial(n-1);
        int factorial_nm1=n*factorial_nm;
        return factorial_nm1;
    }
    public static void main(String[] args) {
       int n=5;
       int ans=printFictorial(n);
       System.out.println(ans);
    }
}
