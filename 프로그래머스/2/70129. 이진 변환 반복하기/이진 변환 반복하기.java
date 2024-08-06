class Solution {
    public int[] solution(String s) {
        int reps = 0;               // 이진 변환의 횟수
        int deleted_zero_cnt = 0;   // 변환 과정에서 제거된 모든 0의 개수
        
        while(!s.equals("1")) {
            reps++;
            
            // 1. 0 제거
            deleted_zero_cnt += s.length() - s.replace("0", "").length();
            s = s.replace("0", "");
            
            // 2. 문자열의 길이를 2진법으로 표현
            int c = s.length();
            s = Integer.toBinaryString(c);
        }
        
        return new int[] {reps, deleted_zero_cnt};
    }
}