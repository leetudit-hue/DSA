
class Solution {
    public static void inorder(ArrayList<Integer>arr,TreeNode root){
        if(root == null) return;
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);
    }
    public static boolean isSorted(ArrayList<Integer>arr){
        int i = 1;
        int n = arr.size();
        while(i < n){
            if(arr.get(i)<=arr.get(i-1)){
                return false;
            }
            i++;
        }
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer>arr = new ArrayList<>();
        inorder(arr,root);
        return isSorted(arr);
    }
}