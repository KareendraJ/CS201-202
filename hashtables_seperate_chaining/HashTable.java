package hashtables_seperate_chaining;

public class HashTable {
	private LinkedList[] hashTable;
	
	public HashTable() {
		hashTable = new LinkedList[10];
	}
	
	public void insert(int data) {
		int index = hashCode(data);
		
		if(hashTable[index] == null) {
			hashTable[index] = new LinkedList();
			
			hashTable[index].insert(data);
		}else {
			hashTable[index].insert(data);
		}
				
	}
	
	public void print() {
		for(int i = 0; i < hashTable.length; i++) {
			if(hashTable[i] == null) {
				System.out.println("-");
			}
			else {
				hashTable[i].printList();				
			}
		}
	}
	
	public int hashCode(int data) {
		return data % 10 ;
	}
	
	
}
