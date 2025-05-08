//imput two integer x and y find common divisor or GCD
// bruit force approch
import java.util.*;
public class AAA12{
    static int compareNumber(int x,int y){
        int gcd=1;
        for(int i=Math.max(x,y);i>=1;i--){
            if (x%i==0&&y%i==0) {
                gcd=i;
                break;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("your common number--->");
       
        int xxx=compareNumber(x, y);
        System.out.println(xxx);
    }
}
