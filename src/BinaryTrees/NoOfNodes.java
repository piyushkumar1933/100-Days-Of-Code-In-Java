package BinaryTrees;
public class NoOfNodes {
    public static int count(BinaryTreeNode<Integer> root){
        if(root ==null)
            return 0;
        int left = count(root.left);
        int right = count(root.right);
        return 1+left+right;
    }
    public static int sum(BinaryTreeNode<Integer> root){
        if(root ==null)
            return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        return root.data+left+right;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,7,4,5,-1,-1,8,9,-1,-1,-1,-1,-1,-1,-1,-1};
        BinaryTreeNode<Integer> root = BinaryTreeInputLevelWise.takeInputLevel(arr,0);
        System.out.println(count(root));
        System.out.println(sum(root));
    }
}
