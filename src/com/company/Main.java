package com.company;

public class Main {

    public static void main(String[] args) {

        BST intTree = new BST(10);
        intTree.left =new BST(5);
        intTree.left =new BST(2);
        intTree.left =new BST(1);
        intTree.left.right =new BST(5);
        intTree.right =new BST(15);
        intTree.right.right =new BST(22);
        intTree.right.left =new BST(13);
        intTree.right.left.right =new BST(14);

        int a = 12;

        System.out.println(findClosestValueInBst(intTree,a));

    }

    public static int findClosestValueInBst(BST tree, int target) {

        if(tree == null) {
            return -1;
        }


        int closestVal = Integer.MAX_VALUE;

        while(tree != null) {
            int diff = Math.abs(tree.value - target);
            int minDiff = Math.abs(closestVal-target);
            if(minDiff > diff) {
                closestVal = tree.value;
                //minDiff = diff;
            }

            if(target >= tree.value) {
                tree = tree.right;
            }else {
                tree = tree.left;
            }
        }

        return closestVal;

    }

    static class BST{

        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }


    }
}
