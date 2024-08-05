import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        
        A = Arrays.stream(A).sorted().toArray();
        B = Arrays.stream(B).sorted().toArray();
        
        for(int i=0;i<A.length;i++) {
            answer += A[i] * B[A.length - i - 1];
        }
        
        return answer;
    }
}