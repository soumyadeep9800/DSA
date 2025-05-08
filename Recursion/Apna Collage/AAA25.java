//given string remove a;
//import java.util.*;
// public class AAA25 {
//     static String deleteA(String s,int indx){
//         if (indx==s.length()) return "";

//         String smallanswer=deleteA(s, indx+1);
//         char current=s.charAt(indx);

//         if (current!='a') {
//             return current+smallanswer;
//         }else{
//             return smallanswer;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter your String");
//         String s=sc.nextLine();
//         System.out.println(deleteA(s, 0));
//     }
// }
import java.util.*;
public class AAA25 {
    static String deleteA(String s){
        if (0==s.length()) return "";

        String smallanswer=deleteA(s.substring(1));
        char current=s.charAt(0);

        if (current!='a') {
            return current+smallanswer;
        }else{
            return smallanswer;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();
        System.out.println(deleteA(s));
    }
}