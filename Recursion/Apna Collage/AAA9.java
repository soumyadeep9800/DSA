//count number ....HW solving by me;
public class AAA9 {
    static int count(int n){
        if (n==0) {
            return 0;
        }
       int x=count(n/10);
       int y=x+1;
       return y;
    }
    public static void main(String[] args) {
        System.out.println(count(5681));
    }
}







// count(5681)
//   |
//   |-- count(568)
//   |    |
//   |    |-- count(56)
//   |    |    |
//   |    |    |-- count(5)
//   |    |    |    |
//   |    |    |    |-- count(0) --> returns 0
//   |    |    |    |
//   |    |    |    +-- returns 1
//   |    |    |
//   |    |    +-- returns 2
//   |    |
//   |    +-- returns 3
//   |
//   +-- returns 4

