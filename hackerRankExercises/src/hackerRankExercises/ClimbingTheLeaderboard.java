package hackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClimbingTheLeaderboard {

	// TODO:https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		// Write your code here
		List<Integer> ranking = new ArrayList<Integer>();
		List<Integer> rankedPlayers = new ArrayList<Integer>();
		rankedPlayers.add(ranked.get(0));
        System.out.println(rankedPlayers.get(0));
		int i = 0;
		for (Integer score : ranked) {
			System.out.println(rankedPlayers.get(i) + " " + score + " " + rankedPlayers.get(i).equals(score) + " " + (rankedPlayers.get(i) == score));
			if (!rankedPlayers.get(i).equals(score)) {
                rankedPlayers.add(score);
                i++;
//                System.out.println(score);
            }
		}
		int rank = 0;
		for(Integer score: player) {
			if(rankedPlayers.contains(score)) {
				rank = rankedPlayers.indexOf(score)+1;
				ranking.add(rank);
			}
			else  {
				rank = searchInsert(rankedPlayers, score) +1;
				ranking.add(rank);
			}
		}
		return ranking;
	}

	 public static int searchInsert(List<Integer> nums, int target) {
	        int low = 0;
	        int high = nums.size()-1;
	        int mid;
	        while(low<=high){
	            mid = (low + high)/2;
	            if(target==nums.get(mid)){
	                return mid;
	            }
	            if(nums.get(mid)>target){
	                low=mid+1;
	            }
	            else{
	                high = mid-1;
	            }
	        }
	        return low;
	    }
	
	
	
	
	
	
	public static void main(String[] args) {
		Integer x = 295;
		Integer y = 295;
		System.out.println(x == y);
		// TODO Auto-generated method stub
		List<Integer> ranked = new ArrayList<Integer>();
		Collections.addAll(ranked, 295, 295, 294, 291, 287, 287, 285, 285, 284, 283, 279, 277, 274, 274, 271, 270, 268, 268, 268, 264, 260, 259, 258, 257, 255, 252, 250, 244, 241, 240, 237, 236, 236, 231, 227, 227, 227, 226, 225, 224, 223, 216, 212, 200, 197, 196, 194, 193, 189, 188, 187, 183, 182, 178, 177, 173, 171, 169, 165, 143, 140, 137, 135, 133, 130, 130, 130, 128, 127, 122, 120, 116, 114, 113, 109, 106, 103, 99, 92, 85, 81, 69, 68, 63, 63, 63, 61, 57, 51, 47, 46, 38, 30, 28, 25, 22, 15, 14, 12, 6, 4);
		List<Integer> player = new ArrayList<Integer>();
		Collections.addAll(player, 5, 5, 6, 14, 19, 20, 23, 25, 29, 29, 30, 30, 32, 37, 38, 38, 38, 41, 41, 44, 45, 45, 47, 59, 59, 62, 63, 65, 67, 69, 70, 72, 72, 76, 79, 82, 83, 90, 91, 92, 93, 98, 98, 100, 100, 102, 103, 105, 106, 107, 109, 112, 115, 118, 118, 121, 122, 122, 123, 125, 125, 125, 127, 128, 131, 131, 133, 134, 139, 140, 141, 143, 144, 144, 144, 144, 147, 150, 152, 155, 156, 160, 164, 164, 165, 165, 166, 168, 169, 170, 171, 172, 173, 174, 174, 180, 184, 187, 187, 188, 194, 197, 197, 197, 198, 201, 202, 202, 207, 208, 211, 212, 212, 214, 217, 219, 219, 220, 220, 223, 225, 227, 228, 229, 229, 233, 235, 235, 236, 242, 242, 245, 246, 252, 253, 253, 257, 257, 260, 261, 266, 266, 268, 269, 271, 271, 275, 276, 281, 282, 283, 284, 285, 287, 289, 289, 295, 296, 298, 300, 300, 301, 304, 306, 308, 309, 310, 316, 318, 318, 324, 326, 329, 329, 329, 330, 330, 332, 337, 337, 341, 341, 349, 351, 351, 354, 356, 357, 366, 369, 377, 379, 380, 382, 391, 391, 394, 396, 396, 400);
		System.out.println(climbingLeaderboard(ranked, player));
	}

}
