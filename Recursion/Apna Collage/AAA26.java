//revers string 
// import java.util.Scanner;
// public class AAA26 {
//     static String reversNmae(String s,int indx){
//         if(s.length()==indx) return "";

//         String smallans=reversNmae(s, indx+1);

//         return smallans+s.charAt(indx);    
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your string");
//         String s=sc.nextLine();
//         System.out.println(reversNmae(s, 0));
// }
// }
import java.util.Scanner;
public class AAA26 {
    static String reversNmae(String s){
        if(s.length()==0) return "";

        String smallans=reversNmae(s.substring(1));

        return smallans+s.charAt(0);    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String s=sc.nextLine();
        System.out.println(reversNmae(s));
}
}