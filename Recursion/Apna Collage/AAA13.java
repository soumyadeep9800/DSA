//imput two integer x and y find common divisor or GCD.
import java.util.*;
public class AAA13{
    static int iGCD(int x,int y){
       while (x%y!=0) {
         int red=x%y;
          x=y;
          y=red;
       }
       return y;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("your common number--->");
       
        int xxx=iGCD(x, y);
        System.out.println(xxx);
    }
}

