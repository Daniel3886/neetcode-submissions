/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public static Boolean dfs(TreeNode root, int maxVal, int minVal){
        if (root == null) return true;

        if (!(minVal < root.val && root.val < maxVal)) {
            return false;
        }

        return dfs(root.left, root.val, minVal) &&
               dfs(root.right, maxVal, root.val);
    }
}
