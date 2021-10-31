package hackerRankExercises;

import java.util.List;

public class FairRations {
    public static String fairRations(List<Integer> B) {
        int oddNo = 0;
        int n = B.size();
        for(int i = 0; i < n; i++) {
            if(B.get(i) % 2 == 1) {
                oddNo++;
            }
        }
        if(oddNo % 2 == 1) {
            return "NO";
        } else {
            int i = 0;
            int sum = 0;
            while( i < n ) {
                if(B.get(i) % 2 == 1) {
                    int j = i + 1;
                    while( B.get(j) % 2 == 0 && j < n) {
                        j++;
                    }
                    sum += j - i;
                    i = j;
                }
                i++;
            }
            return (sum * 2) + "";
        }

    }
}
