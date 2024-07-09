class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for(String i : Integer.toString(x).split("")){
            sum += Integer.parseInt(i);
        }
        
        if(x % sum == 0){
            return true;
        }
        
        return false;
    }
}