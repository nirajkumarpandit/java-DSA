package Queue.praticsFolder;

public class p1 {
    public static class Queue {
    
        int arr[];
        int front;
        int rear;
        int sz;
        Queue(int n){
            arr=new int[n];
            front=0;
            rear=-1;
            sz=n;
        }
        public boolean isEmpty(){
            return front>rear;
        }
        public void add(int data){
            if(rear==sz-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int item=arr[front];
            front++;
            return item;
            
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
        public void print(){
            for(int i=front; i<=rear; i++ ){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(0);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        q.remove();
        // q.print();
        System.out.println(q.peek());
        System.out.println(q.front);
    }
}
