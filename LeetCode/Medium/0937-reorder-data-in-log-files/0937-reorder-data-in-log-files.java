class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        // 1. letter-logs > digit-logs
        for(String log : logs){
            if(Character.isDigit(log.split(" ")[1].charAt(0))){
                digitList.add(log);
            } else {
                letterList.add(log);
            }
        }

        // 2. sort letter-logs
        letterList.sort((d1, d2) -> {
            String[] l1 = d1.split(" ", 2);
            String[] l2 = d2.split(" ", 2);

            int compared = l1[1].compareTo(l2[1]);

            // if content is same...
            if(compared == 0) {
                return l1[0].compareTo(l2[0]);
            } else {
                return compared;
            }
        });

        // 3. list merge
        letterList.addAll(digitList);

        return letterList.toArray(new String[0]);
    }
}