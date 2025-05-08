//check armstrong.
import java.util.*;
public class AAA16 {
    static int countDigit(int z){
        int digitCount=String.valueOf(z).length();
        return digitCount;
        // int count=0;
        // while (z!=0) {
        //    z=z/10;
        //    count++;
        // }
        // return count;
    }
    static int armStrongCheck(int z,int x){
        int n=countDigit(z);
        if (x<10) {
        return (int) Math.pow(x, n); 
        }
        return (int) Math.pow(x%10, n)+armStrongCheck(z, x/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int z=sc.nextInt();
        int aaa=armStrongCheck(z,z);
       if (aaa==z) {
        System.out.println("Armstrong");
       }else{
        System.out.println("No baby----->");
       }
    }
}
