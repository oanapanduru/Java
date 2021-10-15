package hackerRankExercises;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueensAttackII {
// TODO:https://www.hackerrank.com/challenges/queens-attack-2/problem

	public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
		// Write your code here

		int attacks = 0;
		int queenRow = n - r_q;
		int queenCol = c_q - 1;
		int[][] closest = new int[8][2];
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 2; j++) {
				closest[i][j] = -1;
			}
		}
		for (int i = 0; i < k; i++) {
			int obRow = n - obstacles.get(i).get(0);
			int obCol = obstacles.get(i).get(1) - 1;
			if(obRow == queenRow) {
				if(obCol < queenCol) {
					if(closest[6][1] == -1 || closest[6][1] < obCol) {
						closest[6][0] = obRow;
						closest[6][1] = obCol;
					}
				}
				else if(obCol > queenCol) {
					if(closest[2][1] == -1 || closest[2][1] > obCol) {
						closest[2][0] = obRow;
						closest[2][1] = obCol;
					}
				}
			}
			else if(obCol == queenCol) {
				if(obRow < queenRow) {
					if(closest[0][0] == -1 || closest[0][0] < obRow) {
						closest[0][0] = obRow;
						closest[0][1] = obCol;
					}
				}
				else if(obRow > queenRow) {
					if(closest[4][0] == -1 || closest[4][0] > obRow) {
						closest[4][0] = obRow;
						closest[4][1] = obCol;
					}
				}
			}
			else if(queenRow - queenCol == obRow - obCol) {
				if(obRow < queenRow) {
					if(closest[7][0] == -1 || closest[7][0] < obRow) {
						closest[7][0] = obRow;
						closest[7][1] = obCol;
					}
				}
				else if(obRow > queenRow) {
					if(closest[3][0] == -1 || closest[3][0] > obRow) {
						closest[3][0] = obRow;
						closest[3][1] = obCol;
					}
				}
			}
			else if(queenRow + queenCol == obRow + obCol) {
				if(obRow < queenRow) {
					if(closest[1][0] == -1 || closest[1][0] < obRow) {
						closest[1][0] = obRow;
						closest[1][1] = obCol;
					}
				}
				else if(obRow > queenRow) {
					if(closest[5][0] == -1 || closest[5][0] > obRow) {
						closest[5][0] = obRow;
						closest[5][1] = obCol;
					}
				}
			}
		}
		if(closest[0][0] != -1) {
			attacks += queenRow - closest[0][0] - 1;
		} else {
			attacks += queenRow;
		}
		if(closest[1][0] != -1) {
			attacks += queenRow - closest[1][0] - 1;
		} else {
			attacks += queenRow;
		}
		if(closest[2][0] != -1) {
			attacks += closest[2][1] - queenCol - 1;
		} else {
			attacks += n - queenRow - 1;
		}
		if(closest[3][0] != -1) {
			attacks += closest[3][1] - queenCol - 1;
		} else {
			attacks += n - queenRow - 1;
		}
		if(closest[4][0] != -1) {
			attacks += closest[4][0] - queenRow - 1;
		} else {
			attacks += n - queenRow - 1;
		}
		if(closest[5][0] != -1) {
			attacks += closest[5][0] - queenRow - 1;
		} else {
			attacks += n - queenRow - 1;
		}
		if(closest[6][0] != -1) {
			attacks += queenCol - closest[6][1] - 1;
		} else {
			attacks += queenRow;
		}
		if(closest[7][0] != -1) {
			attacks += queenCol - closest[7][1] - 1;
		} else {
			attacks += n - queenRow - 1;
		}

		return attacks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\Oana\\eclipse-workspace\\hackerRankExercises\\src\\hackerRankExercises\\input.txt";
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filename));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int r_q = scanner.nextInt();
		int c_q = scanner.nextInt();
		List<List<Integer>> obstacles = new ArrayList<List<Integer>>();
		int i = 0;
		while (i < k) {
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			obstacles.add(new ArrayList<Integer>());
			obstacles.get(i).add(row);
			obstacles.get(i).add(column);
			i++;
		}

		System.out.println(queensAttack(n, k, r_q, c_q, obstacles));
	}

}
