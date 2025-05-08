//Linked list(list interface)
import java.util.*;
public class xxx2 {
    public static void LinkedlistEx(){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);//1 2 3
        System.out.println(l.get(0));//1
        l.set(0, 10);
        System.out.println(l);//10 2 3
        System.out.println(l.contains(10));//true
    }
    public static void main(String[] args) {
        LinkedlistEx();
    }
}