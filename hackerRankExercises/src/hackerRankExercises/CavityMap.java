package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.hackerrank.com/challenges/cavity-map/problem
public class CavityMap {
    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        List<String> map = new ArrayList<>();
//        map.add(grid.get(0));
//        map.add(grid.get(grid.size() - 1));
        for (int i = 0; i < grid.size(); i++) {
            map.add(grid.get(i));
        }

        for (int i = 1; i < grid.size() - 1; i++) {
            for (int j = 1; j < grid.get(0).length() - 1; j++) {
                if (Integer.parseInt(Character.toString(grid.get(i).charAt(j))) >
                        Integer.parseInt(Character.toString(grid.get(i - 1).charAt(j)))
                        &&
                        Integer.parseInt(Character.toString(grid.get(i).charAt(j))) >
                                Integer.parseInt(Character.toString(grid.get(i).charAt(j + 1)))

                        &&
                        Integer.parseInt(Character.toString(grid.get(i).charAt(j))) >
                                Integer.parseInt(Character.toString(grid.get(i + 1).charAt(j)))

                        &&
                        Integer.parseInt(Character.toString(grid.get(i).charAt(j))) >
                                Integer.parseInt(Character.toString(grid.get(i).charAt(j - 1)))

                ) {
//                    StringBuilder sb = new StringBuilder();
                    String s;
                    s = map.get(i).substring(0, j) + "X" + map.get(i).substring(j + 1);
//                    sb = new StringBuilder(grid.get(i).substring(0, j) + "X" + grid.get(i).substring(j + 1));
//                    map.add(i,sb.toString());
                    map.set(i, s);
                }
            }
        }

        return map;
    }


    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
//        grid.add("1112");
//        grid.add("1912");
//        grid.add("1892");
//        grid.add("1234");
//
//179443854
//961621369
//164139922
//968633951
//812882578
//257829163
//812438597
//176656233
//485773814
        Collections.addAll(grid, "179443854",
                "961621369",
                "164139922",
                "968633951",
                "812882578",
                "257829163",
                "812438597",
                "176656233",
                "485773814");
        System.out.println(cavityMap(grid));

    }
}
