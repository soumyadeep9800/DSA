//subsuquences of ABC;
import java.util.ArrayList;

public class AAA29 {
    static ArrayList subSuquencs(String s){
        ArrayList<String> ans=new ArrayList<>();
        //base case
        if (s.length()==0) {
            ans.add("");
            return ans;
        }
        char cur=s.charAt(0);//a
        ArrayList<String> small =subSuquencs(s.substring(1));//[bc,b,c," "]
        for(String ss:small){
            ans.add(ss);
            ans.add(cur+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
       ArrayList<String> ans=subSuquencs("abc");
       for(String ss:ans){
        System.out.println(ss);
       }
    }
}
