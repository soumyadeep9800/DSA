public class AAA8 {
    static int f(int n){
        if (n>0&&n<9) return n;
        
         //int small=f(n/10);
         //int ans=f(n%10);
         //return ans

        return f(n/10)+f(n%10);
    }
    public static void main(String[] args) {
        System.out.println(f(1234));
    }
}
