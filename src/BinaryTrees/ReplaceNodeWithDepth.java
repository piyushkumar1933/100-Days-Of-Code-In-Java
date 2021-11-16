package BinaryTrees;

public class ReplaceNodeWithDepth {
    public static  void replaceWithDepth(BinaryTreeNode<Integer> root,int level){
        if(root == null)
            return;
        root.data = level;
        replaceWithDepth(root.left,level+1);
        replaceWithDepth(root.right,level+1);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,7,4,5,-1,-1,8,9,-1,-1,-1,-1,-1,-1,-1,-1};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, -1, -1, -1, -1, -1, -1, -1, -1};
        int[] arr3 = new int[]{2, 35, 10, 2, 3, 5, 2, -1, -1, -1, -1, -1, -1, -1, -1 };
        int[] arr4 = new int[]{3,-1,-1};
        BinaryTreeNode<Integer> root = BinaryTreeInputLevelWise.takeInputLevel(arr,0);
        BinaryTreeNode<Integer> root2 = BinaryTreeInputLevelWise.takeInputLevel(arr2,0);
        BinaryTreeNode<Integer> root3 = BinaryTreeInputLevelWise.takeInputLevel(arr3,0);
        BinaryTreeNode<Integer> root4 = BinaryTreeInputLevelWise.takeInputLevel(arr4,0);

        replaceWithDepth(root4,0);
        TreeTraversel.inOrder(root4);

        replaceWithDepth(root3,0);
        TreeTraversel.inOrder(root3);

        replaceWithDepth(root2,0);
        TreeTraversel.inOrder(root2);
    }
}
