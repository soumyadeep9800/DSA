public class xxx4 {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist {
        Node head =null;
        Node tail =null;

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if (head==null) {
                head=temp;
               // tail=temp;
            }else{
                tail.next=temp;
               // tail=temp;
            }
            tail=temp;
        }

        void insertAtHead(int val){
            Node temp=new Node(val);
            if (head==null) {//empty list
                //head=tail=temp;
                head=temp; 
                tail=temp;
            }else{//non empty list
                temp.next=head;
                head=temp;
            }
        }

        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp=head;
            if (idx==size()) {
                insertAtEnd(val);
                return;
            }else if (idx==0) {
                insertAtHead(val);
                return;
            }else if(idx<0||idx>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                 temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        int getAt(int idx){
            if(idx<0||idx>size()){
                return -1;
            }
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void delete(int idx){
            if (idx==0) {
                head=head.next;
                return;
            }
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        int size(){
            int count=0;
            Node temp=head;
            while (temp!=null) {
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(14);
        ll.insertAtHead(2);
        ll.insertAtHead(3);
        //ll.display();
        //System.out.println();
        //ll.insertAt(1, 11);
        ll.display();
        System.out.println();
        //System.out.println(ll.getAt(0));
        ll.delete(1);
        ll.display();
        System.out.println();
        System.out.println(ll.tail.data);
        //ll.display();
        //System.out.println("linked list length is: "+ll.size());
    }
}
