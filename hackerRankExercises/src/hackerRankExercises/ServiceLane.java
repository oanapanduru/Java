package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/service-lane/problem
public class ServiceLane {
    public static List<Integer> serviceLane(int n, List<List<Integer>> cases) {
        // Write your code here
        List<Integer> cars = new ArrayList<>();
        List<Integer> widths = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            widths.add(number);
        }
//        for(Integer I:widths){
//            System.out.println(I);
//        }
        for (int i = 0; i < cases.size(); i++) {
            List<Integer> sublist = new ArrayList<>();
            for (int j = cases.get(i).get(0); j <= cases.get(i).get(1); j++) {
//                System.out.println("this is j:"+j);
                sublist.add(widths.get(j));
//                System.out.println("this is widths.get(j) " + widths.get(j));

            }
//            for (Integer in : sublist) {
////                System.out.println("this is sublist" + in);
//            }
            int min = Integer.MAX_VALUE;
            for (int k = 0; k < sublist.size(); k++) {
                if (sublist.get(k) < min) {
                    min = sublist.get(k);
                }
            }
            cars.add(min);
        }

        return cars;
    }

    public static void main(String[] args) {
        List<List<Integer>> cases = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        cases.add(first);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(2);
        cases.add(second);
        System.out.println(serviceLane(4, cases));
    }

}
