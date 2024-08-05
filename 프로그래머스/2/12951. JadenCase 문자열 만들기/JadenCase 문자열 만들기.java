class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = s.toLowerCase().split("");
        boolean isUpper = true;
        
        for(String a : arr){
            if(a.trim().length() == 0) {
                answer += a;
                isUpper = true;
                continue;
            }
            
            answer += isUpper ? a.toUpperCase() : a;
            isUpper = false;
        }
        
        return answer;
    }
}