package hackerRankExercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TODO:https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem
public class OrganizingContainersOfBalls {
    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here
        int[] types = new int[container.size()];
        int[] capacities = new int[container.size()];

        for(int i=0; i<container.size(); i++){
            for(int j = 0; j<container.size();j++){
//                System.out.println("capacities[i]");
//                System.out.println(capacities[i]);
                capacities[i]+=container.get(i).get(j);
//                System.out.println(capacities[i]);
//                System.out.println("types[i]");
                types[i]+= container.get(j).get(i);
//                System.out.println(types[i]);

            }
        }
        Arrays.sort(types);
        Arrays.sort(capacities);
        for (int i=0; i<types.length; i++)
            if (types[i] != capacities[i])
                return "Impossible";

        return "Possible";

    }

    public static void main(String[] args) {
        List<List<Integer>> containers = new ArrayList<>();
        ArrayList<Integer>first = new ArrayList<>();
        first.add(0,1);
        first.add(1,4);
        ArrayList<Integer>second = new ArrayList<>();
        second.add(0,2);
        second.add(1,3);
        containers.add(0,first);
        containers.add(1,second);
        System.out.println(organizingContainers(containers));
    }
}
