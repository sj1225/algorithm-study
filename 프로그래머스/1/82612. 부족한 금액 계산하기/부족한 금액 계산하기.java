class Solution {
    public long solution(int price, int money, int count) {
        long paid = 0;
        for(int i=1;i<=count;i++){
            paid += price * i;
        }
        
        return paid > money ? paid - money : 0;
    }
}