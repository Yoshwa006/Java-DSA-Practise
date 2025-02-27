package Tree;

import java.util.HashSet;
import java.util.Stack;

public class Binary {
    Node root;

    // Insert a node in the binary tree
    public Node insert(Node node, int data) {
        // If the tree is empty, return a new node
        if (node == null) {
            return new Node(data);
        }

        // Otherwise, recursively insert in the left or right subtree
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    // Inorder traversal (Left, Root, Right)
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Preorder traversal (Root, Left, Right)
    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Postorder traversal (Left, Right, Root)
    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Search for a value in the binary tree
    public boolean search(Node node, int key) {
        // Base Cases: node is null or data is present at node
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        }

        // Key is smaller, search in the left subtree
        if (key < node.data) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }


    }

    public static int CountUni(Node root) {
        if (root == null) return 0;
        int count = 0;

        HashSet<Integer> set = new HashSet<>();


        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if(set.contains(node.data)){
                count++;
            }
            set.add(node.data);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);


        }
        return count +1 ;
    }

    public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(5);
            root.right = new Node(5);
            root.left.left = new Node(5);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

        System.out.println(CountUni(root));

        }
}
