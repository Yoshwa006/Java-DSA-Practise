package Tree;

import java.util.Scanner;

public class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    static class Tree {
        Node head = null;

        public void insert(int data) {
            head = insertRec(head, data);
        }

        private Node insertRec(Node root, int data) {
            if (root == null) {
                return new Node(data);
            }

            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }

            return root;
        }

        public void inorder() {
            inorderRec(head);
            System.out.println();
        }

        private void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }
        }
        public void printPretty() {
            printRec(head, 0);
        }

        private void printRec(Node root, int level) {
            if (root == null) return;

            printRec(root.right, level + 1);

            System.out.println("    ".repeat(level) + root.data);

            printRec(root.left, level + 1);
        }

        private void insertCont(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the values ->");
            System.out.println("Enter exit to exit");
            while(true){
                String d = sc.next();
                if(d.equals("exit") || d.equals("EXIT") || d.equals("Exit")){
                    break;
                }
                insert(Integer.parseInt(d));
            }
            printPretty();
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(3);
        tree.insert(6);
        tree.insert(9);
        tree.insertCont();
    }
}
