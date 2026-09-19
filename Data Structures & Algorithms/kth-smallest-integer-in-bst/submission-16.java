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

    ArrayList<Integer> arr = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        int result = root.val;

        inorder(root);
        Collections.sort(arr);
        
        for(int i = 0; i < k; i++){
            result = arr.get(i);
        }

        return result;
    }

    public List<Integer> inorder(TreeNode root){
        if(root == null){
            return null;
        }

        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);

        return arr;
    }
}
