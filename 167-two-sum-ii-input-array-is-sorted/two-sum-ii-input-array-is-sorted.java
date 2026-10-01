class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int sum = 0;
        while(left < right){
            sum = nums[left]+nums[right];
            if(sum == target) return new int[]{left+1 , right+1};
            else if(sum > target) right--;
            else left++;
        }
        return new int[]{};
    }
}