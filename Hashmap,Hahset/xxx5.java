//isomorphic string , both string length is same
import java.util.*;
public class xxx5 {
    static boolean isomorphic(String x,String y){//O(n^2)
        if (x.length()!=y.length()) {
            return false;
        }
        Map<Character,Character> mp=new HashMap<>();
        for(int i=0;i<x.length();i++){//O(n)
            char ch1=x.charAt(i);
            char ch2=y.charAt(i);
            if (mp.containsKey(ch1)){
                if (mp.get(ch1)!=ch2) {
                    return false;
                }     
            }else if(mp.containsValue(ch2)){//O(n)
                return false;
            }else{
                mp.put(ch1,ch2); 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two string: ");
        String x=sc.nextLine();
        String y=sc.nextLine();
        System.out.println(isomorphic(x, y));
    }
}
// static boolean isomorphic(String x,String y){//O(n)
//     if (x.length()!=y.length()) {
//         return false;
//     }
//     Map<Character,Character> mp=new HashMap<>();
//     Hashset<Character> st=new HashSet<>();
//     for(int i=0;i<x.length();i++){//O(n)
//         char ch1=x.charAt(i);
//         char ch2=y.charAt(i);
//         if (mp.containsKey(ch1)){
//             if (mp.get(ch1)!=ch2) {
//                 return false;
//             }     
//         }else if(st.add(ch2)){//O(1)
//             return false;
//         }else{
//             mp.put(ch1,ch2); 
//             st.add(ch2);
//         }
//     }
//     return true;
// }