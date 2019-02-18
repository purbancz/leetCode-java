package leetCode.Easy;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

///should be recursive

public class MergeTwoBinaryTrees {
//	public TreeNode addNodes(TreeNode t1, TreeNode t2) {
//		TreeNode tMerged = new TreeNode(t1.val + t2.val);
//		return tMerged;
//	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
//        TreeNode tMerged = new TreeNode(0);
//        if (t1 == null) {
//        	tMerged = t2;
//        }
//        if (t2 == null) {
//        	tMerged = t1;
//        }
//        tMerged.val = t1.val + t2.val;
//        tMerged.left = mergeTrees(t1.left, t2.left);
//        tMerged.right = mergeTrees(t1.right, t2.right);
//        return tMerged;

//        tMerged.left = addNodes(t1.left, t2.left);
//        tMerged.right = addNodes(t1.right, t2.right);
//		return tMerged;
	}
}
