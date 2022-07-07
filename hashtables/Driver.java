package hashtables;

public class Driver {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		
		hashTable.insertLinear(35);
		hashTable.insertLinear(11);
		hashTable.insertLinear(84);
		hashTable.insertLinear(99);
		hashTable.insertLinear(100);
		hashTable.insertLinear(22);
		
		
		hashTable.insertLinear(959);
		
		hashTable.print();
		
		
		System.out.println(hashTable.search(959));
		
	}

}
