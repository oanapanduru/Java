package hackerRankExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TODO:https://www.hackerrank.com/challenges/minimum-distances/problem
public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        int min = -1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<a.size();i++){
            if(!map.containsKey(a.get(i))){
                ArrayList<Integer>indices = new ArrayList<>();
                indices.add(i);
                map.put(a.get(i),indices);
            }
            else{
                ArrayList<Integer>indices = (ArrayList<Integer>) map.get(a.get(i));
                indices.add(i);
                map.put(a.get(i),indices);
                min = Integer.MAX_VALUE;
            }
        }

        if(min>-1) {
            for (Integer key : map.keySet()) {
                if (map.get(key).size() >= 2) {
                    for (int i = 0; i < map.get(key).size() - 1; i++) {
                        if (min > (map.get(key).get(i + 1) - map.get(key).get(i))) {
                            min = map.get(key).get(i + 1) - map.get(key).get(i);
                            //System.out.println(min);
                        }
                    }

                }

//            System.out.println(key + " " + map.get(key));
            }
        }
        return min;
    }
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        1 2 3 4 10
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        System.out.println(minimumDistances(list));
    }

}
