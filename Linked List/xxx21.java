//palindrome linked list
public class xxx21 {
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
        Node agla=null;
        while (cur!=null) {
            agla=cur.next;
            cur.next=pre;
            pre=cur;
            cur=agla;
        }
        return pre;
    }
    public static boolean isPalindrome(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null&&fast.next.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        Node temp=reverse(slow.next); 
        slow.next=temp;
        Node p1=head;
        Node p2=slow.next;
        while (p2!=null) {
            if (p1.data!=p2.data)  return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a=new Node(1);     
        Node b=new Node(2);     
        Node c=new Node(3);     
        Node d=new Node(4);     
        Node e=new Node(4);     
        Node f=new Node(3);     
        Node g=new Node(2);     
        Node h=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        if (isPalindrome(a)) {
            System.out.println("It is palindrom.");
        }else{
            System.out.println("Not a palindrom.");
        }
    }
}
