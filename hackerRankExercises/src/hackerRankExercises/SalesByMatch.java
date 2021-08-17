package hackerRankExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SalesByMatch {
//TODO:https://www.hackerrank.com/challenges/sock-merchant/problem

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here
		int pairs = 0;
		HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>();
		for (int i = 0; i < ar.size(); i++) {
			int sock = ar.get(i);
			if (socks.containsKey(sock)) {
				socks.put(sock, socks.get(sock) + 1);
			}
			if (!socks.containsKey(sock)) {
				socks.put(sock, 1);
			}
		}

		for (int i : socks.keySet()) {

			if (socks.get(i) % 2 == 0) {
				pairs = pairs + socks.get(i) / 2;
			} else {
				pairs = pairs + (socks.get(i) - 1) / 2;
			}
			System.out.println(i + " " + socks.get(i));
		}

		return pairs;
	}

	public static int sockMerchant2(int n, List<Integer> ar) {
		int pairs = 0;
		int count = 0;
		boolean found = false;

		List<Integer> number = new ArrayList<Integer>();
		for (int i = 0; i < ar.size(); i++) {
			int sock = ar.get(i);
			//count = 0;
			for (int j = i+1 ; j < ar.size(); j++) {
				if (ar.get(j)==sock) {
					count++;
					number.add(count);
					//found = true;
				}
			}
		}
	
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}
		return pairs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> socks = new ArrayList<Integer>();
		// 10 20 20 10 10 30 50 10 20
		socks.add(10);
		socks.add(20);
		socks.add(20);
		socks.add(10);
		socks.add(10);
		socks.add(30);
		socks.add(50);
		socks.add(10);
		socks.add(20);
		// System.out.println(sockMerchant(9, socks));
		sockMerchant2(9, socks);
	}

}
