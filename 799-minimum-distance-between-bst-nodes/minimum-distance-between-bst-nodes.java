
class Solution {
    public static void inorder(ArrayList<Integer>arr,TreeNode root){
        if(root == null) return;
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer>arr = new ArrayList<>();
        inorder(arr,root);
        int i = 1;
        int n = arr.size();
        int min = Integer.MAX_VALUE;
        while(i < n){
            min = Math.min(min,arr.get(i) - arr.get(i-1));
            i++;
        }
        return min;
    }
}