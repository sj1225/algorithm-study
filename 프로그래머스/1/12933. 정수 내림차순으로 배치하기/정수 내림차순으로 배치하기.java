class Solution {
    public long solution(long n) {
        String answer = "";
        
        String n2 = "" + n;
        int l = n2.length();
        
        for(int i=9;i>=0;i--){
            int r = l - n2.replace(""+i, "").length();
            answer += (""+i).repeat(r);
        }
        
        return Long.parseLong(answer);
    }
}