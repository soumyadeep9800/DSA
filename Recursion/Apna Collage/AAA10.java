//num=12; k=5;
 //12,24,36,48,60;
public class AAA10 {
    static void printMultiply(int n,int k){
        if (k==1) {
            System.out.println(n*k);
            return;
        }
        printMultiply(n,k-1);
        System.out.println(n*k);
        
    
    }
    public static void main(String[] args) {
        int n=12;
        int k=5;
        printMultiply(n,k);
    }
}
