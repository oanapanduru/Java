package hackerRankExercises;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/happy-ladybugs/problem
public class HappyLadybugs {

    public static String happyLadybugs(String b) {
        String result = "YES";
        boolean hasUnderscore = false;
        boolean isHappy = true;
        boolean canBeHappy = true;
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            char thisChar = b.charAt(i);
            if(b.length() > 1 && i == 0 && thisChar != b.charAt(i+1) && thisChar != '_') {
                isHappy = false;
            }
            if( b.length() > 1 && i == b.length() - 1 && thisChar != b.charAt(i-1) && thisChar != '_') {
                isHappy = false;
            }
            if( i > 0 && i < b.length() - 1 ) {
                if(thisChar != b.charAt(i-1) && thisChar != b.charAt(i+1) && thisChar != '_') {
                    isHappy = false;
                }
            }
            if(thisChar == '_') {
                hasUnderscore = true;
            } else {
                if (!freqMap.containsKey(thisChar)) {
                    freqMap.put(thisChar, 1);
                } else {
                    freqMap.put(thisChar, 2);
                }
            }
        }
        for (Character character : freqMap.keySet()) {
            if(freqMap.get(character).equals(1)) {
                canBeHappy = false;
                break;
            }
        }
        if(!canBeHappy) {
            result = "NO";
        } else if(isHappy) {
            result = "YES";
        } else if(!hasUnderscore) {
            result = "NO";
        }
//        System.out.println("Can be happy: " + canBeHappy);
//        System.out.println("Is happy: " + isHappy);
//        System.out.println("Has underscore: " + hasUnderscore);

        return result;
    }

    public static String happyLadybugs2(String b) {
        // Write your code here
        String areHappy = "YES";
//
        boolean hasUndercore = false;
        boolean hasLonely = false;
        Map<Character, Integer> map = new HashMap<>();
        if (b.length() == 1) {
            if (b.charAt(0) == '_') {
                areHappy = "YES";
            } else {
                areHappy = "NO";
            }
        } else {
            for (int i = 0; i < b.length() - 1; i++) {
                if (b.charAt(i) != '_') {
                    if (b.charAt(i) != b.charAt(i + 1)) {
                        hasLonely = true;
                    }
                    if (!map.containsKey(b.charAt(i))) {
                        map.put(b.charAt(i), 1);
                    } else {
                        map.put(b.charAt(i), map.get(b.charAt(i)) + 1);
                    }

                } else {
                    hasUndercore = true;
                }
            }

            if (b.charAt(b.length() - 1) != b.charAt(b.length() - 2) && b.charAt(b.length() - 1) != '_') {
                hasLonely = true;
            }

            Character lastChar = b.charAt(b.length() - 1);
            if (lastChar != '_') {
                if (!map.containsKey(lastChar)) {
                    map.put(lastChar, 1);
                } else {
                    map.put(lastChar, map.get(lastChar) + 1);
                }
            } else {
                hasUndercore = true;
            }
            boolean hasNoMatch = false;
            for (Character c : map.keySet()) {
                if (map.get(c) == 1) {
                    hasNoMatch = true;
                    break;
                }
//            System.out.println(c + " " + map.get(c));
            }

            if (!hasLonely) {
                areHappy = "YES";
            } else if (hasLonely && !hasUndercore) {
                areHappy = "NO";
            } else if (hasLonely && hasUndercore && !hasNoMatch) {
                areHappy = "YES";
            } else {
                areHappy = "NO";
            }
        }
        return areHappy;
    }

    public static void main(String[] args) {
//        RBY_YBR
//        System.out.println(happyLadybugs("ABA"));
        System.out.println(happyLadybugs("RBY_YBR"));

    }
}
