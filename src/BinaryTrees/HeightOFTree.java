package BinaryTrees;

public class HeightOFTree {
    public static <T> int  height(BinaryTreeNode<T> root){
        if(root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1+Math.max(left,right);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,7,4,5,-1,-1,8,9,-1,-1,-1,-1,-1,-1,-1,-1};
        int[] arr2 = new int[]{5 ,6 ,10 ,2 ,3 ,-1 ,-1 ,-1 ,-1 ,-1 ,9 ,-1 ,-1};
        int[] arr3 = new int[]{10, 20, 30, 40, 50, -1, -1, -1, -1, -1, -1};
        int[] arr4 = new int[]{3,-1,-1};
        BinaryTreeNode<Integer> root = BinaryTreeInputLevelWise.takeInputLevel(arr,0);
        BinaryTreeNode<Integer> root2 = BinaryTreeInputLevelWise.takeInputLevel(arr2,0);
        BinaryTreeNode<Integer> root3 = BinaryTreeInputLevelWise.takeInputLevel(arr3,0);
        BinaryTreeNode<Integer> root4 = BinaryTreeInputLevelWise.takeInputLevel(arr4,0);

        System.out.println(height(root));
        System.out.println(height(root2));
        System.out.println(height(root3));
        System.out.println(height(root4));
    }
}
