class Solution {
    public String solution(String s) {
        int len = s.length();
        String answer = s.substring(len/2+(len%2==0?-1:0),len/2+1);
        return answer;
    }
}