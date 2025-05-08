//check number is palindrom or not;
// import java.util.Scanner;
// public class AAA27 {
//     static String reversNmae(String s){
//         if(s.length()==0) return "";

//         String smallans=reversNmae(s.substring(1));

//         return smallans+s.charAt(0);    
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your string");
//         String s=sc.nextLine();
//         String rev=reversNmae(s);
//         if (rev.equals(s)) {
//             System.out.println("yes it's palindrom");
//         }else{
//             System.out.println("not palindrom");
//         }
//     }
// }
import java.util.Scanner;
public class AAA27 {
    static boolean checkpalindrom(String s,int l,int r){
        if(l>=r) return true;
        return  (s.charAt(l)==s.charAt(r)&&checkpalindrom(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String s=sc.nextLine();
       System.out.println(checkpalindrom(s, 0, s.length()-1));
        
    }
}
