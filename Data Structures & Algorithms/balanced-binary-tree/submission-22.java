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

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return postorder(root) != -1;
    }


    public Integer postorder(TreeNode root){
        if (root == null) return 0;

        int distanceLeft = postorder(root.left);
        if(distanceLeft == -1) return -1;

        int distanceRight = postorder(root.right);
        if(distanceRight == -1) return -1;


        if(Math.abs(distanceLeft - distanceRight) > 1){
            return -1;
        }

        return Math.max(distanceLeft, distanceRight) + 1;
    }

}
