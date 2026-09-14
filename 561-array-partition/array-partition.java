class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}