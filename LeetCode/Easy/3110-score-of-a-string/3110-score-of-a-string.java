class Solution {
    public int scoreOfString(String s) {
        int answer = 0;
        for(int i=0;i<s.length()-1;i++){
            answer += Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
        }
        return answer;
    }
}