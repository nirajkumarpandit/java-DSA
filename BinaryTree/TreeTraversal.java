package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
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
        //Inorder traversal
        public static void inorder(Node root){
            // base case 
            if(root == null){
                return ;
            }
            // step 1-> traverse left subtree
            inorder(root.left);
            // step 2-> print root
            System.out.print(root.data+" ");
            // step 3-> traverse right subtree
            inorder(root.right);
        }
        // Post order traversal
        public static void postorder(Node root){
            // base case 
            if(root == null){
                return;
            }
            // print left subtree
            postorder(root.left);
            // print right subtree
            postorder(root.right);
            // print root
            System.out.print(root.data+" ");
        }
        // level Order traversal
        public static void levelOrder(Node root){
            // base case
            if(root == null) return;
            // create a queue
            Queue<Node> q=new LinkedList<>();
            // add root into queue and null for next line
            q.add(root);
            q.add(null);
            // jab tak queue empty nahi ho jata tab tak loop for traversal
            while (! q.isEmpty()) {
                Node currNode =q.remove();
                // agar null ho to next line print karana hai
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty())break;
                    else q.add(null);
                }else{// agar koi data hai to use print kara do
                    System.out.print(currNode.data+" ");
                    if(currNode.left !=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right !=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root= tree.buildTree(nodes);
        // System.out.println("Root element : "+root.data);
        // tree.preorderTraversal(root);
        // tree.inorder(root);
        // tree.postorder(root);
        tree.levelOrder(root);
    }
}
