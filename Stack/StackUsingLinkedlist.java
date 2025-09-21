package Stack;

public class StackUsingLinkedlist {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static node head = null;

    // is empty
    public boolean isEmpty() {
        return head == null;
    }

    // push
    public void push(int data) {
        // create new Node
        node newNode = new node(data);
        // base case
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // pop
    public int pop() {
        // base case
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    // peek
    public int peek() {
        return head.data;
    }

    public static void main(String[] args) {
        StackUsingLinkedlist s = new StackUsingLinkedlist();
        s.push(1);
        s.push(2);
        s.push(3);
        // print
        System.out.println(s.isEmpty());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
