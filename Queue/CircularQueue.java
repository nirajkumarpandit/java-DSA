package Queue;

public class CircularQueue {
    public static class Queue{
        int arr[];
        int front; 
        int rear;
        int sz;
        Queue(int n){
            arr=new int[n];
            front=-1;
            rear=-1; 
            sz=n;
        }

        // Empty function
        public boolean isEmpty(){
            return front==-1 && rear==-1;
        }

    // isFull
    public boolean isFull(){
        return (rear+1)%sz==front;
    }
        // add function
        public void enque(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //add first element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%sz;
            arr[rear]=data;

        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return-1;
            }
            int item=arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
            front=(front+1)%sz;
            }
            return item;
        }
        // peek element
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enque(0);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        // q.remove();
        // q.enque(5);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
            // q.remove();
        }
        System.out.println(q.isEmpty());
    }
}
