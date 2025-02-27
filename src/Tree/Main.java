package Tree;

import com.sun.source.tree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        Binary tree = new Binary();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Inorder traversal:");
        tree.inorderTraversal(tree.root);

        System.out.println("\nPreorder traversal:");
        tree.preorderTraversal(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal(tree.root);

        System.out.println("\nSearching for 40: " + tree.search(tree.root, 40));
        System.out.println("Searching for 90: " + tree.search(tree.root, 32));
    }
}
