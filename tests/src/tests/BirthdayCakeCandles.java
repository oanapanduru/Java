package tests;
import java.util.ArrayList;
import java.util.List;
public class BirthdayCakeCandles {

	public static int birthdayCakeCandles(List<Integer> candles) {
	    // Write your code here
		int count=0;
		int maxHigh =0;
		for(int i=0; i<candles.size(); i++) {
			if(candles.get(i)>maxHigh) {
				maxHigh = candles.get(i);
			}
		}
		for(int i =0; i<candles.size(); i++) {
			if(maxHigh == candles.get(i)) {
				count++;
			}
		}
		System.out.println(maxHigh);
		return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(7);
		System.out.println(birthdayCakeCandles(list));
	}

}
