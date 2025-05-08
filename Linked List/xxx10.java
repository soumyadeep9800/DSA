//find middle node(if odd thrn ok , if even then find left middle)
public class xxx10 {
    public static void Display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int Size(Node head){
        Node temp=head;
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node MiddlNode(Node head){
        Node fast=head;
        Node slow=head;
        while (fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node x1=new Node(87);
        Node x2=new Node(100);
        Node x3=new Node(13);
        Node x4=new Node(4);
        Node x5=new Node(50);
        Node x6=new Node(12);
        //Node x7=new Node(10);
        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;
        x5.next=x6;
        //x6.next=x7;
        Display(x1);
        System.out.println("size is :"+Size(x1));
        Node temp=MiddlNode(x1);
        System.out.println(temp.data);
    }
}
