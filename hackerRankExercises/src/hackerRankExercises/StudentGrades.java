package hackerRankExercises;

import java.util.ArrayList;
import java.util.List;

public class StudentGrades {

	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
	    //ArrayList<Integer> gradesRounded = new ArrayList<Integer>();
		for(int i = 0; i<grades.size(); i++){
            int difference = 0;
            int nextMultipleOfFive = 0;
            if(grades.get(i)>=38){
            if((grades.get(i) + 1)%5==0){
                nextMultipleOfFive = grades.get(i) + 1;
                grades.set(i,nextMultipleOfFive);
            }
            else if((grades.get(i) + 2)%5==0){
                nextMultipleOfFive = grades.get(i) + 2;
                grades.set(i,nextMultipleOfFive);
            }
            }
            else{
                grades.set(i,grades.get(i));
            }
            //if(grades.get(i)<40){
              //  grades.set(i,0);
           // }
        }
    return grades;
 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		//grades.add(23);
		List<Integer> gradesRounded =  gradingStudents(grades);
		for(int i=0; i<gradesRounded.size(); i++) {
			System.out.println(gradesRounded.get(i));
		}
	}

}
