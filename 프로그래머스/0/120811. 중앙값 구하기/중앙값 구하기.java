import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[Math.round(array.length/2)];
    }
}