package BinaryTree;

public class Diameter {
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
    // Diameter of the tree

    // TIME COMPLEXITY =O(n^2)
    
    public static int diameter(Node root){
        // base case 
        if(root == null){
            return 0;
        }
        // left diameter
        int leftDiameter=diameter(root.left);
        int rightDiameter=diameter(root.right);
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int selfDiameter= leftHeight+rightHeight+1;
        return Math.max(leftDiameter, Math.max(rightDiameter, selfDiameter));
    }
    public static void main(String[] args) {
         Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(diameter(root));
    }
}
