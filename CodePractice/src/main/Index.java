package main;

import dataTypes.*;

public class Index {
    public static void main(String[] args) {
        // Create two binary trees for testing
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        // Create an instance of CompareTreeNode to test the isSameTree method
        CompareTreeNode compareTreeNode = new CompareTreeNode();

        // Test the isSameTree method
        boolean areSame = compareTreeNode.isSameTree(tree1, tree2);

        // Display the result
        if (areSame) {
            System.out.println("The two binary trees are the same.");
        } else {
            System.out.println("The two binary trees are NOT the same.");
        }
    }
}
