package Testing_Garbages.trees;

public class BinaryTree {

    Node root;

    BinaryTree(){
        root = null;
    }

    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
