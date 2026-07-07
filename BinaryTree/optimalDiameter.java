package BinaryTree;

public class optimalDiameter {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // create the info class for return the diam and height
    /**
     * Info
     */
    static  class Info {
        int diam;
        int ht;
        public  Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    // calculate the diameter of the root node
    public static Info diameter(Node root){
        //base case
        if(root == null) {
            return new Info(0, 0);
        }
        // calculate the left diam and ht
        Info leftInfo= diameter(root.left);
        Info righInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, righInfo.diam),leftInfo.ht+righInfo.ht+1);
        int ht=Math.max(leftInfo.ht,righInfo.ht)+1;
        return new Info(diam,ht);
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(6);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        Info result = diameter(root);
        System.out.println(result.diam);
        System.out.println(result.ht);
    }
}
