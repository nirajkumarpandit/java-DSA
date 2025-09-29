package Queue;

public class ImpUsingArray {
    static class Queue{   // agar ye static nahi hota to ImpusingArray ka object banana hota
            int arr[];
            int rear;
            int front;
            int size; 
        // constructor
        Queue(int n){
            arr=new int[n];
            rear=-1;
            front=0;
            size=n;
        }
        // isEmpty
        public boolean isEmpty(){
            return front >rear;
        }
        // add
        public void enque(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        // remove
        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int item=arr[front];
            front++;
            return item;

        }
        //peek 
        public int peek(){
            if(isEmpty()){
                 System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        // print 
        public void print(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.print();
        System.out.println(q.dequeue());
        q.print();
    }
}
