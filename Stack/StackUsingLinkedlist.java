package Stack;

public class StackUsingLinkedlist {
    static class node {
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
     
    }
    static class Stack {
        static node head=null;
        // is empty
        public static boolean isEmpty(){
            return head==null;
        } 
        // push
        public static void push(int data){
            // create new Node
            node newNode = new node(data);
            // base case
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        // pop
        public static int pop(){
            // base case 
            if(isEmpty()){
                return -1;
            }
            int top= head.data;
            head=head.next;
            return top;
        }
        // peek 
        public static int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        // print 
        System.out.println(s.isEmpty());
        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
