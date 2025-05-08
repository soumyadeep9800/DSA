//find the sum of natural numbers n with alternats signs.
//n=5---->1-2+3-4+5=3;
import java.util.*;
public class AAA11 {
    static int printSeries(int n){
        if (n==0) {
            return 0;
        }
        if (n%2==0) {
            return printSeries(n-1)-n;
        }else{
            return printSeries(n-1)+n;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int xx=printSeries(n);
        System.out.println(xx);
    }
}
