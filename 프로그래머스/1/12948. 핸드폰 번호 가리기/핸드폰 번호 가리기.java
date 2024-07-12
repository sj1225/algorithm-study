class Solution {
    public String solution(String phone_number) {
        int num = phone_number.length() - 4;
        return "*".repeat(num) + phone_number.substring(num);
    }
}