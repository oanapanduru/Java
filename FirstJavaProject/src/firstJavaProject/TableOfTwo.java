package firstJavaProject;

public class TableOfTwo {

	void printTableOfTwo() {
		printTableOfTwo(5);
	}
	
	void printTableOfTwo(int table) {
		printTableOfTwo(table, 1, 10);
	}
	
	void printTableOfTwo(int table, int from, int to) {
		for(int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table*i).println();
		}
	}
}