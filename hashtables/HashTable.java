package hashtables;

public class HashTable {
	
	private int[] hashTable;
	
	public HashTable() {
		hashTable = new int[10];
	}
	
	public void insert(int data) {
		int index = hashCode(data);
		
		hashTable[index] = data;
		
	}
	
	
	public void insertLinear(int data) { // Linear Probing
		int index = hashCode(data);
		
		for(int i = 0; i < hashTable.length; i++) {
			int idx = (index + i) % hashTable.length;
			
			if(hashTable[idx] == 0) {
				hashTable[idx] = data;
				break;
			}
		}
		
	}
	
	
	public int search(int data) {
		int index = hashCode(data);
		
		for(int i = 0; i < hashTable.length; i++) {
			int idx = (index + i) % hashTable.length;
			
			if(hashTable[idx] == data) {
				return hashTable[idx];
			}
		}
		
		return 0;
	}
	
	
	
	
	public int hashCode(int data) {
		return data % 10 ;
	}
	
	public void print() {
		for(int i = 0; i < hashTable.length; i++) {
			System.out.print(hashTable[i] + " ");
		}
		
		System.out.println();
	}
	
	
	
	
}
