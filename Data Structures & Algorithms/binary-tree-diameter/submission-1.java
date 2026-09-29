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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }     

        Stack<TreeNode> stack = new Stack<>();
        HashMap<TreeNode , Integer> height = new HashMap<>();

        stack.push(root);
        int diameter = 0;

        while(!stack.isEmpty()){
            TreeNode node = stack.peek();

            if(node.left != null && !height.containsKey(node.left)){
                stack.push(node.left);
            }else if(node.right != null && !height.containsKey(node.right)){
                stack.push(node.right);
            }
            else{
                stack.pop();

                int left = height.getOrDefault(node.left,0);
                int right = height.getOrDefault(node.right,0);

                diameter = Math.max(diameter,left+right);
                height.put(node,1 + Math.max (left,right));
            }   
        }
        return diameter;
    }
}
