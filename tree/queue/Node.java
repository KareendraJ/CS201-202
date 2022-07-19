package tree.queue;

import tree.dfs_bfs.TreeNode;

public class Node {
	private TreeNode data;
	protected Node next;
	
	public Node(TreeNode data) {
		this.data = data;
		this.next = null;
	}

	public TreeNode getData() {
		return data;
	}

	public void setData(TreeNode data) {
		this.data = data;
	}
	
}
