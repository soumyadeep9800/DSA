//delete nth node from last . this code crete by me the exect 
public class xxx8 {
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
             this.data=data;
        }
     }
     public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
           System.out.print(temp.data+" ");
           temp=temp.next;
        }
        System.out.println();
     }
     public static Node Delete(Node head,int idx){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<idx;i++){
            fast=fast.next;
        }
        if (fast==null) {
            head=head.next;
            return head;
        }
        while (fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
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
        System.out.println("Before delete: ");
        display(xx);
        System.out.println("After delete: ");
        Node temp= Delete(xx, 5);
        display(temp);
    }
}

