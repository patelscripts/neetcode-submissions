class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1;
        int minH = Integer.MAX_VALUE;
        int maxArea = Integer.MIN_VALUE;
        while(left < right){
            minH = Math.min(heights[left], heights[right]);
            int area = minH * (right - left);
            maxArea = Math.max(area, maxArea);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
