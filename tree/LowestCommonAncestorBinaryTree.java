package tree;
import tree.BST;
public class LowestCommonAncestorBinaryTree {
	public Node lca(Node root, int n1, int n2)
	{
		if (root==null)
			return null;
		if(root.data == n1 || root.data == n2)
			return root;
		Node left = lca(root.left, n1,n2);
		Node right = lca(root.right, n1,n2);
		if (left!=null && right!=null)
			return root;
		else
			if (left!=null)
				return left;
			else return right;
	}
}
