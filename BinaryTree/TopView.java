package BinaryTree;
import java.util.*;
public class TopView{
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.left=null;
        }
    }
    // create info class to store the horizontal distance and node
    static class Info {
    
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    //top view of binary tree
    public static void topView(Node root){
        // create a queue for level order traversal
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0; int max=0;
        //add the root node in queue
        q.add(new Info(root,0));
        q.add(null);
        while (! q.isEmpty()) {
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                // first time hd is occuring
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                // left child 
                if(curr.node.left !=null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right !=null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                }
            }
        }
        // print the top view
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data + " ");
        }
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);                          
        root.right.right=new Node(6);                          
        topView(root);

    }
}