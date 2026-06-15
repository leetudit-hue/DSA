
class Solution {
    public static int paths(TreeNode root, long sum){
        if(root == null) return 0;
        int count = 0;
        if(root.val == sum){
            count++;
        }
        return count + (paths(root.left,sum-root.val)+(paths(root.right,sum-root.val)));
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int count = paths(root,targetSum);
        count += (pathSum(root.left,targetSum) + pathSum(root.right,targetSum));
        return count;
    }
}