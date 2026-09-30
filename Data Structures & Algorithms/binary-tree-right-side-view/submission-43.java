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
            TreeNode right = null;
            int lvl = queue.size();
            for(int i = 0; i < lvl; i++){
                TreeNode node = queue.remove();
                right = node;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            if(right != null){
                res.add(right.val);
            }
        }

        return res;
    }
}
