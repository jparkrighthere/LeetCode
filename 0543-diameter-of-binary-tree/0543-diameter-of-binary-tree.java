class Solution {
    int count = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        recursive(root);
        return count;
    }

    public int recursive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = recursive(root.left);
        int right = recursive(root.right);

        count = Math.max(count, left + right);

        return Math.max(left,right) + 1;
    }
}