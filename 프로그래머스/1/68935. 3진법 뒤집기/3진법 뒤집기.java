class Solution {
    public int solution(int n) {
        // n을 3진법으로 바꾸기
        int temp = n;
        String trit = "";   // 3진법
        while(temp > 0){
            trit += temp % 3;
            temp = temp / 3;
        }
        
        // 3진법을 10진법으로 바꾸기
        int answer = 0;
        for(int i=1;i<=trit.length();i++){
            answer += Character.getNumericValue(trit.charAt(trit.length() - i)) * Math.pow(3, i-1);
        }
        
        return answer;
    }
}