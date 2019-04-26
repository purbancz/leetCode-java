package main.java.leetCode.Easy;

public class RangeSumOfBST {

//	Definition for
//	a binary
//	tree node.

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int rangeSumBST(TreeNode root, int L, int R) {
		int result = 0;
		if (root != null) {
			if (root.val >= L && root.val <= R) {
				result = root.val;
			}
			return result + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
		}
		return 0;

	}

}
