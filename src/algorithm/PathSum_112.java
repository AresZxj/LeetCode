package algorithm;

//Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class PathSum_112 {
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root.left == null && root.right == null) {
			if(sum != root.val) {
				return false; 
			}
			return true;
		} else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
		
	}

}
