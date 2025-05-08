//linked list implementation of queue  
public class  xxx3{
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static class queuell {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty!");
                return -1;
            }
            return head.data;
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty!");
                return -1;
            }
            int xz=head.data;
            head=head.next;
            size--;
            return xz;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty!");
                return;
            }
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queuell q1=new queuell();
        System.out.println(q1.isEmpty());
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
    }
}