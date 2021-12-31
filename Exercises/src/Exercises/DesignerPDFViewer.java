package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesignerPDFViewer {
	// TODO:https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

	public static int designerPdfViewer(List<Integer> h, String word) {
		// Write your code here
		int area = 0;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int[] values = new int[word.length()];
		for (int i = 0; i < word.length(); i++) {
			if (alphabet.indexOf(word.charAt(i)) > -1) {
				values[i] = alphabet.indexOf(word.charAt(i));
			}
		}
		int[] coresponding = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			coresponding[i] = h.get(values[i]);
		}

		int max = 0;
		for (int i = 0; i < coresponding.length; i++) {
			if (coresponding[i] > max) {
				max = coresponding[i];
			}
		}
		area = max * word.length();
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
		System.out.println(designerPdfViewer(list, "abc"));
	}

}
