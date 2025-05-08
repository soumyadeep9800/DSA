public class xxx5 {
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
   public static void delete(Node a){
      a.data=a.next.data;
      a.next=a.next.next;
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
       display(xx);
       System.out.println("After delete");
       delete(xx1);//tail would not be delete....error
       display(xx);
    }
}
