package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {
	// https://www.hackerrank.com/challenges/bon-appetit/problem

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		int charged = 0;
		int actual = 0;
		int total = 0;
		for(int i=0; i<bill.size(); i++) {
			if(i!=k) {
				total = total + bill.get(i);
				System.out.println(total);
			}
			//else {
				//total= total + total + bill.get(i)/2;
			//}
		}
		if(total/2==b) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println(b-(total/2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);
		bonAppetit(bill,1,12);
	}

}
