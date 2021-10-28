package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.hackerrank.com/challenges/lisa-workbook/problem
public class LisasWorkbook {
    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int count = 0;
        int currPage = 0;
        for (int i = 0; i < arr.size(); i++) {
            currPage++;
            int max = arr.get(i);
            for (int j = 1; j <= max; j++) {
                if (j == currPage) {
                    count++;
                }
                if (j % k == 0 && j != max) {
                    currPage++;
                }
            }

//            if (arr.get(i) % k != 0) {
//                currPage++;
//            }
        }
        return count;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
//        arr.add(4);
//        4 2 6 1 10
//        arr.add(2);
//        arr.add(6);
//        arr.add(1);
//        arr.add(10);
        Collections.addAll(arr, 1, 29, 94, 15, 87, 100, 20, 55, 100, 45, 82, 80, 100, 100, 3, 53, 100, 2, 100, 100, 100, 100, 100, 100, 1);
        System.out.println(workbook(25, 10, arr));
    }
}
