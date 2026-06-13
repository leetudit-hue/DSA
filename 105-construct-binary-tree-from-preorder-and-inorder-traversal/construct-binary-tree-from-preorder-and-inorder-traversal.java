class Solution {
    public static TreeNode build(int[] pre, int prel, int preh,
        int[] in, int inl, int inh) {

        if (prel > preh || inl > inh) {
            return null;
        }

        TreeNode root = new TreeNode(pre[prel]);

        int i = inl;
        while (i <= inh && in[i] != pre[prel]) {
            i++;
        }

        int left = i - inl;

        root.left = build(pre,
                          prel + 1,
                          prel + left,
                          in,
                          inl,
                          i - 1);

        root.right = build(pre,
                           prel + left + 1,
                           preh,
                           in,
                           i + 1,
                           inh);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return build(preorder, 0, n - 1, inorder, 0, n - 1);
    }
}