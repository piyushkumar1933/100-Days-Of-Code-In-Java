package BinaryTrees;

public class RemoveLeafNodes {
    public static  BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if(root == null)
            return null;
        if(root.left == null && root.right == null)
            return null;
        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputbetter(true,0,false);
        root = removeLeaf(root);
        BinaryTreeUse.printtree(root);
    }
}
