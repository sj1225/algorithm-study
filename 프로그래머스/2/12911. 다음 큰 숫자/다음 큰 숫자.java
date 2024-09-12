class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int cnt = Integer.toBinaryString(n).replace("0", "").length();
        int k = n + 1;
        
        while(true){
            if(cnt == Integer.toBinaryString(k).replace("0", "").length()) {
                answer = k;
                break;
            }
            k++;
        }
        
        return answer;
    }
}