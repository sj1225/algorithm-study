class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int lenT = t.length();
        int lenP = p.length();
        long numberP = Long.parseLong(p);
        
        int idx = 0;
        while(idx + lenP <= lenT) {
            if(Long.parseLong(t.substring(idx, idx + lenP)) <= numberP) answer++;
            idx++;
        }
        
        return answer;
    }
}