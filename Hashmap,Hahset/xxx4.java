//Anagram
import java.util.*;
public class xxx4 {
    static Map<Character,Integer> makefreqMap(String str){
        Map<Character,Integer>mp=new HashMap<>();
        for(char e:str.toCharArray()){
            if(!mp.containsKey(e)){
                mp.put(e, 1);
            }else{
                mp.put(e, mp.get(e)+1);
            }
        }
        return mp;
    }
    static boolean Anagram(String x,String y){
        if (x.length()!=y.length()) {
            return false;
        }
        Map<Character,Integer> mp1=makefreqMap(x);
        Map<Character,Integer> mp2=makefreqMap(y);
        return mp1.equals(mp2);
    }
    static boolean optAnagram(String x,String y){
        if (x.length()!=y.length()) {
            return false;
        }
        Map<Character,Integer> mp=makefreqMap(y);
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if (!mp.containsKey(ch)) {
                return false;
            }
            int curfreq=mp.get(ch);
            mp.put(ch, curfreq-1);
        }
        //all values in map should be 0 for x and y to be anagram
        for(int i:mp.values()){
            if(i!=0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two string: ");
        String x=sc.nextLine();
        String y=sc.nextLine();
        // boolean e=Anagram(x, y);
        // System.out.println(e);
        boolean e=optAnagram(x, y);
        System.out.println(e);
    }
}
