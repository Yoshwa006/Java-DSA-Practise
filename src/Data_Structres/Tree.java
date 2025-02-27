package Data_Structres;

import java.util.Stack;

public class Tree {
    Node root;

    Tree(){
        root =null;
    }
    void preOrder(){
        preOrder_traversal(root);

    }

    void preOrder_traversal(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrder_traversal(node.left);
        preOrder_traversal(node.right);
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    // Helper method to insert the data recursively
    private Node addRecursive(Node current, int data) {
        // If the tree is empty, return a new node
        if (current == null) {
            return new Node(data);
        }

        // Otherwise, recur down the tree
        if (data < current.data) {
            current.left = addRecursive(current.left, data); // Insert in the left subtree
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data); // Insert in the right subtree
        }

        return current;
    }

    void inOrder(){
        inOrder_traversal(root);
    }
    void inOrder_traversal(Node node){
        if(node == null){
            return;
        }
        inOrder_traversal(node.left);
        inOrder_traversal(node.right);
        System.out.println(node.data);
    }

    Node addFromArray(int[] arr, int l ,int r){
        if(l> r){
            return null;
        }
        int m = (l+r)/2;

        Node node = new Node(arr[m]);
        node.left = addFromArray(arr,l,m-1);
        node.right = addFromArray(arr,m+1,r);
        return node;
    }

    void preOrderSt(){
        preOrderSt_traversal(root);
    }

    void preOrderSt_traversal(Node node){
        if(node == null){
            return;
        }

        Stack<Node> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            Node curr = st.pop();

            System.out.println(curr.data);
            if(curr.right != null) st.push(curr.right);
            if(curr.left != null) st.push(curr.left);
        }
    }

    void PostOrderST(){
        PostOrderST_Traversal(root);
    }
    void PostOrderST_Traversal(Node node){
        if(node == null) return;

        Stack<Node> st1 =new Stack<>();
        st1.push(root);
        Stack<Node> st2 = new Stack<>();

        while(!st1.isEmpty()){
            Node curr = st1.pop();
            st2.push(curr);
            if(curr.left != null) st1.push(curr.left);
            if(curr.right != null) st1.push(curr.right);
        }
while(!st2.isEmpty()){
    Node temp = st2.pop();
    System.out.println(temp.data);
}
    }
}
