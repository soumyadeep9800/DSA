//HashMap(map interface)
//ordered
import java.util.*;
public class xxx10 {
    public static void HashMapEx(){
        Map<Integer,String> ht=new HashMap<>();
        ht.put(1,"jiof");
        ht.put(2,"rony");
        ht.put(3,"soumya");
        //ht.put(3,"soumyadeep");//over-rides
        System.out.println(ht);       
        ht.remove(2);
        System.out.println(ht);
        System.out.println(ht.get(1));
        System.out.println(ht.containsKey(5));//false
        System.out.println(ht.containsValue("soumya"));//true
        System.out.println(ht.keySet());
        System.out.println(ht.values());
        System.out.println(ht.entrySet());
        //iterate over keys
        // for(Integer i:ht.keySet()){
        //     System.out.print(i+" ");
        // }
        
        //iterate over value
        // for(String i:ht.values()){
        //     System.out.print(i+" ");
        // }
        
        //iterate over value,key
        for(var i:ht.entrySet()){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        HashMapEx();
    }
}