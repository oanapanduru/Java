package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

//TODO:https://www.hackerrank.com/challenges/beautiful-triplets/problem
public class BeautifulTriplets {

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int count = 0;
        for(int i=0;i<arr.size()-2;i++){
            for(int j = i+1;(j< arr.size()-1) && (arr.get(i) >= arr.get(j) - d);j++){
                for(int k = j+1; k<arr.size() && (arr.get(j) >= arr.get(k) - d);k++){
                    if(arr.get(j)-arr.get(i)==d && arr.get(k)-arr.get(j)==d){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(10);
        System.out.println(beautifulTriplets(3,  arr));
    }
}
