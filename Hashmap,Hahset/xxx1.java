//hashmap all methods
import java.util.*;
import java.util.Map;
public class xxx1 {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        //adding element
        mp.put("rony", 21);
        mp.put("sayan", 18);
        mp.put("rakhal", 25);
        mp.put("antima", 41);
        mp.put("dwip", 15);
        //getting value of a key from hashmap
        System.out.println(mp.get("rony"));//21
        System.out.println(mp.get("njf"));//null
        //changing/updating value of key in the hashmap
        mp.put("akash", 66);
        System.out.println(mp.get("akash"));
        //removing pair
        mp.remove("dwip");   
        //System.out.println(mp);
        //checking if a key present or not
        System.out.println(mp.containsKey("rony"));//true
        //adding a key if it doestnot exist
        mp.putIfAbsent("dwip", 88);
        //System.out.println(mp);
        //get all the key / value / entries
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        //Traversing all entries of hashmap
        for(String key:mp.keySet()){
            System.out.printf("age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> x:mp.entrySet()){
            System.out.printf("age of %s is %d\n",x.getKey(),x.getValue());
        }
        System.out.println();
        for(var x:mp.entrySet()){
            System.out.printf("age of %s is %d\n",x.getKey(),x.getValue());
        }
    }
}