class Solution {
    public static int height(TreeNode root){
        if(root == null) return -1;   // height in terms of edges
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);

        int throughRoot = height(root.left) + height(root.right) + 2;

        return Math.max(throughRoot, Math.max(leftDia, rightDia));
    }
}