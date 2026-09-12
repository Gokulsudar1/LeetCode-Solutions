class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j+1]<nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                    swap = true;
                }
            }
            if(!swap) break;
        }
    }
}