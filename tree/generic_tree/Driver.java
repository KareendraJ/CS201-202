package tree.generic_tree;

public class Driver {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.insert(10);
		tree.insert(1);
		tree.insert(13);
		tree.insert(7);
		tree.insert(99);
		tree.insert(70);
		
//		tree.print();
		
		TreeNode searchResult = tree.search(100);
		
		if(searchResult == null) {
			System.out.println("NULL");
		}else 
			System.out.println(searchResult.getData());
		
		
	}

}
