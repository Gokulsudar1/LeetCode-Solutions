class Solution {
    public void moveZeroes(int[] nums)
    {
        int n = nums.length;
        for(int i=0;i<n;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]==0 && nums[j+1]!=0){
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