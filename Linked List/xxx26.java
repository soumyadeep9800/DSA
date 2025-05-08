//doubly list disple with head and tail and inserthead/tail ,delete
public class xxx26 {
    public static class Node {
         int data;
         Node next;
         Node prev;
         Node(int data){
            this.data=data;
         }
    }
    public static void DisplayHead(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void DisplayTail(Node tail){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head,int data){
          Node t=new Node(data);
          Node temp=head;
          t.next=temp;
          temp.prev=t;
          head=t;
          return head;
    }
    public static void insertAtTail(Node head,int data){
          Node t=new Node(data);
          Node temp=head;
          while (temp.next!=null) {
            temp=temp.next;
          }
          temp.next=t;
          t.prev=temp;
    }
    public static void insertAtMiddle(Node head,int data,int indx){
          Node t=new Node(data);
          Node temp=head;
        //   int x=count(head);
        //   Node zero=insertAtHead(head, data);
        //   if (indx==x) {
        //     insertAtTail(head, data);
        //   }else if(indx==0){
            
        //   }else if(indx>x||indx<0){
        //     System.out.print("wrong indx");
        //   }else{
            for(int i=0;i<indx-1;i++){
                temp=temp.next;
              }
              t.next=temp.next;
              t.prev=temp;
              temp.next=t;
              t.next.prev=t;
          } 
    //}
    public static int count(Node head){
        int count=0;
        Node temp=head;
        while (head!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void delete(Node head,int indx){
        Node temp=head;
        for(int i=0;i<indx-1;i++){
            temp=temp.next;
        } 
        Node s=temp.next.next;
        temp.next=s;
        s.prev=temp;
    }
    public static Node  deleteHead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }
    public static void deleteTail(Node head){
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
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
        // System.out.print("orginal noe: ");
        // DisplayHead(a);
        // DisplayTail(e);
        //System.out.print("update Node: ");
        //Node cc=insertAtHead(a, 100);
        //insertAtTail(a, 200);
        //DisplayHead(cc);
       //insertAtMiddle(a, 50, 2);
       //Node headnew=deleteHead(a);
       deleteTail(a);
    //    DisplayHead(headnew);
    DisplayHead(a);
    }
}
