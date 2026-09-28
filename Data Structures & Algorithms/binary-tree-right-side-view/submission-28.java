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
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()){
                TreeNode rightSide = null;
                int qLen = queue.size();
                for(int i = 0; i < qLen; i++){
                    TreeNode node = queue.remove();

                    if(node != null){
                        rightSide = node;
                        queue.add(node.left);
                        queue.add(node.right);
                    }
            }

            if (rightSide != null) {
                arr.add(rightSide.val);
            }
        }

        return arr;
    }
}
