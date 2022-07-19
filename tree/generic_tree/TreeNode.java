package tree.generic_tree;

public class TreeNode {
	private int data;
	
	protected TreeNode left;
	protected TreeNode right;
	
	public TreeNode(int data) {
		this.setData(data);
		this.left = null;
		this.right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
