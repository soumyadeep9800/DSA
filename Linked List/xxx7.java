//optimized previous code(nth node from last)
public class xxx7 {
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
             this.data=data;
        }
     }
     public static Node get(Node head,int idx){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<idx;i++){
            fast=fast.next;
        }
        //System.out.println(fast.data);
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
        
    }
    public static void main(String[] args) {
        Node xx=new Node(13);
        Node xx1=new Node(1);
        Node xx2=new Node(100);
        Node xx3=new Node(50);
        Node xx4=new Node(20);
 
        xx.next=xx1;
        xx1.next=xx2;
        xx2.next=xx3;
        xx3.next=xx4;
        Node temp=get(xx, 1);
        System.out.println(temp.data);
    }
}
