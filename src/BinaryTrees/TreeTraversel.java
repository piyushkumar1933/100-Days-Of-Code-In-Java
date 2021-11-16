package BinaryTrees;

public class TreeTraversel {
    public static <T> void preOrder(BinaryTreeNode<T> root){
        if(root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static <T> void inOrder(BinaryTreeNode<T> root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static <T> void postOrder(BinaryTreeNode<T> root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }



    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,7,4,5,-1,-1,8,9,-1,-1,-1,-1,-1,-1,-1,-1};
        BinaryTreeNode<Integer> root = BinaryTreeInputLevelWise.takeInputLevel(arr,0);
        preOrder(root);
        inOrder(root);
        postOrder(root);
    }
}
