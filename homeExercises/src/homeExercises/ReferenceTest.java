package homeExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReferenceTest {
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2, 3};
		int[] arr2 = new int[] {1, 2, 3, 4};
		arr1 = arr2;
		arr2 = new int[10];
		//System.out.println(Arrays.toString(arr1));
		//System.out.println(Arrays.toString(arr2));
		
		
		String s1 = "test" + "a" + "b";
		String s2 = "test" + "ab";
//		System.out.println(s1==s2);
//		System.out.println(s2);
		s1 = s2;
		s2 = s2 + "a";
//		System.out.println(s1);
//		System.out.println(s2);
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);

		list2.add(3);
		list2.add(4);
		
		list1 = list2;
		list2 = new ArrayList<>();

//		System.out.println(list1);
//		System.out.println(list2);
		
		Integer i1 = 5;
		Integer i2 = 7;
		
		i1 = i2;
		i2 = i2 + 5;
		System.out.println(i1);
		System.out.println(i2);
		
		
	}

}
