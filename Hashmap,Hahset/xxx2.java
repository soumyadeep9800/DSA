//given a array , find the most frequent element in it
import java.util.*;
public class xxx2 {
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<>();
        int arr[]={1,3,2,1,4,1};
        int n=arr.length;
        for(int el:arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }else{
                mp.put(el, mp.get(el)+1);
            }
        }
        System.out.println(mp);
        int maxfreq=-1,anskey=-1;
        // for(var e:mp.entrySet()){
        //     if (e.getValue()>maxfreq) {
        //         maxfreq=e.getValue();
        //         anskey=e.getKey();
        //     }
        // }
        for(var key:mp.keySet()){
            if (mp.get(key)>maxfreq) {
                maxfreq=mp.get(key);
                anskey=key;
            }
        }
        System.out.println(anskey);
    }
}