package BinaryTrees;

public class BinaryTreeInputLevelWise {
    public static BinaryTreeNode<Integer> takeInputLevel(int arr[],int i){
        if(i>=arr.length)
            return null;
        if(arr[i]==-1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[i]);
        root.left = takeInputLevel(arr,2*i+1);
        root.right = takeInputLevel(arr,2*i+2);
        return root;
    }
    public static <T> void   printtree(BinaryTreeNode<T> root ){
        if(root == null)
            return;
        System.out.print(root.data+":");
        if(root.left!=null)
            System.out.print("\t l"+root.left.data+",");
        if(root.right!=null)
            System.out.print("r"+root.right.data);
        System.out.println();
        printtree(root.left);
        printtree(root.right);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,7,4,5,-1,-1,8,9,-1,-1,-1,-1,-1,-1,-1,-1};
        BinaryTreeNode<Integer> root = takeInputLevel(arr,0);
        printtree(root);

    }
}
