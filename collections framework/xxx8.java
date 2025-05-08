//LinkedHashset(set interface)
//store unique value
//store value ordered
import java.util.*;
public class xxx8 {
    public static void LinkedHashsetEx(){
        LinkedHashSet<Integer> ht=new LinkedHashSet<>();
        ht.add(1);
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
        LinkedHashsetEx();
    }
}