//multiply two number
import java.util.*;
public class AAA15{
    static int calculateNumber(int n,int m){
        if (n==0||m==0) {
            return n*m;
        }
        int xxx=calculateNumber(n, m-1);
        int yyy=xxx+n;
        return yyy;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("final answer-------->");
        int zzz=calculateNumber(n, m);
        System.out.println(zzz); 
    }
}
