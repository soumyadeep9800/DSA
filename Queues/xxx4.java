//array implementation in circular queue
public class xxx4 {
    public static class circulararr{
        int front=-1;
        int rear=-1;
        int size=0;
        int arr[]=new int[5];
        public void add(int x) throws Exception{
            if (size==arr.length) {
                throw new Exception("Queue is full!");
            }
            else if(size==0){
                front=rear=0;
                arr[0]=x;
            }else if (rear<arr.length-1) {
                arr[++rear]=x;
            }else if (rear==arr.length-1) {
                rear=0;
                arr[0]=x;
            }
            size++;
        }
        public int remove() throws Exception{
            if (size==0) {
                throw new Exception("queue is empty!");
            }else if (front==arr.length-1) {
                int val=arr[front];
                front=0;
                size--;
                return val;
            }else{
                int val=arr[front];
                front++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if (size==0) {
                throw new Exception("queue is empty!");
            }else{
                return arr[front];
            }
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty!");
                return;
            }else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }else{//rear<front
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        circulararr q1=new circulararr();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        q1.remove();
        q1.display();
        // q1.add(50);
        // q1.add(50);
    }
}
