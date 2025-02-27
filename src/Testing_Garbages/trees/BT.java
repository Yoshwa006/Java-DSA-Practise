package Testing_Garbages.trees;

public class BT {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);

        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);

        tree.root.left.left.left = new Node(80);
        tree.root.left.left.right = new Node(90);
        tree.root.left.right.left = new Node(100);
        tree.root.left.right.right = new Node(110);

        tree.root.right.left.left = new Node(120);
        tree.root.right.left.right = new Node(130);
        tree.root.right.right.left = new Node(140);
        tree.root.right.right.right = new Node(150);


        tree.inorder(tree.root);


    }

    }