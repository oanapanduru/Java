package practice;

public class Test {
	public static void findMin() {
		int[] first = {2,5,7,1,9,0};
		int min=first[0];
		for(int i=1; i<first.length; i++) {
			if(min>first[i]) {
				min= first[i];
			}
		}
		System.out.println(min);
	}
	
	public static void findCommonElements() {
		int[] first = {2,3,5,8,9,0};
		int[] second = {2,4,5,6,8};
		int count =0;
		for (int i =0; i<first.length; i++) {
			for(int j = 0; j<second.length; j++) {
				if(first[i]==second[j]) {
					count++;
				}
			}
			
		}
		System.out.println(count);
	}
	
	public static void findDifferentFromFirst() {
		int[] first = {2,3,5,8,9,0};
		int[] second = {2,4,5,6,8};
		int count= 0;	
		for (int i =0; i<first.length; i++) {
			boolean flag = false;
			for(int j = 0; j<second.length; j++) {
				if(first[i]==second[j]) {
					flag = true;
				}	
			}
			if(flag == false)
				count++;
		}
		System.out.println(count);
	}
	
	public static void findDifferentFromBoth() {
		int[] first = {2,3,5,8,9,0};
		int[] second = {2,4,5,6,8};
		int count= 0;	
		for (int i =0; i<first.length; i++) {
			boolean flag = false;
			for(int j = 0; j<second.length; j++) {
				if(first[i]==second[j]) {
					flag = true;
				}	
			}
			if(flag == false)
				count++;
		}
		for (int i =0; i<second.length; i++) {
			boolean flag = false;
			for(int j = 0; j<first.length; j++) {
				if(second[i]==first[j]) {
					flag = true;
				}	
			}
			if(flag == false)
				count++;
		}
		
		System.out.println(count);
		
	}
	
	public static void findCommonFromBoth() {
		int[] first = {2,3,5,8,9,0};
		int[] second = {2,4,5,6,8};
		//2,3,4,5,6,8,9,0
		int count= 0;	
		for (int i =0; i<first.length; i++) {
			boolean flag = false;
			for(int j = 0; j<second.length; j++) {
				if(first[i]==second[j]) {
					flag = true;
				}	
			}
			if(flag == false)
				count++;
		}
		/*
		 * for (int i =0; i<second.length; i++) { boolean flag = false; for(int j = 0;
		 * j<first.length; j++) { if(second[i]==first[j]) { flag = true; count++; } }
		 * if(flag == false) count++; }
		 */
		count = count+second.length;
		System.out.println(count);
		
	}
	
	public static void findOddNumber() {
		boolean flag = false;
		int[]numbers= {4,6,8};
		for(int i =0; i<numbers.length;i++) {
			if(numbers[i]%2!=0) {
				flag = true;
			}
		}
		System.out.println(flag);
	}
	
	public static void findPrimeNumber(int number) {
		boolean flag = true;
		for(int i=2; i<number/2; i++) {
			if(number%i==0) {
				flag=false;
			}
		}
		System.out.println(flag);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findMin();
		//findCommonElements();
		//findDifferentFromFirst();
		//findDifferentFromBoth();
		//findCommonFromBoth();
		//findOddNumber();
		findPrimeNumber(3);
	}

}
