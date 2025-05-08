//tree implemantation(Anuj Bhaiya) taking input from user
import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
    }
}
public class aaa5 {
     static Scanner sc=null;
        public static Node CreateTree(){
           Node root=null;

           System.out.println("Enter data:");
           int data=sc.nextInt();

           if(data==-1) return null;
           root=new Node(data);

           System.out.println("Enter data for left node "+data);
           root.left=CreateTree();

           System.out.println("Enter data for right node "+data);
           root.right=CreateTree();

           return root;
        }
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=CreateTree();
        System.out.println("The root data is: "+root.data);
    }
}
