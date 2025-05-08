//doubly list disply with random node
public class xxx27 {
    public static class Node {
         int data;
         Node next;
         Node prev;
         Node(int data){
            this.data=data;
         }
    }
    public static void DisplayRandomNode(Node random){
        Node temp=random;
        while (temp.prev!=null) {
            temp=temp.prev;
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;
        DisplayRandomNode(c);
    }
}
