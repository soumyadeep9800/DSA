//check palindrom better approch is previous one eith beter time complexcity
public class xxx23 {
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
    public static boolean isPalindrome(Node head){
        if (head == null || head.next == null) return true;
        Node temp1=head;
        Node a=new Node(-1);
        Node temp2=a;
        while (temp1!=null) {
            Node b=new Node(temp1.data);
            temp2.next=b;
            temp2=temp2.next;
            temp1=temp1.next;
        }
        Node rev=reverse(a.next);
        Node c=rev;
        Node d=head;
        while (c!=null && d!=null) {
            if(c.data!=d.data){
                return false;
            }
            c=c.next;
            d=d.next;
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
