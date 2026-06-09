
class Solution {
    public static int height(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root){
        if(root == null) return 0;
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int curr = height(root.left) + height(root.right);
        return Math.max(left,Math.max(right,curr));
    }
}