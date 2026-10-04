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
    public int goodNodes(TreeNode root) {

        if(root == null){
            return 0;
        }

        int count = 0;
        Queue<TreeNode> q= new LinkedList<>();
        Queue<Integer> max = new LinkedList<>();

        q.add(root);
        max.add(root.val);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            int maxi = max.poll();

            if(node.val >= maxi){
                count++;
            }
            maxi = Math.max(maxi,node.val);

            if(node.left != null){
                q.add(node.left);
                max.add(maxi);
            }
            if(node.right != null){
                q.add(node.right);
                max.add(maxi);
            }

        }
        return count;

        
    }
}
