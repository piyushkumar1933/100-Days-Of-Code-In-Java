package BinaryTrees;

public class PrintNodeAtDepthK {
    public static <T> void printAtK(BinaryTreeNode<T> root,int level){
        if(root == null || level<0)
            return;
        if(level == 0) {
            System.out.print(root.data + "\t");
            return;
        }
        printAtK(root.left,level-1);
        printAtK(root.right,level-1);

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
            printAtK(root4,0);
            System.out.println();
            printAtK(root3,2);
            System.out.println();
            printAtK(root,2);


    }
}
