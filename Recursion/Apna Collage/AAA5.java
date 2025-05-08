//print x^n(stack height=n)
public class AAA5 {
    public static int calcPower(int x,int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int calp=calcPower(x, n-1);
        int calp2=x*calp;
        return calp2;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x, n);
        System.out.println(ans);
    }
}
