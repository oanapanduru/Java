package practice;

//https://codingbat.com/prob/p107330
public class CodingBatp107330 {

    public static int bunnyEars2(int bunnies) {

        if (bunnies == 0)
            return 0;
        else {
            int ears = 0;
            if (bunnies % 2 == 0) {
                ears = ears + 3;
//                System.out.println("ears in even "+ ears );
            } else {
                ears = ears + 2;
//                System.out.println("ears in odd "+ ears );
            }
            return ears + bunnyEars2(bunnies - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(bunnyEars2(2));
    }
}
