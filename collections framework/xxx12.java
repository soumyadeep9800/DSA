//TreeMap(sortedMap->map interface)
//sorted ordere in tha bacis of Key
import java.util.*;
public class xxx12 {
    public static void TreeMapEx(){
        Map<Integer,String> ht=new TreeMap<>();
        ht.put(3,"jiof");
        ht.put(1,"asrony");
        ht.put(2,"cdsoumya");
        //ht.put(3,"soumyadeep");//over-rides
        System.out.println(ht);       
        // ht.remove(2);
        // System.out.println(ht);
        // System.out.println(ht.get(1));
        // System.out.println(ht.containsKey(5));//false
        // System.out.println(ht.containsValue("soumya"));//true
        // System.out.println(ht.keySet());
        // System.out.println(ht.values());

         //iterate over keys
        // for(Integer i:ht.keySet()){
        //     System.out.print(i+" ");
        // }
        
        //iterate over value
        // for(String i:ht.values()){
        //     System.out.print(i+" ");
        // }
        
        //iterate over value,key
        // for(var i:ht.entrySet()){
        //     System.out.print(i+" ");
        // }
    }
    public static void main(String[] args) {
        TreeMapEx();
    }
}