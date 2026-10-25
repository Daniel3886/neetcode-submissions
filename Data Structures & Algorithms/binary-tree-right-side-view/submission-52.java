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
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            TreeNode rightSide = null;
            for(int i = q.size(); i > 0; i--){
                TreeNode node = q.remove();

                if(node != null){
                    rightSide = node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(rightSide != null){
                res.add(rightSide.val);
            }
        }


        return res;
    }
}
