//find common node in 2 list
public class xxx9 {
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
    public static int Intersection(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int x=Size(head1);
        int y=Size(head2);
        int z;
        if (x>y) {
            z=x-y;
            for(int i=0;i<z;i++){
                temp1=temp1.next;
            }
        }else{
            z=y-x;
            for(int i=0;i<z;i++){
                temp2=temp2.next;
            }
        }
        while (temp1.data!=temp2.data) {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1.data;
    }
    public static void main(String[] args) {
        Node x1=new Node(87);
        Node x2=new Node(100);
        Node x3=new Node(13);
        Node x4=new Node(4);
        Node x5=new Node(50000);
        Node x6=new Node(12);
        Node x7=new Node(10);
        Node y1=new Node(90);
        Node y2=new Node(9);
        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;
        x5.next=x6;
        x6.next=x7;
        y1.next=y2;
        y2.next=x5;
          
        Display(x1);
        Display(y1);
        System.out.println("size of 1st list is: "+Size(x1));
        System.out.println("size of 2st list is: "+Size(y1));
        int xxx=Intersection(x1, y1);
        System.out.println("The common Node is: "+xxx);
    }
}
