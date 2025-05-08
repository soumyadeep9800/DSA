//find nth node from last...onlt head is given
public class xxx6 {
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
          System.out.println(temp.data);
          temp=temp.next;
       }
    }
    public static int length(Node head){
       Node temp=head;
       int count=0;
       while (temp!=null) {
          count++;
          temp=temp.next;
       }
       return count;
    }
    public static Node get(Node head,int idx){
        int size=length(head);
        int a=size-idx+1;
        Node temp=head;
        for(int i=0;i<a-1;i++){
            temp=temp.next;
        }
        return temp;

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

        Node temp=get(xx, 3);
        System.out.println(temp.data);
    }
}
