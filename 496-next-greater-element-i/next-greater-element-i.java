class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        for(int num : nums2){
            while(!stk.isEmpty() && stk.peek() < num){
                map.put(stk.pop(), num);
            }
            stk.push(num);
        }
        int [] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}