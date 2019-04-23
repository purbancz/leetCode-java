package main.java.leetCode.Easy;

public class UnivaluedBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isUnivalTree(TreeNode root) {
		boolean checkLeft = (root.left == null || (root.val == root.left.val && isUnivalTree(root.left)));
		boolean checkRight = (root.right == null || (root.val == root.right.val && isUnivalTree(root.right)));
		return checkLeft && checkRight;
		}
}
