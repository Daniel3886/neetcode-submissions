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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root != null) queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            TreeNode rightSide = null;
            for(int i = 0; i < level; i++){
                TreeNode curr = queue.poll();
                rightSide = curr;
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }

            if(rightSide != null){
                res.add(rightSide.val);
            }
        }

        return res;
    }
}
