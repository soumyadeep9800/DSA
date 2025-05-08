//imput two integer x and y find common divisor or GCD.
//using Euclids Algorithm.
import java.util.*;
public class AAA14{
    static int GCD(int x,int y){
        if (y==0) {
            return x;
        }    
       return GCD(y, x%y);
       
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("your common number--->");
       
        int xxx=GCD(x, y);
        System.out.println(xxx);
    }
}

