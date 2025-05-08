//find maximum twin sum;
public class xxx22 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void Display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
        Node cur=head;
        Node pre=null;
        Node Next=null;
        while (cur!=null) {
            Next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=Next;
        }
        return pre;
    }
    public static int twinSum(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=reverse(slow.next);
        slow.next=temp;
        Node p1=head;
        Node p2=slow.next;
        int sum=Integer.MIN_VALUE;
        while (p2!=null) {
            if (p1.data+p2.data>sum) {
                sum=p1.data+p2.data;
            }
            p2=p2.next;
            p1=p1.next;
        }
        return sum;
    }
    public static void main(String[] args) {
        Node x1=new Node(1);
        Node x2=new Node(10);
        Node x3=new Node(13);
        Node x4=new Node(4);
        Node x5=new Node(5);
        Node x6=new Node(6);
        Node x7=new Node(7);
        Node x8=new Node(2);
        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;
        x5.next=x6;
        x6.next=x7;
        x7.next=x8;
        System.out.println("maximum twin sum: "+twinSum(x1));
    }
}
