class Solution {
    public int trap(int[] height) {
        // point
        int left = 0; int right = height.length - 1;

        int maxLeft = height[left];
        int maxRight = height[right];

        int answer = 0;

        while(left < right) {
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);

            if(maxLeft <= maxRight) {
                answer += maxLeft - height[left];
                left++;
            } else {
                answer += maxRight - height[right];
                right--;
            }
        }

        return answer;
    }
}