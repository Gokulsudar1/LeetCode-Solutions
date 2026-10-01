class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            if(height[left] < height[right]){
                res = Math.max(height[left]*(right-left), res);
                left++;
            }
            else {
                res = Math.max(height[right]*(right-left), res);
                right--;
            }
        }
        return res;
    }
}