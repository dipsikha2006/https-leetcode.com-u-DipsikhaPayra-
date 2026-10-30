class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode root, int current) {
        if (root == null) {
            return 0;
        }

        current = current * 10 + root.val;


        if (root.left == null && root.right == null) {
            return current;
        }

        return helper(root.left, current) + helper(root.right, current);
    }
}