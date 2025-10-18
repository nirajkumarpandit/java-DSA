package Queue;

public class UsingLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {

        static Node head;
        static Node tail;

        // isEmpty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            // single element ho to
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }
        // peek
        public int peek(){
            if(isEmpty()){
                return-1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }
    }
}
