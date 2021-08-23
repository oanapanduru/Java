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
		for(int i =0; i<=100; i++) {
			number.add(i, 0);
		}
		for (int i = 0; i < ar.size(); i++) {
			int sock = ar.get(i);
			number.set(sock, number.get(sock)+1);
		}

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	//	for (int i = 0; i < number.size(); i++) {
		//	System.out.println(number.get(i));
		//}
		for (int i : number) {

			if (i % 2 == 0) {
				pairs = pairs + i / 2;
			} else {
				pairs = pairs + (i - 1) / 2;
			}
			//System.out.println( i);
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
		System.out.println(sockMerchant2(9, socks));
	}

}
