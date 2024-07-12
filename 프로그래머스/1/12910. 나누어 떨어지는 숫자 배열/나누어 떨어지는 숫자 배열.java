import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0) temp.add(arr[i]);
        }
        
        int[] temp2 = temp.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(temp2);
                       
        return temp2.length == 0 ? new int[]{-1} : temp2;
    }
}