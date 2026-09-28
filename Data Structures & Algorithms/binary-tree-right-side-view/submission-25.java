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
    ArrayList<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(0, root);
        return res;
    }

    public void dfs(int depth, TreeNode root){
        if(root == null) return;

        if(depth == res.size()){
            res.add(root.val);
        }

        dfs(depth + 1, root.right);
        dfs(depth + 1, root.left);
    }
}
