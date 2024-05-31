class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int chk1 = common[1] - common[0];
        int chk2 = common[2] - common[1];
        
        if(chk1 == chk2){
            answer = common[common.length-1] + chk1;
        } else {
            answer = common[common.length-1] * (common[1]/common[0]);
        }
        
        return answer;
    }
}