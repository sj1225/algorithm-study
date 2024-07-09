class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for(String i : Integer.toString(x).split("")){
            sum += Integer.parseInt(i);
        }
        
        return x % sum == 0;
    }
}