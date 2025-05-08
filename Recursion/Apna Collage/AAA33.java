public class AAA33 {
    static void combination(String dig,String kp[],String res){
        if (dig.length()==0) {
            System.out.print(res+" ");
            return;
        }
            int curNum= dig.charAt(0)-'0';
            String curchoices=kp[curNum];
            for(int i=0;i<curchoices.length();i++){
                combination(dig.substring(1), kp, res+curchoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s="253";
        String kp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(s, kp, "");
    }
}
