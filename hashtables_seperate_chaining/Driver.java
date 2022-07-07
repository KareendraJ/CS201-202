package hashtables_seperate_chaining;

public class Driver {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		
		hashTable.insert(35);
		hashTable.insert(11);
		hashTable.insert(84);
		hashTable.insert(99);
		hashTable.insert(100);
		hashTable.insert(22);
		
		
		hashTable.insert(959);
		
		hashTable.insert(111);
		hashTable.insert(9432);
		
		hashTable.print();
		
		
//		System.out.println(hashTable.search(959));
		
	}

}
