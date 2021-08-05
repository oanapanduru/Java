package tests;

public class PrintStaircase {

	public static void printStaircaseRight(int height) {
	int step = height-1;
		for(int i=0; i<height; i++) {
			//System.out.println(i);
			for(int j=0; j<height; j++) {
				if(j<step) {
					System.out.print(" ");
					System.out.print(j);
			}
				else {
					System.out.print("#");
				}	
		}
			System.out.println();
			step = step-1;
		}
		
	}
	
	public static void printStaircaseLeft(int height) {
		for(int i =0; i<height; i++) {
			for(int j=0; j<height; j++) {
				if(i>=j) {
					System.out.print("#");
					
				}
				else {
					System.out.print(" ");
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStaircaseRight(6);
		printStaircaseLeft(6);
	}

}
