// // find the mimimum of bracketes that we need to remove 
// // to make the given brakete sequence balanced


// import java.util.*;
// public class xxx12 {
//     public static int isBalanced(String str){
//         Stack<Character> st=new Stack<>();
//         int n=str.length();
//         for(int i=0;i<n;i++){
//             char ss=str.charAt(i);
//             if (ss=='(') {
//                 st.push(ss);
//             }else{
//                 if (!st.contains('(')) {
//                     st.push(ss);
//                 }else{
//                     st.pop();
//                 }
//             }
//         }
//         return st.size();
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter String :");
//         String str=sc.nextLine();
//         System.out.println(isBalanced(str));
//     }
// }


import java.util.*;

public class xxx12 {
    public static int isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            char ss = str.charAt(i);
            if (ss == '(') {
                st.push(ss); 
            } else if (ss == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop(); 
                } else {
                    st.push(ss);
                }
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        System.out.println("Minimum brackets to remove: " + isBalanced(str));
    }
}

