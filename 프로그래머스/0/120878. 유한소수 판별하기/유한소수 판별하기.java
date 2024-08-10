class Solution {
    public int solution(int a, int b) {
        // 정수인 경우
        if(a % b == 0) return 1;
        
        // 최대공약수 구하기
        int num1 = a;
        int num2 = b;
        int temp = 0;
        
        while(num2 != 0){
            temp = num1 % num2;
            num1 = num2; // a = b
            num2 = temp; // b = a % b
        }
        
        int gcd = num1;
        
        // 분모의 소인수 구하기
        b = b / gcd;
        int answer = 1;
        for(int i=2;i<=b;i++){
           if(b % i == 0) {
               if(i % 2 == 0 || i % 5 == 0){
                   continue;
               }
               answer = 2;
               break;
           }
        }
        
        return answer;
    }
}