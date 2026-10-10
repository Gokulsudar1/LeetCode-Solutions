class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        long total = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            total += diff[i];
            max = Math.max(max, diff[i]);
        }

        long k = (long) k1 + k2;
        if (total <= k) return 0;

        int left = 0, right = max;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long need = 0;

            for (int d : diff) {
                if (d > mid) need += d - mid;
            }

            if (need <= k) right = mid;
            else left = mid + 1;
        }

        int level = left;
        long need = 0;
        long ans = 0;

        for (int d : diff) {
            int reduced = Math.min(d, level);
            need += d - reduced;
            ans += (long) reduced * reduced;
        }

        long remaining = k - need;

        for (int d : diff) {
            if (remaining == 0) break;
            if (d >= level && d > 0) {
                ans -= (long) level * level;
                ans += (long) (level - 1) * (level - 1);
                remaining--;
            }
        }
        return ans;
    }
}