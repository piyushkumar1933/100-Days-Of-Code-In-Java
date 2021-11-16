package BinaryTrees;


public class NodesGreaterThanX {
    public static int greaterX(BinaryTreeNode<Integer>root,int x){
        if(root == null)
            return 0;
        int left = greaterX(root.left,x);
        int right = greaterX(root.right,x);
        if(root.data>x)
            return left+right+1;
        return left+right;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,7,4,5,-1,-1,8,9,-1,-1,-1,-1,-1,-1,-1,-1};
        int[] arr2 = new int[]{5 ,6 ,10 ,2 ,3 ,-1 ,-1 ,-1 ,-1 ,-1 ,9 ,-1 ,-1};
        BinaryTreeNode<Integer> root = BinaryTreeInputLevelWise.takeInputLevel(arr,0);
        BinaryTreeNode<Integer> root2 = BinaryTreeInputLevelWise.takeInputLevel(arr2,0);
        System.out.println(greaterX(root,1));
        System.out.println(greaterX(root2,5));
    }
}
