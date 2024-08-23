class Solution {
    public String solution(String s) {
        String answer = "";
        boolean odds = true;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                odds = true;
                answer += ' ';
                continue;
            }
            
            answer += odds ? s.substring(i, i+1).toUpperCase() : s.substring(i, i+1).toLowerCase();
            odds = !odds;
        }
        
        return answer;
    }
}