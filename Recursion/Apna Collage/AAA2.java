//sum of n=5 natutral number
public class AAA2 {
   public static void printSum(int i,int n,int sum){
    if (i==n) {
        sum+=i;
        System.out.println(sum);
        return;
    }
       sum+=i;
    printSum(i+1, n, sum);
   // System.out.println(i);
   } 
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}

//n=5; print 1 to 5 add=15;
// public class ZZZ1 {
//     static int sumInteger(int n){
//         if (n==0) {
//             return 0;
//         }
//         int x=sumInteger(n-1);
//         int y=x+n;
//         return y;
        
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int ccc=sumInteger(n);
//         System.out.println(ccc);
//     }
// }
