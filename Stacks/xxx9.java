//linked list implimentation of stacks
public class xxx9 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrec(Node h){
            if (h==null) {
                return;
            }
            displayrec(h.next);
            System.out.print(h.data+" ");
        }
        void display() {
            displayrec(head);
            System.out.println();
        }
        int size() {
            return size;
        }
        int pop() {
            int x = head.data;
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            head = head.next;
            size--;
            return x;
        }
        int peek(){
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        boolean isEmpty(){
            if (size==0) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}
