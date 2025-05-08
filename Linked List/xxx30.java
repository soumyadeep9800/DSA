//two sum in a doubly linked list
import java.util.*;
public class xxx30 {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
           this.data=data;
        }
    }
    public static boolean twoSum(Node head,int x){
        Node temp=head;
        Node h=temp;
        boolean flag=false;
        while (temp.next!=null) {
            temp=temp.next;
        }
        Node s=temp;
        while (h.data<s.data) {
            if (h.data+s.data==x) {
                flag=true;
                return flag;
            }else if(h.data+s.data>x){
                s=s.prev;
            }else{
                h=h.next;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(8);
        Node e=new Node(11);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a; 
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int x=sc.nextInt();
        if (twoSum(a, x)) {
            System.out.println("yes! target found");
        }else{
            System.out.println("target sum not found");
        }
    }
}
