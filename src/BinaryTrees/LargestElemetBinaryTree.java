package BinaryTrees;

public class LargestElemetBinaryTree {
    public  static int largest(BinaryTreeNode<Integer> root){
        if(root==null)
            return Integer.MIN_VALUE;
        int left = largest(root.left);
        int right = largest(root.right);
        //return root.data>left?(root.data>right?root.data : right>left?right:left):left>right?left:right;
        return Math.max(root.data,Math.max(left,right));
    }
    public static void main(String[] args) {
        int[] arr = new int[]{11,2,3,6,7,4,5,-1,-1,8,9,-1,-1,-1,-1,-1,-1,-1,-1};
        BinaryTreeNode<Integer> root = BinaryTreeInputLevelWise.takeInputLevel(arr,0);
        System.out.println(largest(root));
    }
}
