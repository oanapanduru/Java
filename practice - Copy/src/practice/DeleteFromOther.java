package practice;

/*Given two arrays a and b, delete from the array a all the elements from array b. Print array a after you deleted the elements.
Example: a = [3,4,5,6,11,4]; b = [3,4,11]; 
Print: [5,6]*/

public class DeleteFromOther {

	public static void deleteFromOther() {
		int[] first = {3,4,5,6,11,4};
		int[] second = {3,4,11};
		boolean flag;
		if (first.length > 0 && second.length > 0) {
			for (int i = 0; i < first.length; i++) {
				flag = false;
				for (int j = 0; j < second.length; j++) {
					if (second[j] == first[i]) {
						flag = true;
					}	
				}
				if(flag == false) {
					System.out.println(first[i]);
				}
			}
			
		} 
		else if(second.length == 0 && first.length> 0) {
			for(int k=0; k<first.length; k++) {
			System.out.println(first[k]);
			}
		}
		else {
			System.out.println(" invalid ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deleteFromOther();
	}

}
