package BinaryTree;
public class height{
    static class Node {
    
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // height of the binary tree
    public static int height(Node root){
        // base case
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }

    // count the nodes in tree
    public static int nodesCount(Node root){
        // base case
        if(root==null){
            return 0; // no node present
        }
        int lcount=nodesCount(root.left);
        int rcount=nodesCount(root.right);
        return (lcount+rcount)+1;
    }
    public static void main(String[] args) {
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(height(root));
        System.out.print("No. of nodes in the tree : "+nodesCount(root));
    }
}