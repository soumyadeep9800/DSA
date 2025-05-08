//prefix to infix
import java.util.*;

public class xxx28 {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = ch + "";
                val.push(s);
            } else {
                String v1 = val.pop();
                String v2 = val.pop();
                char o = ch;
                // v1 v2 o
                String t ="("+v1 +o+v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
