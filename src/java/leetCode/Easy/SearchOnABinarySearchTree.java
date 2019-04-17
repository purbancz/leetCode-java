package java.leetCode.Easy;

public class SearchOnABinarySearchTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
	        return null;
	        } 
	        if (val == root.val) {
	        return root;
	        }
	        return val < root.val
	        ? searchBST(root.left, val)
	        : searchBST(root.right, val);
	        
//		if (val == root.val) {
//			return root;
//		} else {
//			return searchBST(root.left, val);
//		}
		
	}
}
