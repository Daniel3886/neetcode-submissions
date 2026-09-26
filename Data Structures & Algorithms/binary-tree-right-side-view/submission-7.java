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
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();

        if(root != null){
            queue.add(root);
        }

        int level = 0;
        while(!queue.isEmpty()){
            level = queue.size(); // 5
            for(int i = 0; i < level; i++){
                TreeNode curr = queue.remove();
                
                if(curr.left != null) queue.add(curr.left);

                if(curr.right != null) queue.add(curr.right);

                if(i == level - 1) arr.add(curr.val);
            }
        }

        return arr;
    }
}
