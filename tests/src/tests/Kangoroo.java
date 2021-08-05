package tests;

public class Kangoroo {

	 public static String kangaroo(int x1, int v1, int x2, int v2) {
		    // Write your code here
		 int currentPosX1 = x1;
		 int currentPosX2 = x2;
		 boolean flag = false; 
		 int count =0;
		 if(v1<=v2) {
			 flag=false;
		 }
		 else {
			 while(currentPosX1 != currentPosX2 && count<=10000) {
				 currentPosX1 = currentPosX1+v1;
				 currentPosX2 = currentPosX2+v2;
				 if(currentPosX1 == currentPosX2) {
					 flag = true;
				 }
				 count++;
			 }
			// if(currentPosX1 == currentPosX2) {
				// flag = true;
			 //}			
			 
		 }
		if(flag) { 
		return "YES";
		}
		else {
		return "NO";
		}
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kangaroo(43, 5, 49, 3));
	}

}
