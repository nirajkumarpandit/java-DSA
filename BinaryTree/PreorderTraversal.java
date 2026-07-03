package BinaryTree;

import BinaryTree.PreOrder.BinaryTree;

public class PreorderTraversal {
    static class  Node {
    
        int data; 
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree {
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            } 
            // create a new node 
            Node newNode=new Node(nodes[idx]);
            // create left
            newNode.left= buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        // pre order traversal
        public static void preorderTraversal(Node root){
            // base case
            if(root == null){
                return;
            }
            // step1 -> print root node
            System.out.print(root.data+" ");
            // step2 -> print left nodes
            preorderTraversal(root.left);
            // step 3-> print right nodes
            preorderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root= tree.buildTree(nodes);
        // System.out.println("Root element : "+root.data);
        tree.preorderTraversal(root);
    }
}
