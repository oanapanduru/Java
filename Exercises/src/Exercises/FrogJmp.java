package practice;

//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        int jumps = 0;
        if((Y-X)%D==0){
            jumps = (Y-X)/D;
        }
        else{
            jumps = ( (Y-X)/D)+1;
        }

        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

}
