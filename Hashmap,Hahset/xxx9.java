//HashSet
//unorderd
//unique value store
import java.util.*;
public class xxx9 {
    public static void main(String[] args) {
        HashSet<String> ht=new HashSet<>();
        ht.add("bhsd");
        ht.add("abc");
        ht.add("xyz");
        ht.add("xyz");
        System.out.println(ht);
        System.out.println(ht.contains("abc"));
        System.out.println(ht.size());
        ht.remove("xyz");
        for(String s:ht){
            System.out.print(s+" ");
        }
    }
}
