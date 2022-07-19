package tree.dfs_bfs;

import tree.queue.Queue;
import tree.stack.Stack;

public class Tree {
	private TreeNode root;
	
	public Tree() {
		this.root = null;
	}

	
	public void insert(int data) {
		root = insert(root, data);
	}
	
	public TreeNode insert(TreeNode root, int data) {
		if(root == null) {
			return new TreeNode(data);
		}
		
		if(root.getData() < data) {
			root.right = insert(root.right, data);
		}else {
			root.left = insert(root.left, data);
		}
		
		return root;
	}
	
	
	public boolean isEmpty() {
		if(root == null)
			return true;
		return false;
	}
	
	
	// insert
	
	public void print() {
//		inorder(root);
//		preorder(root);
		postorder(root);
	}
	
	public void inorder(TreeNode root) {
		if(root == null) return;
		
		inorder(root.left);
		System.out.println(root.getData());
		inorder(root.right);
		
	}
	
	public void preorder(TreeNode root) {
		if(root == null) return;
		
		System.out.println(root.getData());
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public void postorder(TreeNode root) {
		if(root == null) return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.getData());
		
	}
	
	public TreeNode search(int data) {
		return search(root, data);
	}
	
	public TreeNode search(TreeNode root, int data) {
		if(root == null)
			return null;
		
		if(root.getData() == data) {
			return root;
		}
		
		if(root.getData() < data) {
			return search(root.right, data);
		}else {
			return search(root.left, data);
		}

	}
	
	public void delete(int data) {
		root = delete(root, data);
	}
	
	public TreeNode delete(TreeNode root, int data) {
		if(root == null) 
			return null;
		
		if(root.getData() == data) {
			if(root.left == null && root.right == null) {
				return null;				
			}
			
			if (root.left == null && root.right != null) {				// has 1 child
				return root.right;				
				
			} else if (root.left != null && root.right == null) {
				return root.left;
				
			}else {		// has 3 children
				
//				if(root.getData() < this.root.getData()) {
					int leftLeaf = findLeftLeaf(root.right);
					
					delete(leftLeaf);
					
					TreeNode newNode = new TreeNode(leftLeaf);
					
					newNode.left = root.left;
					newNode.right = root.right;
					
					
					return newNode;
//				}else {
//					
//				}
				
			}
			
		}
		
		if(data > root.getData()) {
			root.right = delete(root.right, data);
		}else {
			root.left = delete(root.left, data);
		}
		
		
		return root;

	}
	
	
	
	private int findLeftLeaf(TreeNode root) {
		if(root.left == null && root.right == null) {
			return root.getData();
		}
		
		return findLeftLeaf(root.left);
		
	}
	
	public TreeNode dfs(int data) {
		Stack stack = new Stack();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop().getData();
			
			if(data == temp.getData()) {
				return temp;
			}
			
			if(temp.right != null) 
				stack.push(temp.right);
			
			if(temp.left != null) 
				stack.push(temp.left);
		}
		
		return null; 
		
	}
	
	
	
	public TreeNode bfs(int data) {
		Queue queue = new Queue();
		
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			TreeNode temp = queue.dequeue().getData();
			
			if(data == temp.getData()) {
				return temp;
			}
			
			if(temp.left != null) 
				queue.enqueue(temp.left);
			
			if(temp.right != null) 
				queue.enqueue(temp.right);
		}
		
		return null;
		
	}
	
	// BFS, DFS
	
}
