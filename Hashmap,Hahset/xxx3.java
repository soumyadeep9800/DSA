//hashmap implement
import java.util.LinkedList;
public class xxx3 {
    public static class MyHashMap<K,V> {
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=.75f;
        private class Node {
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//number of entries in map
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){//N-capacity/size of buckets array
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc=key.hashCode();
            return (Math.abs(hc)) %buckets.length;
        }
        private int searchinBuckets(LinkedList<Node> ll,K key){
            for(int i=0;i<ll.size();i++){
               if (ll.get(i).key==key) {
                return i;
               } 
            }
            return -1;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        public int size(){
            return n;
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets=buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for(var bucket:oldBuckets){
                for(var node:bucket){
                    put(node.key, node.value);
                }
            }
        } 

        public void put(K key,V value){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchinBuckets(currBucket, key);
            if (ei == -1) {//key doesn't exist, we have to insert new node 
                Node node=new Node(key, value);
                currBucket.add(node);
                n++;
            }else{
                Node currNode=currBucket.get(ei);
                currNode.value=value;
            }

            if (n>= buckets.length*DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }
        public V get(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchinBuckets(currBucket, key);
            if (ei!=-1) {//key exists
                Node currNode=currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchinBuckets(currBucket, key);
            if (ei!=-1) {//key exists
                Node currNode=currBucket.get(ei);
                V val=currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }

        public int capacity(){
            return  buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp=new MyHashMap<>();
        System.out.println("testing put");
        mp.put("h", 10);
        mp.put("hh", 52);
        mp.put("heh", 108);
        System.out.println("capacity is: "+mp.capacity());
        System.out.println("load factor is: "+mp.load());
        mp.put("hhh", 8);
        mp.put("hhhh", 74);
        mp.put("hhhhh", 4);
        System.out.println(mp.size());
        mp.put("hhh", 80);
        System.out.println(mp.size());
        System.out.println("testing get: ");
        System.out.println(mp.get("h"));
        System.out.println(mp.get("hh"));
        System.out.println(mp.get("hhh"));
        System.out.println(mp.get("hhhh"));//null
        System.out.println(mp.remove("h"));//10
        System.out.println(mp.remove("h"));//null
        System.out.println(mp.size());
        System.out.println("capacity is: "+mp.capacity());
        System.out.println("load factor is: "+mp.load());
    }
}

