class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long paid = 0;
        for(int i=1;i<=count;i++){
            paid += price * i;
        }
        
        if(paid > money){
            answer = paid - money;
        }
        
        return answer;
    }
}