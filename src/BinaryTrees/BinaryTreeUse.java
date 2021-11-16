package BinaryTrees;

import java.util.Scanner;

public class BinaryTreeUse {
    //Level wise input
    public static BinaryTreeNode<Integer> takeInputbetter(boolean isroot,int rootdata,boolean isLeft){
        if(isroot)
            System.out.println("Enter root data");
        else {
            if (isLeft)
                System.out.println("Enter Left root data of " + rootdata);
            else
                System.out.println("Enter Right root data of " + rootdata);
        }
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(data == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        root.left = takeInputbetter(false,data,true);
        root.right = takeInputbetter(false,data,false);
        return root;

    }
    public static BinaryTreeNode<Integer> takeInput(){
        System.out.println("Enter root data : ");
        Scanner sc = new Scanner(System.in);
        Integer rootdata = sc.nextInt();
        if(rootdata == -1)
            return null;
        BinaryTreeNode <Integer> root = new BinaryTreeNode<>(rootdata);
        root.left = takeInput();
        root.right = takeInput();
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
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> l1 = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> r1 = new BinaryTreeNode<>(3);
//        BinaryTreeNode<Integer> l11 = new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> lr11 = new BinaryTreeNode<>(5);
//        root.left = l1;
//        root.right = r1;
//        l1.left = l11;
//        r1.left = lr11;
        //BinaryTreeNode<Integer> root = takeInput();
        BinaryTreeNode<Integer> root = takeInputbetter(true,0,false);
        printtree(root);
    }
}
