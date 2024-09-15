class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> bannedList = new ArrayList<>(Arrays.asList(banned));

        // 특수문자 제거, 공백 기준 분리
        List<String> words = new ArrayList<>(Arrays.asList(paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ")));
        
        int cnt = -1;
        String answer = "";

        for(String w : words) {
            if(bannedList.contains(w)) continue;

            if(Collections.frequency(words, w) > cnt) {
                cnt = Collections.frequency(words, w);
                answer = w;
            }
        }

        return answer;
    }
}