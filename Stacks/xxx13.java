//Leet code-20 // valid Parentheses
import java.util.*;
public class xxx13 {
    public static boolean isBalanced(String x){
        Stack<Character> st=new Stack<>();
        int n=x.length();
        for(int i=0;i<n;i++){
            char ch=x.charAt(i);
            if (ch=='(' || ch=='{' || ch=='[') {
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                if('('==st.peek() && ch==')'){
                    st.pop();
                }else if('{'==st.peek() && ch=='}'){
                    st.pop();
                }else if('['==st.peek() && ch==']'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
    }
}

