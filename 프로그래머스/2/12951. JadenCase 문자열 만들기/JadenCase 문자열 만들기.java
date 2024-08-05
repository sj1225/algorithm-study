class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = s.toLowerCase().split("");
        boolean isUpper = true;
        
        for(String a : arr){
            answer += isUpper ? a.toUpperCase() : a;
            isUpper = (a.trim().length() == 0) ? true : false;
        }
        
        return answer;
    }
}