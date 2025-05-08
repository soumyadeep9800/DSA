//Treeset(set interface->sorted set)
//store unique value
//store value sorted order
import java.util.*;
public class xxx9 {
    public static void TreesetEx(){
        TreeSet<Integer> ht=new TreeSet<>();
        ht.add(8);
        ht.add(2);
        ht.add(3);
        System.out.println(ht);// 1 2 3
        ht.add(1);        
        ht.add(1);        
        ht.add(2);        
        System.out.println(ht);// 1 2 3 can not add dublicate
        ht.remove(2);
        System.out.println(ht);
        System.out.println(ht.contains(5));//false
    }
    public static void main(String[] args) {
        TreesetEx();
    }
}