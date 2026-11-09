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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root, 0, targetSum);
    }

    public static Boolean pathSum(TreeNode node, int curSum, int targetSum){
        if(node == null) return false;

        curSum += node.val;
        if(node.left == null && node.right == null){
            return curSum == targetSum;
        }

        return pathSum(node.left, curSum, targetSum) ||
                pathSum(node.right, curSum, targetSum);
    }
}