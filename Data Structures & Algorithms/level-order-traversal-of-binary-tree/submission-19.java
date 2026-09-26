/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode() {}
 *     TreeNode right;
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root != null){
            queue.add(root);
        }

        int level = 0;
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            level = queue.size();
            for(int i = 0; i < level; i++) {
                TreeNode curr = queue.remove();
                if(curr != null) list.add(curr.val);

                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
                
            }
            arr.add(list);
        }
        

        return arr;
    }
}
