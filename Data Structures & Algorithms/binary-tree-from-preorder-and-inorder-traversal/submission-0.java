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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,0,inorder.length-1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int preIndex, int inStart, int inEnd){

        if(inStart > inEnd){
            return null;
        }

        int rootVal = preorder[preIndex];
        TreeNode root = new TreeNode(rootVal);

        int i =  inStart;

        while(inorder[i] !=rootVal){
            i++;
        }
        int leftSize = i - inStart;
        root.left = build(preorder, inorder,preIndex+1,inStart, i-1);

        root.right = build(preorder, inorder,preIndex+leftSize+1,i+1,inEnd);

        return root;
    }

}
