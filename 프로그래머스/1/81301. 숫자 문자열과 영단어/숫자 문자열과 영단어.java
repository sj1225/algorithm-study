import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = s;
        
        String[] words = { "zero", "one", "two", "three", "four",
                           "five", "six", "seven", "eight", "nine" };
        
        for(int i=0;i<=9;i++){
            answer = answer.replace(words[i], Integer.toString(i));
        }
        
        return Integer.valueOf(answer);
    }
}