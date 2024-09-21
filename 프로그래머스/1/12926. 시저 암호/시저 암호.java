class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char c : s.toCharArray()){
            if(c == ' ') answer += c;
            else {
                int ascii = (int) c + n;
                answer += (char)(ascii > (c <= 'Z' ? 90 : 122) ? ascii - 26 : ascii);
            }
        }
        
        return answer;
    }
}