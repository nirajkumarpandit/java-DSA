package Stack;

import java.util.ArrayList;

public class StackUisngArrayList {
    // create a arrayList
    static ArrayList<Integer> list = new ArrayList<>();

    // isEmpty
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // push function
    public void push(int data) {
        list.add(data);
    }

    // pop function
    public int pop() {
        // base case
        if (isEmpty()) {
            return -1; // agar isEmpty true hota hai to
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    // peak function
    public int peak() {
        // base case
        if (isEmpty()) {
            return -1; // agar isEmpty true hota hai to
        }
        return list.get(list.size() - 1);
    }

    public static void main(String args[]) {
        StackUisngArrayList s = new StackUisngArrayList();
        s.push(1);
        s.push(2);
        // print statement
        while (!s.isEmpty()) {
            System.out.println(s.peak());
            s.pop();
        }
    }
}
