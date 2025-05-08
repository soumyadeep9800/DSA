//check input integer is palindrom or not.
import java.util.*;
public class AAA28 {
    static boolean integerPalindrom(String x,int l,int r){
         if(l>=r) return true;
        return x.charAt(l)==x.charAt(r)&&integerPalindrom(x, l+1, r-1);
    }
     
      
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input your integer");
        int n=sc.nextInt();
        String x=Integer.toString(n);
        System.out.println(integerPalindrom(x, 0, x.length()-1));
    }
}



// import java.util.*;
// public class AAA28{
//     static String  integerPalindrom(String x){
//         if (x.length()==0) return "";

//         String zz=integerPalindrom(x.substring(1));

//         return zz+x.charAt(0);
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("please input a integer");
//         int n=sc.nextInt();
//         String x=Integer.toString(n);
//         String xxx=integerPalindrom(x);
//         int z=Integer.valueOf(xxx);
        
//         if (z==n) {
//             System.out.println("palindrom");
//         }else{
//             System.out.println("no baby----->");
//         }
//     }
// }