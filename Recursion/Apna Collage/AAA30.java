//subsuquences of ABC with-out using space.
public class AAA30 {
    static void sunSequences(String s,String curans){
        if (s.length()==0) {
            System.out.println(curans);
            return;
        }
        char cur=s.charAt(0);
        String remString=s.substring(1);

        sunSequences(remString, curans+cur);
        sunSequences(remString, curans);
    }
    public static void main(String[] args) {
        sunSequences("abc", "");
    }
}
